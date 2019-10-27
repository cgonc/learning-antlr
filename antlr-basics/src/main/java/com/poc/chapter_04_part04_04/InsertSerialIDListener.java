package com.poc.chapter_04_part04_04;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import com.poc.chapter_04_part03.gen.JavaBaseListener;
import com.poc.chapter_04_part03.gen.JavaParser;

public class InsertSerialIDListener extends JavaBaseListener {

	private TokenStreamRewriter tokenStreamRewriter;

	public InsertSerialIDListener(TokenStream tokenStream) {
		this.tokenStreamRewriter = new TokenStreamRewriter(tokenStream);
	}

	@Override
	public void enterClassBody(JavaParser.ClassBodyContext ctx) {
		String field = "\n\t public static final long serialVersionUID = 1L;";
		tokenStreamRewriter.insertAfter(ctx.start, field);
	}

	public TokenStreamRewriter getTokenStreamRewriter() {
		return tokenStreamRewriter;
	}
}
