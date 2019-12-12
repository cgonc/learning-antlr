package com.poc.chapter_08_part04.scope;

public class LocalScope extends BaseScope {
    public LocalScope(Scope parent) { super(parent); }
    public String getScopeName() { return "locals"; }
}

