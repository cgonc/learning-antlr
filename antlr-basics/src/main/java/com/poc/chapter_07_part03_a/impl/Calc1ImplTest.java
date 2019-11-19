package com.poc.chapter_07_part03_a.impl;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.poc.chapter_07_part03_a.grammar.Calc1ExLexer;
import com.poc.chapter_07_part03_a.grammar.Calc1ExParser;

public class Calc1ImplTest {

	public static void main(String[] args) {
		Calc1ExLexer calc1ExLexer = new Calc1ExLexer(CharStreams.fromString("1+3*5+10"));
		CommonTokenStream commonTokenStream = new CommonTokenStream(calc1ExLexer);
		Calc1ExParser calc1ExParser = new Calc1ExParser(commonTokenStream);
		ParseTree fromTopParseTree = calc1ExParser.result();

		Calc1ImplVisitor calc1ImplVisitor = new Calc1ImplVisitor();
		Integer result = calc1ImplVisitor.visit(fromTopParseTree);
		System.out.println("result  " + result);
	}
}
