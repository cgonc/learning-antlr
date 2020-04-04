package com.poc.visitorpattern.car;

import java.util.Arrays;
import java.util.List;

import com.poc.visitorpattern.visitor.CarElementVisitor;

public class Car implements CarElement {

	private final List<CarElement> elements;

	public Car() {
		this.elements = Arrays.asList(new Wheel("front left"), new Wheel("front right"), new Wheel("back left"), new Wheel("back right"), new Body(), new Engine());
	}

	@Override
	public void accept(CarElementVisitor visitor) {
		for(CarElement element : elements){
			element.accept(visitor);
		}
		visitor.visit(this);
	}
}
