package visitorPattern.visitor1;

public class Jacket implements Visitable{
	private double price;
	public double getPrice() {
		return price;
	}

	public Jacket(double price) {
		this.price = price;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visitor(this);
	}
	
}
