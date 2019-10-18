package com.poc.chapter_03_3_4.test;

import com.poc.chapter_03_3_4.gen.ArrayInitLexer;
import com.poc.chapter_03_3_4.gen.ArrayInitParser;
import com.poc.chapter_03_3_4.impl.ShortToUnicodeString;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class TranslateLanguageApplication {
    public static void main(String[] args) throws URISyntaxException, IOException {
        URL resource = TranslateLanguageApplication.class.getClassLoader().getResource("TranslateLanguageApplication.arrayinit");
        assert resource != null;
        File file = Paths.get(resource.toURI()).toFile();
        ArrayInitLexer lexer = new ArrayInitLexer(CharStreams.fromFileName(file.getAbsolutePath()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokens);
        ParseTree tree = parser.init();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShortToUnicodeString(), tree);
        System.out.println();

    }
}
