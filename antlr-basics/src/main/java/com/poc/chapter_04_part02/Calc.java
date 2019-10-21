package com.poc.chapter_04_part02;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.poc.chapter_03_3_4.test.TranslateLanguageApplication;
import com.poc.chapter_04_part02.gen.LabeledExprLexer;
import com.poc.chapter_04_part02.gen.LabeledExprParser;
import com.poc.chapter_04_part02.impl.EvalVisitor;

public class Calc {

	public static void main(String[] args) throws URISyntaxException, IOException {
		URL resource = TranslateLanguageApplication.class.getClassLoader().getResource("Calc.LabeledExpr");
		assert resource != null;
		File file = Paths.get(resource.toURI()).toFile();
		LabeledExprLexer labeledExprLexer = new LabeledExprLexer(CharStreams.fromFileName(file.getAbsolutePath()));
		CommonTokenStream commonTokenStream = new CommonTokenStream(labeledExprLexer);
		LabeledExprParser labeledExprParser = new LabeledExprParser(commonTokenStream);
		ParseTree parseTree = labeledExprParser.prog();

		EvalVisitor eval = new EvalVisitor();
		eval.visit(parseTree);
		System.out.println("final memory = " + eval.getMemory());
	}
}
