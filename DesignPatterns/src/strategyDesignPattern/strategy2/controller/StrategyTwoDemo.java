package strategyDesignPattern.strategy2.controller;

import strategyDesignPattern.strategy2.model.Product;

public class StrategyTwoDemo {
	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart();
		
		Product p1 = new Product("123", 25);
		Product p2 = new Product("1234", 15);
		
		sc.addProduct(p1);
		sc.addProduct(p2);
		
		Paypal paypal = new Paypal("asd@pa.com", "nowayman");
		sc.pay(paypal);
		
		CreditCard card = new CreditCard("Test", "123456");
		sc.pay(card);
	}
}
