package strategyDesignPattern.strategy2.model;

public class Product {
	private String upc;
	private int price;
	
	public Product(String upc, int price) {
		super();
		this.upc = upc;
		this.price = price;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
