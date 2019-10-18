// Generated from C:/sideprojects/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_03_3_1\ArrayInit.g4 by ANTLR 4.7.2
package com.poc.chapter_03_3_1.lang;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ArrayInitVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class ArrayInitBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ArrayInitVisitor<T> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitInit(ArrayInitParser.InitContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitValue(ArrayInitParser.ValueContext ctx) {
        return visitChildren(ctx);
    }
}