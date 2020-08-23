package iteratorPattern.iterator1;

public class Main {
	public static void main(String[] args) {
		DevStoreCatalog devStoreCatalog = new DevStoreCatalog();
		GeekyStoreCatalog geekyStoreCatalog = new GeekyStoreCatalog();
		Seller seller = new Seller(geekyStoreCatalog, devStoreCatalog);
		seller.printCatalog();
	}
}
