package com.poc.chapter_04_part02.impl;

import java.util.HashMap;
import java.util.Map;

import com.poc.chapter_04_part02.gen.LabeledExprBaseVisitor;
import com.poc.chapter_04_part02.gen.LabeledExprParser;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {

	//For storing assignments then we can use assigned values in our calculations
	private Map<String, Integer> memory = new HashMap<>();

	// ID = expr NEWLINE
	@Override
	public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
		String id = ctx.ID().getText();  //ID sol tarafta text olarak alınabilecek birşey
		Integer expressionValue = visit(ctx.expr()); // Sağ taraftaki expr evaluate etmek için visit fonksiyonu kullanılıyor.
		memory.put(id, expressionValue); //Bu assignmentı memorye kayıt ediyoruz.
		return 0; // Assignmentın matematiksel bir değeri olmadığı için 0 dönüyoruz.
	}

	// expr NEWLINE
	@Override
	public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
		Integer expressionValue = visit(ctx.expr());
		System.out.println("Expression evaluated  = " + expressionValue);
		return expressionValue;
	}

	// INT
	@Override
	public Integer visitInt(LabeledExprParser.IntContext ctx) {
		return Integer.valueOf(ctx.INT().getText());
	}

	// ID
	@Override
	public Integer visitId(LabeledExprParser.IdContext ctx) {
		String id = ctx.ID().getText();
		if(memory.containsKey(id)){
			return memory.get(id);
		} else {
			throw new RuntimeException(String.format("The variable %s can not be evaluated.", id));
		}
	}

	// expr op=('*'|'/') expr
	@Override
	public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
		Integer left = visit(ctx.expr(0)); // get value of left subexpression
		Integer right = visit(ctx.expr(1)); // get value of right subexpression
		if(ctx.op.getType() == LabeledExprParser.MUL){
			return left * right;
		} else {
			return left / right; // must be DIV
		}
	}

	// expr op=('+'|'-') expr
	@Override
	public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
		Integer left = visit(ctx.expr(0)); // get value of left subexpression
		Integer right = visit(ctx.expr(1)); // get value of right subexpression
		if(ctx.op.getType() == LabeledExprParser.ADD){
			return left + right;
		} else {
			return left - right; // must be SUB
		}
	}

	// '(' expr ')'
	@Override
	public Integer visitParens(LabeledExprParser.ParensContext ctx) {
		return visit(ctx.expr()); // return child expr's value
	}

	// clear
	@Override
	public Integer visitClear(LabeledExprParser.ClearContext ctx) {
		System.out.println("The current sate of the memory : " + memory.toString() + " and it has been cleared.");
		memory.clear();
		return 0;
	}

	public Map<String, Integer> getMemory() {
		return memory;
	}
}
