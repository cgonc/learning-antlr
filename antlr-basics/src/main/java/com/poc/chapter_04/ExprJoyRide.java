package com.poc.chapter_04;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.poc.chapter_03_3_4.test.TranslateLanguageApplication;
import com.poc.chapter_04.gen.LibExprLexer;
import com.poc.chapter_04.gen.LibExprParser;

public class ExprJoyRide {

	public static void main(String[] args) throws URISyntaxException, IOException {
		URL resource = TranslateLanguageApplication.class.getClassLoader()
														 .getResource("ExprJoyRide.expr");
		assert resource != null;
		File file = Paths.get(resource.toURI())
						 .toFile();
		LibExprLexer libExprLexer = new LibExprLexer(CharStreams.fromFileName(file.getAbsolutePath()));
		CommonTokenStream tokens = new CommonTokenStream(libExprLexer);
		LibExprParser libExprParser = new LibExprParser(tokens);
		ParseTree tree = libExprParser.program();
		System.out.println(tree.toStringTree(libExprParser));
	}
}
