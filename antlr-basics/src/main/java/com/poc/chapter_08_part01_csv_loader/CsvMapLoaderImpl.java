package com.poc.chapter_08_part01_csv_loader;

import com.poc.chapter_03_3_4.test.TranslateLanguageApplication;
import com.poc.chapter_08_part01_csv_loader.gen.CSVLoaderMapLexer;
import com.poc.chapter_08_part01_csv_loader.gen.CSVLoaderMapParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class CsvMapLoaderImpl {

    public static void main(String[] args) throws URISyntaxException, IOException {
        URL resource = TranslateLanguageApplication.class.getClassLoader().getResource("CSVFile.CSVLoaderMap");
        assert resource != null;
        File file = Paths.get(resource.toURI()).toFile();
        CSVLoaderMapLexer csvLoaderMapLexer = new CSVLoaderMapLexer(CharStreams.fromFileName(file.getAbsolutePath()));
        CommonTokenStream commonTokenStream = new CommonTokenStream(csvLoaderMapLexer);

        CSVLoaderMapParser csvLoaderMapParser = new CSVLoaderMapParser(commonTokenStream);
        ParseTree parseTree = csvLoaderMapParser.file();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        CSVLoaderMapBasedListenerImpl csvLoaderMapBasedListener = new CSVLoaderMapBasedListenerImpl();
        parseTreeWalker.walk(csvLoaderMapBasedListener, parseTree);
        System.out.println("Loaded CSV Map = " + csvLoaderMapBasedListener.getCsvMap());

    }
}
