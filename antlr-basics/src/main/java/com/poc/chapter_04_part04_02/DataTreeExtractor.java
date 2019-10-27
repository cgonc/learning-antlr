package com.poc.chapter_04_part04_02;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.poc.chapter_04_part04_02.gen.DataLexer;
import com.poc.chapter_04_part04_02.gen.DataParser;

public class DataTreeExtractor {

	public static void main(String[] args) {
		DataLexer dataLexer = new DataLexer(CharStreams.fromString("2 10 9 3 5 6 7 4 1 2 3 4"));
		CommonTokenStream commonTokenStream = new CommonTokenStream(dataLexer);
		DataParser dataParser = new DataParser(commonTokenStream);

		ParseTree tree = dataParser.file();
		System.out.println("data tree = " + tree.toStringTree(dataParser));
	}
}
