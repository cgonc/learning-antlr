package com.poc.tree_structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.poc.tree_structures.tree.Relation;

public class MainNoCircular {

	public static void main(String[] args) {
		List<Relation> twoDimensionalAncestorList = new ArrayList<>();
		twoDimensionalAncestorList.add(new Relation("A", "B"));
		twoDimensionalAncestorList.add(new Relation("B", "C"));
		twoDimensionalAncestorList.add(new Relation("B", "D"));
		twoDimensionalAncestorList.add(new Relation("C", "F"));
		twoDimensionalAncestorList.add(new Relation("F", "G"));
		twoDimensionalAncestorList.add(new Relation("F", "H"));
		twoDimensionalAncestorList.add(new Relation("D", "K"));
		twoDimensionalAncestorList.add(new Relation("K", "L"));
		twoDimensionalAncestorList.add(new Relation("L", "E"));


		Set<String> dResult = fetchRelations("D", twoDimensionalAncestorList);
		System.out.println("D Result = " + dResult.toString());

		Set<String> aResult = fetchRelations("A", twoDimensionalAncestorList);
		System.out.println("A Result = " + aResult.toString());

		Set<String> bResult = fetchRelations("B", twoDimensionalAncestorList);
		System.out.println("B Result = " + bResult.toString());

		Set<String> fResult = fetchRelations("F", twoDimensionalAncestorList);
		System.out.println("F Result = " + fResult.toString());

		Set<String> kResult = fetchRelations("K", twoDimensionalAncestorList);
		System.out.println("K Result = " + kResult.toString());

		Set<String> lResult = fetchRelations("L", twoDimensionalAncestorList);
		System.out.println("L Result = " + lResult.toString());

		Set<String> eResult = fetchRelations("E", twoDimensionalAncestorList);
		System.out.println("E Result = " + eResult.toString());
	}

	public static Set<String> fetchRelations(String code, List<Relation> ancestorList){
		List<Relation> relations = ancestorList.stream().filter(ancestor -> ancestor.getCode().equals(code)).collect(Collectors.toList());
		if(relations.isEmpty()){
			return new HashSet<>();
		}
		Set<String> relatedCodes = relations.stream().map(Relation::getRelatedCode).collect(Collectors.toSet());
		Set<String> relatedCodeCallSet = new HashSet<>(relatedCodes);
		relatedCodeCallSet.forEach(relatedCode -> {
			Set<String> childRelations = fetchRelations(relatedCode, ancestorList);
			relatedCodes.addAll(childRelations);
		});
		return relatedCodes;
	}

}
