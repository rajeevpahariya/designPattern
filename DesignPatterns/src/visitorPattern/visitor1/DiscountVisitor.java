package visitorPattern.visitor1;

public class DiscountVisitor implements Visitor{

	@Override
	public double visitor(Shirt shirtItem) {
		System.out.println("Shirt Price After 5% Discount");
		return shirtItem.getPrice() - shirtItem.getPrice()*.05;
	}

	@Override
	public double visitor(TShirt tshirtItem) {
		System.out.println("TShirt Price After 10% Discount");
		return tshirtItem.getPrice() - tshirtItem.getPrice() * .10;
	}

	@Override
	public double visitor(Jacket jacketItem) {
		System.out.println("Jacket Price After 15% Discount");
		return jacketItem.getPrice() - jacketItem.getPrice() * .15;
	}

}
