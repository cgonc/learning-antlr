package com.poc.visitorpattern;

import com.poc.visitorpattern.car.Car;
import com.poc.visitorpattern.visitor.CarElementDoVisitor;
import com.poc.visitorpattern.visitor.CarElementPrintVisitor;

public class VisitorDemo {
	public static void main(final String[] args) {
		Car car = new Car();

		car.accept(new CarElementPrintVisitor());
		car.accept(new CarElementDoVisitor());
	}
}
