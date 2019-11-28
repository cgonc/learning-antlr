// Generated from D:/my_github/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_08_part01/gen\JSONForXmlConversion.g4 by ANTLR 4.7.2
package com.poc.chapter_08_part02.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONForXmlConversionParser}.
 */
public interface JSONForXmlConversionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONForXmlConversionParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONForXmlConversionParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONForXmlConversionParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONForXmlConversionParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link JSONForXmlConversionParser#object}.
	 * @param ctx the parse tree
	 */
	void enterAnObject(JSONForXmlConversionParser.AnObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link JSONForXmlConversionParser#object}.
	 * @param ctx the parse tree
	 */
	void exitAnObject(JSONForXmlConversionParser.AnObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link JSONForXmlConversionParser#object}.
	 * @param ctx the parse tree
	 */
	void enterEmptyObject(JSONForXmlConversionParser.EmptyObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link JSONForXmlConversionParser#object}.
	 * @param ctx the parse tree
	 */
	void exitEmptyObject(JSONForXmlConversionParser.EmptyObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayOfValues}
	 * labeled alternative in {@link JSONForXmlConversionParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArrayOfValues(JSONForXmlConversionParser.ArrayOfValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayOfValues}
	 * labeled alternative in {@link JSONForXmlConversionParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArrayOfValues(JSONForXmlConversionParser.ArrayOfValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link JSONForXmlConversionParser#array}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArray(JSONForXmlConversionParser.EmptyArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link JSONForXmlConversionParser#array}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArray(JSONForXmlConversionParser.EmptyArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONForXmlConversionParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(JSONForXmlConversionParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONForXmlConversionParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(JSONForXmlConversionParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(JSONForXmlConversionParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(JSONForXmlConversionParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterAtom(JSONForXmlConversionParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitAtom(JSONForXmlConversionParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(JSONForXmlConversionParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(JSONForXmlConversionParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(JSONForXmlConversionParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(JSONForXmlConversionParser.ArrayValueContext ctx);
}