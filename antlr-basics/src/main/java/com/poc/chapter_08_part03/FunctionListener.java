package com.poc.chapter_08_part03;

import com.poc.chapter_08_part03.gen.CymbolCallGraphBaseListener;
import com.poc.chapter_08_part03.gen.CymbolCallGraphParser;

public class FunctionListener extends CymbolCallGraphBaseListener {
    private Graph graph;
    private String currentFunctionName;

    public FunctionListener() {
        graph = new Graph();
        currentFunctionName = null;
    }

    @Override
    public void enterFunctionDecl(CymbolCallGraphParser.FunctionDeclContext ctx) {
        currentFunctionName = ctx.ID().getText();
        graph.getNodes().add(currentFunctionName);
    }

    @Override
    public void exitCall(CymbolCallGraphParser.CallContext ctx) {
        String funcName = ctx.ID().getText();
        // map current function to the callee
        graph.edge(currentFunctionName, funcName);
    }

    public Graph getGraph() {
        return graph;
    }
}
