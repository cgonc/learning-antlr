package com.poc.chapter_04_part04_01;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.poc.chapter_03_3_4.test.TranslateLanguageApplication;
import com.poc.chapter_04_part04_01.gen.RowsLexer;
import com.poc.chapter_04_part04_01.gen.RowsParser;

public class RowColumExtractor {

	public static void main(String[] args) throws URISyntaxException, IOException {
		URL resource = TranslateLanguageApplication.class.getClassLoader().getResource("RowColumExtractor.rows");
		assert resource != null;
		File file = Paths.get(resource.toURI()).toFile();
		RowsLexer rowsLexer = new RowsLexer(CharStreams.fromFileName(file.getAbsolutePath()));
		CommonTokenStream tokens = new CommonTokenStream(rowsLexer);
		RowsParser rowsParser = new RowsParser(tokens, 3);
		rowsParser.setBuildParseTree(false);
		rowsParser.file();
	}
}
