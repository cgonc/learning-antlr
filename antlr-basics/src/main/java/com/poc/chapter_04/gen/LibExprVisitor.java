// Generated from D:/my_github/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_04\LibExpr.g4 by ANTLR 4.7.2
package com.poc.chapter_04.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LibExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LibExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LibExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LibExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LibExprParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LibExprParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LibExprParser.ExpressionContext ctx);
}