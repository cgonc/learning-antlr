package com.antlr.interpreter.test;

import com.antlr.interpreter.InterpreterLexer;
import com.antlr.interpreter.InterpreterParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class TestInterpreter {

    public static void main(String[] args) {
        InterpreterLexer lexer = new InterpreterLexer(CharStreams.fromString("1+2+566"));
        InterpreterParser parser = new InterpreterParser(new CommonTokenStream(lexer));
        parser.start();
        System.out.println("My parser has executed Order 66");
    }
}
