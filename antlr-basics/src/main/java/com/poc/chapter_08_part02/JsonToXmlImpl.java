package com.poc.chapter_08_part02;

import com.poc.chapter_08_part02.gen.JSONForXmlConversionLexer;
import com.poc.chapter_08_part02.gen.JSONForXmlConversionParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class JsonToXmlImpl {

    public static void main(String[] args) throws URISyntaxException, IOException {
        URL resource = JsonToXmlImpl.class.getClassLoader().getResource("JsonToXmlImpl.JSONForXmlConversion");
        assert resource != null;
        File file = Paths.get(resource.toURI()).toFile();
        JSONForXmlConversionLexer jsonForXmlConversionLexer = new JSONForXmlConversionLexer(CharStreams.fromFileName(file.getAbsolutePath()));
        CommonTokenStream commonTokenStream = new CommonTokenStream(jsonForXmlConversionLexer);
        JSONForXmlConversionParser jsonForXmlConversionParser = new JSONForXmlConversionParser(commonTokenStream);
        ParseTree parseTree = jsonForXmlConversionParser.json();

        ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
        JsonToXmlListener jsonToXmlListener = new JsonToXmlListener();
        parseTreeWalker.walk(jsonToXmlListener, parseTree);
        String xml = jsonToXmlListener.getXml(parseTree);

        String formattedXML = jsonToXmlListener.format(xml);
        System.out.println("Conversion result  = \n" + formattedXML);
    }
}
