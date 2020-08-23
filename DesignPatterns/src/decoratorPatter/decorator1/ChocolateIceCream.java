package decoratorPatter.decorator1;

public class ChocolateIceCream extends IceCreamDecorator{

	public ChocolateIceCream(IceCream pIceCream) {
		super(pIceCream);
	}
	
	@Override
	public double cost() {
		System.out.println("Adding ChocolateIceCream");
		return 1.0 + super.cost();
	}

}
