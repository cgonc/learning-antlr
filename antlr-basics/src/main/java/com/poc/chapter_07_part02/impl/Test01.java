package com.poc.chapter_07_part02.impl;

import com.poc.chapter_07_part02.grammar.ExprLexer;
import com.poc.chapter_07_part02.grammar.ExprParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test01 {

    public static void main(String[] args) {
        ExprLexer exprLexer = new ExprLexer(CharStreams.fromString("1+3*5*10+7*10"));
        CommonTokenStream commonTokenStream = new CommonTokenStream(exprLexer);
        ExprParser exprParser = new ExprParser(commonTokenStream);
        ParseTree parseTree = exprParser.s();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        ExpressionEvaluaterListener expressionEvaluaterListener = new ExpressionEvaluaterListener();
        parseTreeWalker.walk(expressionEvaluaterListener, parseTree);
        System.out.println("result = " + expressionEvaluaterListener.getResult());
    }
}
