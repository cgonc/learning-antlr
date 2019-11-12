package com.poc.chapter_07_part01.impl;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Arrays;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.poc.chapter_03_3_4.test.TranslateLanguageApplication;
import com.poc.chapter_07_part01.gen.PropertyFileLexer;
import com.poc.chapter_07_part01.gen.PropertyFileParser;

public class Test01 {

	public static void main(String[] args) throws URISyntaxException, IOException {
		URL resource = TranslateLanguageApplication.class.getClassLoader().getResource("Test01.PropertyFile");
		assert resource != null;
		File file = Paths.get(resource.toURI()).toFile();
		PropertyFileLexer propertyFileLexer = new PropertyFileLexer(CharStreams.fromFileName(file.getAbsolutePath()));
		CommonTokenStream commonTokenStream = new CommonTokenStream(propertyFileLexer);

		PropertyFileParser propertyFileParser = new PropertyFileParser(commonTokenStream);
		ParseTree parseTree = propertyFileParser.file();

		//Listener kodunu çağırma biçimin.
		ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
		MyPropertyFileLoader myPropertyFileLoader = new MyPropertyFileLoader();
		parseTreeWalker.walk(myPropertyFileLoader, parseTree);

		System.out.println("loaded properties = " + myPropertyFileLoader.getProperties());
	}
}
