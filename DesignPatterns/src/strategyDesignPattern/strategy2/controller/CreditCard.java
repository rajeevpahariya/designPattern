package strategyDesignPattern.strategy2.controller;

public class CreditCard implements Payment{
	private String name;
	private String creditNumber;
	
	public String getName() {
		return name;
	}

	public String getCreditNumber() {
		return creditNumber;
	}

	public CreditCard(String name, String creditNumber) {
		super();
		this.name = name;
		this.creditNumber = creditNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " Paid with Card");
	}
}
