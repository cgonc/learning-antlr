// Generated from C:/sideprojects/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_08_part01_csv_loader\CSVLoaderMap.g4 by ANTLR 4.7.2
package com.poc.chapter_08_part01.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSVLoaderMapParser}.
 */
public interface CSVLoaderMapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSVLoaderMapParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CSVLoaderMapParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVLoaderMapParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CSVLoaderMapParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVLoaderMapParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(CSVLoaderMapParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVLoaderMapParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(CSVLoaderMapParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSVLoaderMapParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CSVLoaderMapParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSVLoaderMapParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CSVLoaderMapParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code text}
	 * labeled alternative in {@link CSVLoaderMapParser#field}.
	 * @param ctx the parse tree
	 */
	void enterText(CSVLoaderMapParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code text}
	 * labeled alternative in {@link CSVLoaderMapParser#field}.
	 * @param ctx the parse tree
	 */
	void exitText(CSVLoaderMapParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link CSVLoaderMapParser#field}.
	 * @param ctx the parse tree
	 */
	void enterString(CSVLoaderMapParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CSVLoaderMapParser#field}.
	 * @param ctx the parse tree
	 */
	void exitString(CSVLoaderMapParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CSVLoaderMapParser#field}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(CSVLoaderMapParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CSVLoaderMapParser#field}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(CSVLoaderMapParser.EmptyContext ctx);
}