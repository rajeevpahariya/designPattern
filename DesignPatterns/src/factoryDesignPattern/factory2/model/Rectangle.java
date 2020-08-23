package factoryDesignPattern.factory2.model;

import factoryDesignPattern.factory2.interfaces.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
