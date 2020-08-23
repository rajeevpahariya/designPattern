package visitorPattern.visitor1;

public class TaxVisitor implements Visitor{
	
	@Override
	public double visitor(Shirt shirtItem) {
		System.out.println("Shirt Finarl Price with Tax : ");
		return shirtItem.getPrice()*.20 + shirtItem.getPrice();
	}

	@Override
	public double visitor(TShirt tshirtItem) {
		System.out.println("TShirt Finarl Price with Tax : ");
		return tshirtItem.getPrice()*.10 + tshirtItem.getPrice();
	}

	@Override
	public double visitor(Jacket jacketItem) {
		System.out.println("Jacket Finarl Price with Tax : ");
		return jacketItem.getPrice()*.30 + jacketItem.getPrice();
	}

}
