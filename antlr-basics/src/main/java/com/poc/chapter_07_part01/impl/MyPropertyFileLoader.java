package com.poc.chapter_07_part01.impl;

import java.util.HashMap;
import java.util.Map;

import com.poc.chapter_07_part01.gen.PropertyFileBaseListener;
import com.poc.chapter_07_part01.gen.PropertyFileParser;

public class MyPropertyFileLoader extends PropertyFileBaseListener {

	private Map<String, String> properties;

	@Override
	public void enterProp(PropertyFileParser.PropContext ctx) {
		String propertyKey = ctx.ID().getText();
		String propertyValue = ctx.STRING().getText();
		properties.put(propertyKey, propertyValue);
	}

	public MyPropertyFileLoader() {
		properties = new HashMap<>();
	}

	public Map<String, String> getProperties() {
		return properties;
	}
}
