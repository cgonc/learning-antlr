package com.poc.chapter_08_part04;

import com.poc.chapter_08_part02.JsonToXmlImpl;
import com.poc.chapter_08_part03.gen.CymbolCallGraphLexer;
import com.poc.chapter_08_part03.gen.CymbolCallGraphParser;
import com.poc.chapter_08_part04.listeners.DefPhase;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class ValidatorTest {
    public static void main(String[] args) throws IOException, URISyntaxException {
        URL resource = JsonToXmlImpl.class.getClassLoader().getResource("ValidatorTest.CymbolCallGraph");
        assert resource != null;
        File file = Paths.get(resource.toURI()).toFile();
        CymbolCallGraphLexer cymbolCallGraphLexer = new CymbolCallGraphLexer(CharStreams.fromFileName(file.getAbsolutePath()));
        CommonTokenStream commonTokenStream = new CommonTokenStream(cymbolCallGraphLexer);
        CymbolCallGraphParser cymbolCallGraphParser = new CymbolCallGraphParser(commonTokenStream);
        cymbolCallGraphParser.setBuildParseTree(true);
        ParseTree parseTree = cymbolCallGraphParser.file();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        DefPhase defPhase = new DefPhase();
        parseTreeWalker.walk(defPhase, parseTree);
        // create next phase and feed symbol table info from def to ref phase

    }
}
