// Generated from D:/my_github/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_07_part03_a/grammar\Calc1Ex.g4 by ANTLR 4.7.2
package com.poc.chapter_07_part03_a.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Calc1ExParser}.
 */
public interface Calc1ExListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Calc1ExParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(Calc1ExParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calc1ExParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(Calc1ExParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link Calc1ExParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(Calc1ExParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link Calc1ExParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(Calc1ExParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link Calc1ExParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMult(Calc1ExParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link Calc1ExParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMult(Calc1ExParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Calc1ExParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(Calc1ExParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link Calc1ExParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(Calc1ExParser.IntContext ctx);
}