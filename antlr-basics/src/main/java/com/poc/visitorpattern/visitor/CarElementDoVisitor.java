package com.poc.visitorpattern.visitor;

import com.poc.visitorpattern.car.Body;
import com.poc.visitorpattern.car.Car;
import com.poc.visitorpattern.car.Engine;
import com.poc.visitorpattern.car.Wheel;

public class CarElementDoVisitor implements CarElementVisitor {

	@Override
	public void visit(Body body) {
		System.out.println("Moving my body");
	}

	@Override
	public void visit(Car car) {
		System.out.println("Starting my car");
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Kicking my " + wheel.getName() + " wheel");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Starting my engine");
	}
}
