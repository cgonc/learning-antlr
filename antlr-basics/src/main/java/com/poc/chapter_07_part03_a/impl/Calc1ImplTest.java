package com.poc.chapter_07_part03_a.impl;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.poc.chapter_07_part03_a.grammar.Calc1ExLexer;
import com.poc.chapter_07_part03_a.grammar.Calc1ExParser;

public class Calc1ImplTest {

	public static void main(String[] args) {
		Calc1ExLexer calc1ExLexer = new Calc1ExLexer(CharStreams.fromString("1+3*5+10"));
		CommonTokenStream commonTokenStream = new CommonTokenStream(calc1ExLexer);
		Calc1ExParser calc1ExParser = new Calc1ExParser(commonTokenStream);
		ParseTree fromTopParseTree = calc1ExParser.result();
		String parseTreeStr = fromTopParseTree.toStringTree(calc1ExParser);
		System.out.println(parseTreeStr);

		Calc1ImplVisitor calc1ImplVisitor = new Calc1ImplVisitor();
		Integer result = calc1ImplVisitor.visit(fromTopParseTree);
		System.out.println("result from visitor  " + result);

		ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
		Calc1ImplListener calc1ImplListener = new Calc1ImplListener();
		parseTreeWalker.walk(calc1ImplListener, fromTopParseTree);
		System.out.println("result from listener " + calc1ImplListener.getResult());

		Calc1ImplParseTreeProperty calc1ImplParseTreeProperty = new Calc1ImplParseTreeProperty();
		parseTreeWalker.walk(calc1ImplParseTreeProperty, fromTopParseTree);
		Integer resultFromPropertyListener = calc1ImplParseTreeProperty.getValue(fromTopParseTree);
		System.out.println("result from property listener " + resultFromPropertyListener);
	}
}
