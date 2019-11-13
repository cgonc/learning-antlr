package com.poc.chapter_07_part01.impl;

import java.util.HashMap;
import java.util.Map;

import com.poc.chapter_07_part01.gen.PropertyFileBaseVisitor;
import com.poc.chapter_07_part01.gen.PropertyFileParser;

public class PropertyFileVisitor extends PropertyFileBaseVisitor<Void> {

	private Map<String,String> props = new HashMap<>();

	public Void visitProp(PropertyFileParser.PropContext ctx) {
		String id = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;
		String value = ctx.STRING().getText();
		props.put(id, value);
		return null; // Java says must return something even when Void
	}

	public Map<String, String> getProps() {
		return props;
	}
}
