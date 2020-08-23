package bridgePattern.bridge2;

public class Main {
	public static void main(String[] args) {
		Shape shape1 = new Circle(new GreenCircle());
		Shape shape2 = new Circle(new RedCircle());
		shape1.draw();
		shape2.draw();
	}
}
