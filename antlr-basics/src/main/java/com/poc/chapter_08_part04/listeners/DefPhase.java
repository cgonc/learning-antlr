package com.poc.chapter_08_part04.listeners;

import com.poc.chapter_08_part03.gen.CymbolCallGraphBaseListener;
import com.poc.chapter_08_part03.gen.CymbolCallGraphParser;
import com.poc.chapter_08_part04.scope.FunctionSymbol;
import com.poc.chapter_08_part04.scope.GlobalScope;
import com.poc.chapter_08_part04.scope.Scope;
import com.poc.chapter_08_part04.scope.Symbol;
import org.antlr.v4.runtime.ParserRuleContext;
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
}
