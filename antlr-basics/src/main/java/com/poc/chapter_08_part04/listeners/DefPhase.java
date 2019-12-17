package com.poc.chapter_08_part04.listeners;

import com.poc.chapter_08_part03.gen.CymbolCallGraphBaseListener;
import com.poc.chapter_08_part03.gen.CymbolCallGraphParser;
import com.poc.chapter_08_part04.scope.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class DefPhase extends CymbolCallGraphBaseListener {

    public static Symbol.Type getType(int tokenType) {
        switch (tokenType) {
            case CymbolCallGraphParser.K_VOID:
                return Symbol.Type.tVOID;
            case CymbolCallGraphParser.K_INT:
                return Symbol.Type.tINT;
            case CymbolCallGraphParser.K_FLOAT:
                return Symbol.Type.tFLOAT;
        }
        return Symbol.Type.tINVALID;
    }

    private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    private GlobalScope globals;
    private Scope currentScope;

    private void saveScope(ParserRuleContext ctx, Scope s) {
        scopes.put(ctx, s);
    }

    private void defineVar(CymbolCallGraphParser.TypeContext typeContext, Token nameToken) {
        int typeTokenType = typeContext.start.getType();
        Symbol.Type type = getType(typeTokenType);
        VariableSymbol variableSymbol = new VariableSymbol(nameToken.getText(), type);
        currentScope.define(variableSymbol);
    }

    @Override
    public void enterFile(CymbolCallGraphParser.FileContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
    }

    @Override
    public void exitFile(CymbolCallGraphParser.FileContext ctx) {
        System.out.println("globals = " + globals);
    }

    /**
     * void a() {}
     */
    @Override
    public void enterFunctionDecl(CymbolCallGraphParser.FunctionDeclContext ctx) {
        String name = ctx.ID().getText(); //a
        int typeTokenType = ctx.type().start.getType(); //void
        Symbol.Type type = getType(typeTokenType);

        //push new scope by making new one that points to enclosing scope
        FunctionSymbol functionSymbol = new FunctionSymbol(name, type, currentScope);
        currentScope.define(functionSymbol); // Define function in current scope
        saveScope(ctx, functionSymbol); // Push: set function's parent to current
        currentScope = functionSymbol;       // Current scope is now function scope
    }

    @Override
    public void exitFunctionDecl(CymbolCallGraphParser.FunctionDeclContext ctx) {
        System.out.println(currentScope);
        //pop the scope.
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterBlock(CymbolCallGraphParser.BlockContext ctx) {
        // push new local scope
        currentScope = new LocalScope(currentScope);
        saveScope(ctx, currentScope);
    }

    @Override
    public void exitBlock(CymbolCallGraphParser.BlockContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope(); // pop scope
    }

    @Override
    public void exitFormalParameter(CymbolCallGraphParser.FormalParameterContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    @Override
    public void exitVarDecl(CymbolCallGraphParser.VarDeclContext ctx) {
        defineVar(ctx.type(), ctx.ID().getSymbol());
    }

    public ParseTreeProperty<Scope> getScopes() {
        return scopes;
    }

    public GlobalScope getGlobals() {
        return globals;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }
}
