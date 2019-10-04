// Generated from C:/sideprojects/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_01_1_2\Hello.g4 by ANTLR 4.7.2
package com.poc.chapter_01_1_2.langimpl;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link HelloParser#r}.
     *
     * @param ctx the parse tree
     */
    void enterR(HelloParser.RContext ctx);

    /**
     * Exit a parse tree produced by {@link HelloParser#r}.
     *
     * @param ctx the parse tree
     */
    void exitR(HelloParser.RContext ctx);
}