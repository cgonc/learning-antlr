// Generated from C:/sideprojects/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_03_3_1\ArrayInit.g4 by ANTLR 4.7.2
package com.poc.chapter_03_3_1.lang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayInitParser}.
 */
public interface ArrayInitListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayInitParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(ArrayInitParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayInitParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(ArrayInitParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayInitParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ArrayInitParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayInitParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ArrayInitParser.ValueContext ctx);
}