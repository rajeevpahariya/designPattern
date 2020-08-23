package decoratorPatter.decorator1;

public class RolledIceCream extends IceCreamDecorator{

	public RolledIceCream(IceCream pIceCream) {
		super(pIceCream);
	}
	
	@Override
	public double cost() {
		System.out.println("Adding RolledIceCream");
		return 2.0 + super.cost();
	}

}
