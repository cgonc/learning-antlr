package com.poc.chapter_04_part03.translater;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.poc.chapter_03_3_4.test.TranslateLanguageApplication;
import com.poc.chapter_04_part03.gen.JavaLexer;
import com.poc.chapter_04_part03.gen.JavaParser;

public class TranslaterMain {

	public static void main(String[] args) throws URISyntaxException, IOException {
		URL resource = TranslateLanguageApplication.class.getClassLoader().getResource("TranslaterMain.java");
		assert resource != null;
		File file = Paths.get(resource.toURI()).toFile();
		JavaLexer javaLexer = new JavaLexer(CharStreams.fromFileName(file.getAbsolutePath()));
		CommonTokenStream commonTokenStream = new CommonTokenStream(javaLexer);
		JavaParser javaParser = new JavaParser(commonTokenStream);
		ParseTree parseTree = javaParser.compilationUnit();

		ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
		ExtractInterfaceListener extractInterfaceListener = new ExtractInterfaceListener(javaParser);
		parseTreeWalker.walk(extractInterfaceListener, parseTree);
		System.out.println("result = " + extractInterfaceListener.getResult());
	}

}
