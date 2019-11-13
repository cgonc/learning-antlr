package com.poc.chapter_07_part02.impl;

import com.poc.chapter_07_part02.grammar.ExprBaseListener;
import com.poc.chapter_07_part02.grammar.ExprParser;

public class ExpressionEvaluaterListener extends ExprBaseListener {

	private Integer value = 0;

	@Override
	public void enterAdd(ExprParser.AddContext ctx) {

	}

}
