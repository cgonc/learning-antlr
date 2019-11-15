package com.poc.chapter_07_part02.impl;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import com.poc.chapter_07_part02.grammar.ExprBaseListener;
import com.poc.chapter_07_part02.grammar.ExprParser;

public class ExpressionEvaluaterListener extends ExprBaseListener {

	private ParseTreeProperty<Integer> values = new ParseTreeProperty<>();
    private Integer topNodeValue = 0;

    @Override public void exitS(ExprParser.SContext ctx) {
        setValue(ctx, getValue(ctx.e()));
        topNodeValue = getValue(ctx.e());
    }

	@Override
	public void exitAdd(ExprParser.AddContext ctx) {
        int left = getValue(ctx.e(0)); // e '+' e   # Add
        int right = getValue(ctx.e(1));
        setValue(ctx, left + right);
	}

	@Override
	public void exitMult(ExprParser.MultContext ctx) {
        int left = getValue(ctx.e(0));  // e '*' e   # Mult
        int right = getValue(ctx.e(1));
        setValue(ctx, left * right);
	}

	@Override
	public void exitInt(ExprParser.IntContext ctx) {
        String intText = ctx.INT().getText(); // INT   # Int
        setValue(ctx, Integer.parseInt(intText));
	}

	public void setValue(ParseTree node, int value) {
		values.put(node, value);
	}

	public int getValue(ParseTree node) {
		return values.get(node);
	}

	public int getResult() {
        return topNodeValue;
    }
}
