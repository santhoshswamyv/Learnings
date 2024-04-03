package javaassignment12.question3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClothingProduct extends Product {

	Set<Product> clothes = new HashSet<>();

	public ClothingProduct(String productId, String productName, double productPrice) {
		super(productId, productName, productPrice);
	}

	ClothingProduct() {
	}

	void addCproducts() {
		clothes.add(new ClothingProduct("CP1", "T-Shirt", 600));
		clothes.add(new ClothingProduct("CP2", "Shirt", 700));
		clothes.add(new ClothingProduct("CP3", "Jeans", 900));
	}

	@Override
	double getPrice(Product product) {
		Iterator<Product> it = clothes.iterator();
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
