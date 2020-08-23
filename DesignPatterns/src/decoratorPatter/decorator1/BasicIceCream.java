package decoratorPatter.decorator1;

public class BasicIceCream implements IceCream{

	public BasicIceCream() {
		System.out.println("Basic Ice Cream");
	}
	
	@Override
	public double cost() {
		return 0.50;
	}

}
