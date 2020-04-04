package com.poc.visitorpattern.visitor;

import com.poc.visitorpattern.car.Body;
import com.poc.visitorpattern.car.Car;
import com.poc.visitorpattern.car.Engine;
import com.poc.visitorpattern.car.Wheel;

public class CarElementPrintVisitor implements CarElementVisitor{

	@Override
	public void visit(Body body) {
		System.out.println("Visiting body");
	}

	@Override
	public void visit(Car car) {
		System.out.println("Visiting car");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Visiting engine");
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Visiting " + wheel.getName() + " wheel");
	}
}
