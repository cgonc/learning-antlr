// Generated from D:/my_github/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_07_part01/gen\PropertyFile.g4 by ANTLR 4.7.2
package com.poc.chapter_07_part01.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PropertyFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PropertyFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PropertyFileParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(PropertyFileParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PropertyFileParser#prop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProp(PropertyFileParser.PropContext ctx);
}