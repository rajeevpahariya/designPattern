package factoryDesignPattern.abstractFactory.model;

import factoryDesignPattern.abstractFactory.interfaces.Shape;

public class RoundedSquare implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");
	}
}
