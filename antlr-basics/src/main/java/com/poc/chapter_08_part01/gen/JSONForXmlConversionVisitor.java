// Generated from D:/my_github/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_08_part01/gen\JSONForXmlConversion.g4 by ANTLR 4.7.2
package com.poc.chapter_08_part01.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONForXmlConversionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONForXmlConversionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONForXmlConversionParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(JSONForXmlConversionParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link JSONForXmlConversionParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnObject(JSONForXmlConversionParser.AnObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link JSONForXmlConversionParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyObject(JSONForXmlConversionParser.EmptyObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayOfValues}
	 * labeled alternative in {@link JSONForXmlConversionParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayOfValues(JSONForXmlConversionParser.ArrayOfValuesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link JSONForXmlConversionParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArray(JSONForXmlConversionParser.EmptyArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSONForXmlConversionParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(JSONForXmlConversionParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(JSONForXmlConversionParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(JSONForXmlConversionParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(JSONForXmlConversionParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link JSONForXmlConversionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(JSONForXmlConversionParser.ArrayValueContext ctx);
}