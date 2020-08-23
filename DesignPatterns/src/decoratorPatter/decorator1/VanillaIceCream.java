package decoratorPatter.decorator1;

public class VanillaIceCream extends IceCreamDecorator{

	public VanillaIceCream(IceCream pIceCream) {
		super(pIceCream);
	}
	
	@Override
	public double cost() {
		System.out.println("Adding VanillaIceCream");
		return 3.0 + super.cost();
	}

}
