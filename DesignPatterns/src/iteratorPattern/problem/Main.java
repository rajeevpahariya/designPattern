package iteratorPattern.problem;

public class Main {

	// Here we have added different for loop and one for array and one for arrayList
	public static void main(String[] args) {
		DevStoreCatalog devStoreCatalog = new DevStoreCatalog();
		GeekyStoreCatalog geekyStoreCatalog = new GeekyStoreCatalog();
		// loop through dev Catalog - Array
		for (int i = 0; i < devStoreCatalog.getCatalog().length; i++) {
			Product product = devStoreCatalog.getCatalog()[i];
			System.out.print(product.getName() + " ");
			System.out.print(product.getDescription() + " ");
			System.out.println(product.getPrice());
		}

		System.out.println("---------");
		// loop through geeky catalog - ArrayList
		for (int i = 0; i < geekyStoreCatalog.getCatalog().size(); i++) {
			Product product = (Product) geekyStoreCatalog.getCatalog().get(i);
			System.out.print(product.getName() + " ");
			System.out.print(product.getDescription() + " ");
			System.out.println(product.getPrice());
		}
	}
}
