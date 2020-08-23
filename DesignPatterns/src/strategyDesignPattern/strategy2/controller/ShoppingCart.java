package strategyDesignPattern.strategy2.controller;

import java.util.ArrayList;
import java.util.List;

import strategyDesignPattern.strategy2.model.Product;

public class ShoppingCart {
	public List<Product> products;
	
	public ShoppingCart() {
		products = new ArrayList<Product>();
	}
	public void addProduct(Product product){
		products.add(product);
	}
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	public int calculateTotal() {
		int total = 0;
		total = products.stream().mapToInt(p -> p.getPrice()).sum();
		return total;
	}
	
	public void pay(Payment payment) {
		payment.pay(calculateTotal());
	}
}
