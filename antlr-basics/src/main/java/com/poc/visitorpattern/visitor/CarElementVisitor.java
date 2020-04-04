package com.poc.visitorpattern.visitor;

import com.poc.visitorpattern.car.Body;
import com.poc.visitorpattern.car.Car;
import com.poc.visitorpattern.car.Engine;
import com.poc.visitorpattern.car.Wheel;

public interface CarElementVisitor {

	void visit(Body body);

	void visit(Car car);

	void visit(Engine engine);

	void visit(Wheel wheel);
}
