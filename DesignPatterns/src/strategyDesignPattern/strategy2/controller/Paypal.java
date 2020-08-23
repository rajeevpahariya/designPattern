package strategyDesignPattern.strategy2.controller;

public class Paypal implements Payment{
	private String email;
	private String password;
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Paypal(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " Paid with Paypal");
	}
}
