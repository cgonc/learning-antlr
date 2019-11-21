package com.poc.chapter_07_part03_a.impl;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import com.poc.chapter_07_part03_a.grammar.Calc1ExBaseListener;
import com.poc.chapter_07_part03_a.grammar.Calc1ExParser;

public class Calc1ImplParseTreeProperty extends Calc1ExBaseListener {

	private ParseTreeProperty<Integer> expresionParseProperties = new ParseTreeProperty<>();

	@Override
	public void exitResult(Calc1ExParser.ResultContext ctx) {
		setValue(ctx, getValue(ctx.expression()));
	}

	@Override
	public void exitAdd(Calc1ExParser.AddContext ctx) {
		Integer valueOperandNodeA = getValue(ctx.expression(0));
		Integer valueOperandNodeB = getValue(ctx.expression(1));
		setValue(ctx, valueOperandNodeA + valueOperandNodeB);
	}

	@Override
	public void exitMult(Calc1ExParser.MultContext ctx) {
		Integer valueOperandNodeA = getValue(ctx.expression(0));
		Integer valueOperandNodeB = getValue(ctx.expression(1));
		setValue(ctx, valueOperandNodeA * valueOperandNodeB);
	}

	@Override
	public void exitInt(Calc1ExParser.IntContext ctx) {
		Integer intValue = Integer.valueOf(ctx.INT().getText());
		setValue(ctx, intValue);
	}

	private void setValue(ParseTree node, Integer value) {
		expresionParseProperties.put(node, value);
	}

	public Integer getValue(ParseTree node) {
		return expresionParseProperties.get(node);
	}
}
