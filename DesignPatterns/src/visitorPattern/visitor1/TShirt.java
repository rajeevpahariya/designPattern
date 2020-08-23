package visitorPattern.visitor1;

public class TShirt implements Visitable{
	
	private double price;
	public double getPrice() {
		return price;
	}

	public TShirt(double price) {
		this.price = price;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visitor(this);
	}
}
