package com.poc.visitorpattern.car;

import com.poc.visitorpattern.visitor.CarElementVisitor;

public class Engine implements CarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
}