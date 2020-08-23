package visitorPattern.visitor1;

public class Main {
	public static void main(String[] args) {
		TaxVisitor txVisitor = new TaxVisitor();
		DiscountVisitor disVisitor = new DiscountVisitor();
		Jacket jacket = new Jacket(100);
		TShirt tShirt = new TShirt(16);
		Shirt shirt = new Shirt(28);
		System.out.println(jacket.accept(txVisitor));
		System.out.println(tShirt.accept(txVisitor));
		System.out.println(shirt.accept(txVisitor));
		
		System.out.println("===========================");
		
		System.out.println(jacket.accept(disVisitor));
		System.out.println(tShirt.accept(disVisitor));
		System.out.println(shirt.accept(disVisitor));
	}
}
