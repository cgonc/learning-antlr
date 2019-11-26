package com.poc.chapter_08_part01_csv_loader;

import com.poc.chapter_08_part01_csv_loader.gen.CSVLoaderMapBaseListener;
import com.poc.chapter_08_part01_csv_loader.gen.CSVLoaderMapParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVLoaderMapBasedListenerImpl extends CSVLoaderMapBaseListener {
    private List<Map<String, String>> csvMap;
    private List<String> header;
    private List<String> row;

    public CSVLoaderMapBasedListenerImpl() {
        csvMap = new ArrayList<>();
        header = new ArrayList<>();
        row = new ArrayList<>();
    }

    @Override
    public void enterRow(CSVLoaderMapParser.RowContext ctx) {
        row = new ArrayList<>();
    }

    @Override
    public void exitRow(CSVLoaderMapParser.RowContext ctx) {
        //If this is the header file do nothing.
        if (ctx.getParent().getRuleIndex() == CSVLoaderMapParser.RULE_header) {
            return;
        }
        Map<String, String> rowMap = new HashMap<>();
        int headerIndex = 0;
        for (String value : row) {
            rowMap.put(header.get(headerIndex), value);
            headerIndex += 1;
        }
        csvMap.add(rowMap);
    }

    @Override
    public void exitHeader(CSVLoaderMapParser.HeaderContext ctx) {
        header.addAll(row);
    }

    @Override
    public void exitText(CSVLoaderMapParser.TextContext ctx) {
        row.add(ctx.TEXT().getText());
    }

    @Override
    public void exitString(CSVLoaderMapParser.StringContext ctx) {
        row.add(ctx.STRING().getText());
    }

    @Override
    public void exitEmpty(CSVLoaderMapParser.EmptyContext ctx) {
        row.add("");
    }

    public List<Map<String, String>> getCsvMap() {
        return csvMap;
    }
}
