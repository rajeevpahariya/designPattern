package decoratorPatter.decorator1;

public class IceCreamDecorator implements IceCream{

	private IceCream iceCream;
	
	public IceCreamDecorator(IceCream pIceCream) {
		this.iceCream = pIceCream;
	}
	
	@Override
	public double cost() {
		return this.iceCream.cost();
	}

}
