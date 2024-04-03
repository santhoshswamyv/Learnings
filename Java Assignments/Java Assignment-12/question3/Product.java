package javaassignment12.question3;

abstract class Product {
	String productId;
	String productName;
	double productPrice;

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	Product() {

	}

	Product(String productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	abstract double getPrice(Product product);

	abstract void getDescription(Product product);
}
