package decoratorPatter.decorator2;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape pDecoratedShape) {
		super(pDecoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}

}
