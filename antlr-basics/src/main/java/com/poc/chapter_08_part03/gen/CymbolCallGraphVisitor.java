// Generated from D:/my_github/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_08_part03/gen\CymbolCallGraph.g4 by ANTLR 4.7.2
package com.poc.chapter_08_part03.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CymbolCallGraphParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CymbolCallGraphVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CymbolCallGraphParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CymbolCallGraphParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCallGraphParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CymbolCallGraphParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCallGraphParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CymbolCallGraphParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCallGraphParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(CymbolCallGraphParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCallGraphParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(CymbolCallGraphParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCallGraphParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CymbolCallGraphParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCallGraphParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CymbolCallGraphParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCallGraphParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CymbolCallGraphParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(CymbolCallGraphParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(CymbolCallGraphParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(CymbolCallGraphParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CymbolCallGraphParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(CymbolCallGraphParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CymbolCallGraphParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CymbolCallGraphParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(CymbolCallGraphParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(CymbolCallGraphParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CymbolCallGraphParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link CymbolCallGraphParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(CymbolCallGraphParser.ExprListContext ctx);
}