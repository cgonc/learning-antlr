package com.poc.chapter_08_part04.listeners;

import com.poc.chapter_08_part03.gen.CymbolCallGraphBaseListener;
import com.poc.chapter_08_part03.gen.CymbolCallGraphParser;
import com.poc.chapter_08_part04.scope.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class RefPhase extends CymbolCallGraphBaseListener {
    private ParseTreeProperty<Scope> scopes;
    private GlobalScope globals;
    private Scope currentScope;

    public RefPhase(ParseTreeProperty<Scope> scopes, GlobalScope globals, Scope currentScope) {
        this.scopes = scopes;
        this.globals = globals;
        this.currentScope = currentScope;
    }

    private void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(),
                msg);
    }

    @Override
    public void enterFile(CymbolCallGraphParser.FileContext ctx) {
        currentScope = globals;
    }

    @Override
    public void enterFunctionDecl(CymbolCallGraphParser.FunctionDeclContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override
    public void exitFunctionDecl(CymbolCallGraphParser.FunctionDeclContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterBlock(CymbolCallGraphParser.BlockContext ctx) {
        currentScope = scopes.get(ctx);
    }

    @Override
    public void exitBlock(CymbolCallGraphParser.BlockContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void exitVar(CymbolCallGraphParser.VarContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = currentScope.resolve(name);
        if (var == null) {
            error(ctx.ID().getSymbol(), "no such variable: " + name);
        }
        if (var instanceof FunctionSymbol) {
            error(ctx.ID().getSymbol(), name + " is not a variable");
        }
    }

    @Override
    public void exitCall(CymbolCallGraphParser.CallContext ctx) {
        String funcName = ctx.ID().getText();
        Symbol meth = currentScope.resolve(funcName);
        if (meth == null) {
            error(ctx.ID().getSymbol(), "no such function: " + funcName);
        }
        if (meth instanceof VariableSymbol) {
            error(ctx.ID().getSymbol(), funcName + " is not a function");
        }
    }
}
