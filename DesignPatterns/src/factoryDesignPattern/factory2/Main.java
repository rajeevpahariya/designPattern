package factoryDesignPattern.factory2;

import factoryDesignPattern.factory2.interfaces.Shape;
import factoryDesignPattern.factory2.model.ShapeFactory;

public class Main {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape1 = factory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = factory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = factory.getShape("SQUARE");
		shape3.draw();
	}
}
