package com.poc.chapter_07_part02.impl;

import com.poc.chapter_07_part02.grammar.ExprBaseListener;
import com.poc.chapter_07_part02.grammar.ExprParser;

public class ExpressionEvaluaterListener extends ExprBaseListener {

    private Integer value = 0;

    @Override
    public void enterAdd(ExprParser.AddContext ctx) {
        String left = ctx.e().get(0).getText();
        String right = ctx.e().get(3).getText();

        Integer leftInt = Integer.parseInt(left);
        Integer rightInt = Integer.parseInt(right);
        value += (leftInt + rightInt);
    }

    @Override
    public void enterMult(ExprParser.MultContext ctx) {
        String left = ctx.e().get(0).getText();
        String right = ctx.e().get(3).getText();

        Integer leftInt = Integer.parseInt(left);
        Integer rightInt = Integer.parseInt(right);
        value += (leftInt * rightInt);
    }

    public Integer getValue() {
        return value;
    }
}
