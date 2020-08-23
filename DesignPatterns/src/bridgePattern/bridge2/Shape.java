package bridgePattern.bridge2;

public abstract class Shape {

	DrawAPI api;

	protected Shape(DrawAPI api) {
		this.api = api;
	}
	
	protected abstract void draw();
}
