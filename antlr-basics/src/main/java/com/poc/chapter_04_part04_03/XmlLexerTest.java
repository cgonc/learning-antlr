package com.poc.chapter_04_part04_03;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import com.poc.chapter_04_part04_03.gen.XMLLexer;

public class XmlLexerTest {

	public static void main(String[] args) throws URISyntaxException, IOException {
		URL resource = XmlLexerTest.class.getClassLoader().getResource("XmlLexerTest.XMLLexer");
		assert resource != null;
		File file = Paths.get(resource.toURI()).toFile();
		XMLLexer xmlLexer = new XMLLexer(CharStreams.fromFileName(file.getAbsolutePath()));
		Token token = xmlLexer.nextToken();
		while(token.getType() != XMLLexer.EOF){
			System.out.println(token);
			token = xmlLexer.nextToken();
		}
		System.out.println(token);
	}
}
