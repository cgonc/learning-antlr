package com.poc.visitorpattern.car;

import com.poc.visitorpattern.visitor.CarElementVisitor;

public interface CarElement {

	void accept(CarElementVisitor visitor);

}
