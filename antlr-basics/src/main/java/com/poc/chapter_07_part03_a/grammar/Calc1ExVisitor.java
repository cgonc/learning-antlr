// Generated from D:/my_github/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_07_part03_a/grammar\Calc1Ex.g4 by ANTLR 4.7.2
package com.poc.chapter_07_part03_a.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Calc1ExParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Calc1ExVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Calc1ExParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(Calc1ExParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link Calc1ExParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(Calc1ExParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link Calc1ExParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(Calc1ExParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Calc1ExParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(Calc1ExParser.IntContext ctx);
}