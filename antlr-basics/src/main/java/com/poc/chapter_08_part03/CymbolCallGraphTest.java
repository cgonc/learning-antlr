package com.poc.chapter_08_part03;

import com.poc.chapter_08_part02.JsonToXmlImpl;
import com.poc.chapter_08_part03.gen.CymbolCallGraphLexer;
import com.poc.chapter_08_part03.gen.CymbolCallGraphParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class CymbolCallGraphTest {

    public static void main(String[] args) throws URISyntaxException, IOException {
        URL resource = JsonToXmlImpl.class.getClassLoader().getResource("TestCallGraph.CymbolCallGraph");
        assert resource != null;
        File file = Paths.get(resource.toURI()).toFile();
        CymbolCallGraphLexer cymbolCallGraphLexer = new CymbolCallGraphLexer(CharStreams.fromFileName(file.getAbsolutePath()));
        CommonTokenStream commonTokenStream = new CommonTokenStream(cymbolCallGraphLexer);
        CymbolCallGraphParser cymbolCallGraphParser = new CymbolCallGraphParser(commonTokenStream);
        cymbolCallGraphParser.setBuildParseTree(true);
        ParseTree parseTree = cymbolCallGraphParser.file();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        FunctionListener functionListener = new FunctionListener();
        parseTreeWalker.walk(functionListener, parseTree);
        String resultingDotFile = functionListener.getGraph().toDOT();

        System.out.println("resultingDotFile = " + resultingDotFile);
        String resultingDotFileFromStringTemplate = functionListener.getGraph().toST().render();
        System.out.println("resultingDotFileFromStringTemplate = " + resultingDotFileFromStringTemplate);
    }

}
