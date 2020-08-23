package facade.facade2;

public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeFacede facade = new ShapeFacede();
		facade.drawCircle();
		facade.drawRectangle();
		facade.drawSquare();
	}
}
