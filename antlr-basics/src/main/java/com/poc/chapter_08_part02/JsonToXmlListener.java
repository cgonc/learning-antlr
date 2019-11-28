package com.poc.chapter_08_part02;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilderFactory;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.InputSource;

import com.poc.chapter_08_part02.gen.JSONForXmlConversionBaseListener;
import com.poc.chapter_08_part02.gen.JSONForXmlConversionParser;

public class JsonToXmlListener extends JSONForXmlConversionBaseListener {

	private ParseTreeProperty<String> xml;

	public JsonToXmlListener() {
		xml = new ParseTreeProperty<>();
	}

	private String stripQuotes(String originalString) {
		return originalString.substring(1, originalString.length() - 1);
	}

	public String format(String xml) {

		try{
			final InputSource src = new InputSource(new StringReader(xml));
			final Node document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src).getDocumentElement();
			final Boolean keepDeclaration = xml.startsWith("<?xml");

			//May need this: System.setProperty(DOMImplementationRegistry.PROPERTY,"com.sun.org.apache.xerces.internal.dom.DOMImplementationSourceImpl");

			final DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
			final DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
			final LSSerializer writer = impl.createLSSerializer();

			writer.getDomConfig().setParameter("format-pretty-print", Boolean.TRUE); // Set this to true if the output needs to be beautified.
			writer.getDomConfig().setParameter("xml-declaration", keepDeclaration); // Set this to true if the declaration is needed to be outputted.

			return writer.writeToString(document);
		} catch (Exception e){
			return xml;
		}
	}

	@Override
	public void exitAtom(JSONForXmlConversionParser.AtomContext ctx) {
		setXml(ctx, ctx.getText());
	}

	@Override
	public void exitString(JSONForXmlConversionParser.StringContext ctx) {
		setXml(ctx, stripQuotes(ctx.STRING().getText()));
	}

	@Override
	public void exitObjectValue(JSONForXmlConversionParser.ObjectValueContext ctx) {
		setXml(ctx, getXml(ctx.object()));
	}

	@Override
	public void exitPair(JSONForXmlConversionParser.PairContext ctx) {
		String tag = stripQuotes(ctx.STRING().getText());
		String value = getXml(ctx.value());
		String pairXmString = String.format("\t<%s>%s</%s>\n", tag, value, tag);
		setXml(ctx, pairXmString);
	}

	@Override
	public void exitAnObject(JSONForXmlConversionParser.AnObjectContext ctx) {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		for(JSONForXmlConversionParser.PairContext pairContext : ctx.pair()){
			sb.append(getXml(pairContext));
		}
		setXml(ctx, sb.toString());
	}

	@Override
	public void exitEmptyObject(JSONForXmlConversionParser.EmptyObjectContext ctx) {
		setXml(ctx, "");
	}

	@Override
	public void exitArrayOfValues(JSONForXmlConversionParser.ArrayOfValuesContext ctx) {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		for(JSONForXmlConversionParser.ValueContext valueContext : ctx.value()){
			sb.append("<element>");
			sb.append(getXml(valueContext));
			sb.append("</element>");
			sb.append("\n");
		}
		setXml(ctx, sb.toString());
	}

	@Override
	public void exitEmptyArray(JSONForXmlConversionParser.EmptyArrayContext ctx) {
		setXml(ctx, "");
	}

	@Override
	public void exitArrayValue(JSONForXmlConversionParser.ArrayValueContext ctx) {
		setXml(ctx, getXml(ctx.array()));
	}

	@Override
	public void exitJson(JSONForXmlConversionParser.JsonContext ctx) {
		setXml(ctx, String.format("<document>%s</document>", getXml(ctx.getChild(0))));
	}

	public String getXml(ParseTree ctx) {
		return xml.get(ctx);
	}

	public void setXml(ParseTree ctx, String string) {
		xml.put(ctx, string);
	}
}
