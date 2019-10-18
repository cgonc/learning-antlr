package com.poc.chapter_03_3_4.impl;

import com.poc.chapter_03_3_4.gen.ArrayInitBaseListener;
import com.poc.chapter_03_3_4.gen.ArrayInitParser;

public class ShortToUnicodeString extends ArrayInitBaseListener {

    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.println('"');
    }

    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        // Assumes no nested array initializers
        int value = Integer.parseInt(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}
