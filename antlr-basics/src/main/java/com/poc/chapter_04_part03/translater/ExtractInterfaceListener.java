package com.poc.chapter_04_part03.translater;

import org.antlr.v4.runtime.TokenStream;

import com.poc.chapter_04_part03.gen.JavaBaseListener;
import com.poc.chapter_04_part03.gen.JavaParser;

public class ExtractInterfaceListener extends JavaBaseListener {

	private JavaParser javaParser;
	private StringBuilder result;

	public ExtractInterfaceListener(JavaParser javaParser) {
		this.javaParser = javaParser;
		result = new StringBuilder();
	}

	@Override public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
		result.append("\n").append(javaParser.getTokenStream().getText(ctx));
		System.out.println(javaParser.getTokenStream().getText(ctx));
	}

	@Override
	public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
		result.append("\n").append("interface I").append(ctx.Identifier()).append(" {");
		System.out.println("interface I" + ctx.Identifier() + " {");
	}

	@Override
	public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
		result.append("\n").append("}");
		System.out.println("}");
	}

	/** Listen to matches of methodDeclaration */
	@Override
	public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
		// need parser to get tokens
		TokenStream tokens = javaParser.getTokenStream();
		String type = "void";
		if(ctx.type() != null){
			type = tokens.getText(ctx.type());
		}
		String args = tokens.getText(ctx.formalParameters());
		result.append("\n").append("\t").append(type).append(" ").append(ctx.Identifier()).append(args).append(";");
		System.out.println("\t" + type + " " + ctx.Identifier() + args + ";");
	}

	public String getResult() {
		return result.toString();
	}
}
