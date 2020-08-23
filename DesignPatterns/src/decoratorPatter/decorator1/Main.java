package decoratorPatter.decorator1;

public class Main {
	public static void main(String[] args) {
		IceCream bi = new BasicIceCream();
		System.out.println("Basic Ice Cream Cost : $" + bi.cost());
		
		ChocolateIceCream ci = new ChocolateIceCream(bi);
		System.out.println(ci.cost());
		
		VanillaIceCream vi = new VanillaIceCream(bi);
		System.out.println(vi.cost());
		
		RolledIceCream ri = new RolledIceCream(bi);
		System.out.println(ri.cost());
	}
}
