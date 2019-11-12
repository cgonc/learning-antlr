// Generated from D:/my_github/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_07_part01/gen\PropertyFile.g4 by ANTLR 4.7.2
package com.poc.chapter_07_part01.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PropertyFileParser}.
 */
public interface PropertyFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PropertyFileParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(PropertyFileParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyFileParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(PropertyFileParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PropertyFileParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(PropertyFileParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyFileParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(PropertyFileParser.PropContext ctx);
}