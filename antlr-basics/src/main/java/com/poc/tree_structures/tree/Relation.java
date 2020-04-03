package com.poc.tree_structures.tree;

public class Relation {
	private String code;
	private String relatedCode;

	public Relation(String code, String relatedCode) {
		this.code = code;
		this.relatedCode = relatedCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRelatedCode() {
		return relatedCode;
	}

	public void setRelatedCode(String relatedCode) {
		this.relatedCode = relatedCode;
	}
}
