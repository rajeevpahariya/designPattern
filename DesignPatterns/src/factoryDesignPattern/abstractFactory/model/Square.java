package factoryDesignPattern.abstractFactory.model;

import factoryDesignPattern.abstractFactory.interfaces.Shape;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
