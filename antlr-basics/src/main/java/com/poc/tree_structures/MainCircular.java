package com.poc.tree_structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.poc.tree_structures.tree.Relation;

public class MainCircular {

	public static void main(String[] args) {
		List<Relation> twoDimensionalAncestorList = new ArrayList<>();
		twoDimensionalAncestorList.add(new Relation("A", "B"));
		twoDimensionalAncestorList.add(new Relation("B", "C"));
		twoDimensionalAncestorList.add(new Relation("B", "D"));
		twoDimensionalAncestorList.add(new Relation("D", "A"));
		twoDimensionalAncestorList.add(new Relation("D", "H"));
		twoDimensionalAncestorList.add(new Relation("D", "K"));
		twoDimensionalAncestorList.add(new Relation("A", "W"));
		twoDimensionalAncestorList.add(new Relation("W", "J"));
		twoDimensionalAncestorList.add(new Relation("J", "P"));
		twoDimensionalAncestorList.add(new Relation("P", "R"));
		twoDimensionalAncestorList.add(new Relation("R", "S"));
		twoDimensionalAncestorList.add(new Relation("S", "Z"));
		twoDimensionalAncestorList.add(new Relation("O", "M"));


		List<String> aResult = fetchRelations("A", twoDimensionalAncestorList, new ArrayList<>(Collections.singletonList("A")));
		System.out.println("A Result = " + aResult.toString());

		List<String> oResult = fetchRelations("O", twoDimensionalAncestorList, new ArrayList<>(Collections.singletonList("O")));
		System.out.println("O Result = " + oResult.toString());
	}

	public static List<String> fetchRelations(String code, List<Relation> ancestorList, List<String> circularDetection) {
		List<Relation> relations = ancestorList.stream().filter(ancestor -> ancestor.getCode().equals(code)).collect(Collectors.toList());
		if(relations.isEmpty()){
			return new ArrayList<>();
		}
		List<String> relatedCodes = relations.stream().map(Relation::getRelatedCode).collect(Collectors.toList());
		List<String> nonVisitedRelatedCodes = relatedCodes.stream().filter(relatedCode -> !circularDetection.contains(relatedCode)).collect(Collectors.toList());
		circularDetection.addAll(nonVisitedRelatedCodes);
		List<String> nonVisitedRelatedCodesCallSet = new ArrayList<>(nonVisitedRelatedCodes);
		nonVisitedRelatedCodesCallSet.forEach(relatedCode -> {
			List<String> childRelations = fetchRelations(relatedCode, ancestorList, circularDetection);
			nonVisitedRelatedCodes.addAll(childRelations);
		});
		return nonVisitedRelatedCodes;
	}

}
