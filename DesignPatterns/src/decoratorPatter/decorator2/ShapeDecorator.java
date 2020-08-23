package decoratorPatter.decorator2;

public abstract class ShapeDecorator implements Shape{
	
	protected Shape decoratedShape;
	
	public ShapeDecorator(Shape pDecoratedShape) {
		this.decoratedShape = pDecoratedShape;
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
	}
}
