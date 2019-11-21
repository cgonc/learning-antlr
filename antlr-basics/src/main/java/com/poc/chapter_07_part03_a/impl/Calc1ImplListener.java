package com.poc.chapter_07_part03_a.impl;

import java.util.Stack;

import com.poc.chapter_07_part03_a.grammar.Calc1ExBaseListener;
import com.poc.chapter_07_part03_a.grammar.Calc1ExParser;

public class Calc1ImplListener extends Calc1ExBaseListener {

	private Stack<Integer> calculationStack = new Stack<>();
	private Integer result;

	@Override
	public void exitResult(Calc1ExParser.ResultContext ctx) {
		result = calculationStack.pop();
		if(calculationStack.size() != 0) {
			throw new RuntimeException("Something is wrong. Unexpected stack size during calculation");
		}
	}

	@Override
	public void exitAdd(Calc1ExParser.AddContext ctx) {
		Integer operandA = calculationStack.pop();
		Integer operandB = calculationStack.pop();
		calculationStack.push(operandA + operandB);
	}

	@Override
	public void exitMult(Calc1ExParser.MultContext ctx) {
		Integer operandA = calculationStack.pop();
		Integer operandB = calculationStack.pop();
		calculationStack.push(operandA * operandB);

	}

	@Override
	public void exitInt(Calc1ExParser.IntContext ctx) {
		Integer nodeInteValue = Integer.valueOf(ctx.INT().getText());
		calculationStack.push(nodeInteValue);
	}

	public Integer getResult() {
		return result;
	}
}
