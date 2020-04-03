package com.poc.tree_structures.tree;

import java.util.ArrayList;
import java.util.List;

public class RelationTreeDTO {
	private String code;
	private List<RelationTreeDTO> relations;

	public RelationTreeDTO() {
		relations = new ArrayList<>();
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<RelationTreeDTO> getRelations() {
		return relations;
	}
}
