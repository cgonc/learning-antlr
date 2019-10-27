package com.poc.chapter_03_3_1.test;

import com.poc.chapter_03_3_1.lang.ArrayInitLexer;
import com.poc.chapter_03_3_1.lang.ArrayInitParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class Test01ArrayInit {
    public static void main(String[] args) throws IOException, URISyntaxException {
        URL resource = Test01ArrayInit.class.getClassLoader().getResource("Test01.arrayinit");
        assert resource != null;
        File file = Paths.get(resource.toURI()).toFile();
        ArrayInitLexer lexer = new ArrayInitLexer(CharStreams.fromFileName(file.getAbsolutePath()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokens);

        ParseTree tree = parser.init();
        System.out.println("tree = " + tree.toStringTree(parser));

    }
}
