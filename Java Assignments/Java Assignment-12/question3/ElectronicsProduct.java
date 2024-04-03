package javaassignment12.question3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ElectronicsProduct extends Product {

	Set<Product> electronics = new HashSet<>();

	ElectronicsProduct() {
	}

	public ElectronicsProduct(String productId, String productName, double productPrice) {
		super(productId, productName, productPrice);
	}

	void addEproducts() {
		electronics.add(new ElectronicsProduct("EP1", "Laptop", 100000));
		electronics.add(new ElectronicsProduct("EP2", "Mouse", 300));
		electronics.add(new ElectronicsProduct("EP3", "Speaker", 500));
	}

	@Override
	double getPrice(Product product) {
		Iterator<Product> it = electronics.iterator();
		while (it.hasNext()) {
			if (it.next().equals(product)) {
				return product.getProductPrice();
			}
		}
		return 0;
	}

	@Override
	void getDescription(Product product) {
		System.out.println("  \t"+product.getProductId() + "  \t\t" + product.getProductName() + "\t\t\t" + product.getProductPrice());
	}

}
