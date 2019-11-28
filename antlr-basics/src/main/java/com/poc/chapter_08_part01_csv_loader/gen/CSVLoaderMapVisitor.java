// Generated from C:/sideprojects/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_08_part01_csv_loader\CSVLoaderMap.g4 by ANTLR 4.7.2
package com.poc.chapter_08_part01_csv_loader.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSVLoaderMapParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSVLoaderMapVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSVLoaderMapParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CSVLoaderMapParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVLoaderMapParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(CSVLoaderMapParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSVLoaderMapParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CSVLoaderMapParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code text}
	 * labeled alternative in {@link CSVLoaderMapParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(CSVLoaderMapParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link CSVLoaderMapParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CSVLoaderMapParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CSVLoaderMapParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(CSVLoaderMapParser.EmptyContext ctx);
}