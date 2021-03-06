package flyWeightPattern.flyWeight1;

import java.util.HashMap;

public class ShapeFactory {

    @SuppressWarnings("rawtypes")
	private static final HashMap circleMap = new HashMap();

    @SuppressWarnings("unchecked")
	public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);


        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Making circle of color: " + color);
        }

        return circle;

    }
}
