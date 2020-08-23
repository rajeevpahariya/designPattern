package iteratorPattern.iterator1;

public class Seller {
	GeekyStoreCatalog geekyStoreCatalog;
	DevStoreCatalog devStoreCatalog;

	public Seller(GeekyStoreCatalog geekyStoreCatalog, DevStoreCatalog devStoreCatalog) {
		this.geekyStoreCatalog = geekyStoreCatalog;
		this.devStoreCatalog = devStoreCatalog;
	}

	public void printCatalog() {
		GeekyStoreIterator geekyStoreIterator = geekyStoreCatalog.createIterator();
		System.out.println("Printing Geeky Catalog: ");
		printCatalog(geekyStoreIterator);

		System.out.println("Printing Dev Catalog: ");

		DevStoreIterator devStoreIterator = devStoreCatalog.createIterator();
		printCatalog(devStoreIterator);

	}

	private void printCatalog(GeekyStoreIterator iterator) {
		while (iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.print(product.getName() + ", ");
			System.out.print(product.getDescription() + " ");
			System.out.println(product.getPrice());
		}
	}
	
	private void printCatalog(DevStoreIterator iterator) {
		while (iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.print(product.getName() + ", ");
			System.out.print(product.getDescription() + " ");
			System.out.println(product.getPrice());
		}
	}
}
