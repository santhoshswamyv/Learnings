package javaassignment12.question3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookProduct extends Product {

	Set<Product> books = new HashSet<>();

	public BookProduct(String productId, String productName, double productPrice) {
		super(productId, productName, productPrice);
	}

	BookProduct() {
	}

	void addBproducts() {
		books.add(new BookProduct("BP1", "Leo", 500));
		books.add(new BookProduct("BP2", "Tiger", 400));
		books.add(new BookProduct("BP3", "Lion", 400));
	}

	@Override
	double getPrice(Product product) {
		Iterator<Product> it = books.iterator();
		while (it.hasNext()) {
			if (it.next().equals(product)) {
				return product.getProductPrice();
			}
		}
		return 0;
	}

	@Override
	void getDescription(Product product) {
		System.out.println("  \t" + product.getProductId() + "  \t\t" + product.getProductName() + "\t\t\t"
				+ product.getProductPrice());
	}

}
