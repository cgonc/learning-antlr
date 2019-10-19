// Generated from D:/my_github/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_04\LibExpr.g4 by ANTLR 4.7.2
package com.poc.chapter_04.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LibExprParser}.
 */
public interface LibExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LibExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LibExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LibExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LibExprParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LibExprParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LibExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LibExprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LibExprParser.ExpressionContext ctx);
}