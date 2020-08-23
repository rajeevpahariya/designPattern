package bridgePattern.bridge2;

public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle() {
		System.out.println("Green");
	}

}
