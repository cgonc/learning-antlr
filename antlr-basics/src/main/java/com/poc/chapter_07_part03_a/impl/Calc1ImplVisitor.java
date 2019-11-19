package com.poc.chapter_07_part03_a.impl;

import com.poc.chapter_07_part03_a.grammar.Calc1ExBaseVisitor;
import com.poc.chapter_07_part03_a.grammar.Calc1ExParser;

public class Calc1ImplVisitor extends Calc1ExBaseVisitor<Integer> {

	@Override
	public Integer visitAdd(Calc1ExParser.AddContext ctx) {
		return visit(ctx.expression(0)) + visit(ctx.expression(1));
	}

	@Override
	public Integer visitMult(Calc1ExParser.MultContext ctx) {
		return visit(ctx.expression(0)) * visit(ctx.expression(1));
	}

	@Override
	public Integer visitInt(Calc1ExParser.IntContext ctx) {
		return Integer.valueOf(ctx.INT().getText());
	}

}
