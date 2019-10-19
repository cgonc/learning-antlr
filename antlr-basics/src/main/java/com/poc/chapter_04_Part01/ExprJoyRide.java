package com.poc.chapter_04_Part01;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.poc.chapter_03_3_4.test.TranslateLanguageApplication;
import com.poc.chapter_04_Part01.gen.ExprLexer;
import com.poc.chapter_04_Part01.gen.ExprParser;

public class ExprJoyRide {

	public static void main(String[] args) throws URISyntaxException, IOException {
		URL resource = TranslateLanguageApplication.class.getClassLoader().getResource("ExprJoyRide.expr");
		assert resource != null;
		File file = Paths.get(resource.toURI()).toFile();
		ExprLexer exprLexer = new ExprLexer(CharStreams.fromFileName(file.getAbsolutePath()));
		CommonTokenStream tokens = new CommonTokenStream(exprLexer);
		ExprParser parser = new ExprParser(tokens);
		ParseTree tree = parser.prog();
		System.out.println(tree.toStringTree(parser));
	}
}
