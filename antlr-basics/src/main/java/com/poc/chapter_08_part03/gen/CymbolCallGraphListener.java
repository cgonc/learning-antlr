// Generated from D:/my_github/antlr-poc/antlr-basics/src/main/java/com/poc/chapter_08_part03/gen\CymbolCallGraph.g4 by ANTLR 4.7.2
package com.poc.chapter_08_part03.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolCallGraphParser}.
 */
public interface CymbolCallGraphListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolCallGraphParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CymbolCallGraphParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCallGraphParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CymbolCallGraphParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCallGraphParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CymbolCallGraphParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCallGraphParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CymbolCallGraphParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCallGraphParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CymbolCallGraphParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCallGraphParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CymbolCallGraphParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCallGraphParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CymbolCallGraphParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCallGraphParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CymbolCallGraphParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCallGraphParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CymbolCallGraphParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCallGraphParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CymbolCallGraphParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCallGraphParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CymbolCallGraphParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCallGraphParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CymbolCallGraphParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCallGraphParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymbolCallGraphParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCallGraphParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymbolCallGraphParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCallGraphParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CymbolCallGraphParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCallGraphParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CymbolCallGraphParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(CymbolCallGraphParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(CymbolCallGraphParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(CymbolCallGraphParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(CymbolCallGraphParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(CymbolCallGraphParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(CymbolCallGraphParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CymbolCallGraphParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CymbolCallGraphParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(CymbolCallGraphParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(CymbolCallGraphParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(CymbolCallGraphParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(CymbolCallGraphParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CymbolCallGraphParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CymbolCallGraphParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex(CymbolCallGraphParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex(CymbolCallGraphParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(CymbolCallGraphParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(CymbolCallGraphParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CymbolCallGraphParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CymbolCallGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CymbolCallGraphParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolCallGraphParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CymbolCallGraphParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolCallGraphParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CymbolCallGraphParser.ExprListContext ctx);
}