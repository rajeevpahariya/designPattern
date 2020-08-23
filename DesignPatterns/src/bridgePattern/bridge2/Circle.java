package bridgePattern.bridge2;

public class Circle extends Shape{

	public Circle(DrawAPI api) {
		super(api);
	}

	@Override
	protected void draw() {
		System.out.print("Dwaring Circle with color >>>");
		this.api.drawCircle();
	}

}
