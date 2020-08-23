package factoryDesignPattern.abstractFactory.model;

import factoryDesignPattern.abstractFactory.interfaces.AbstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean rounded) {
		if (rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}
}
