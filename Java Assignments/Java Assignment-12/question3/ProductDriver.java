package javaassignment12.question3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductDriver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Set<Product> allProducts = new HashSet<>();
		ArrayList<Product> shoppingCart = new ArrayList<>();
		double totalCost = 0;
		ElectronicsProduct ep = new ElectronicsProduct();
		ep.addEproducts();
		ClothingProduct cp = new ClothingProduct();
		cp.addCproducts();
		BookProduct bp = new BookProduct();
		bp.addBproducts();
		int i = 0;
		System.out.println("\t\tShopping Market\n");
		System.err.println("SNo\tProduct ID\tProduct Name\t\tProduct Price");
		for (Product product : ep.electronics) {
			System.out.print(++i);
			ep.getDescription(product);
			allProducts.add(product);
		}
		for (Product product : cp.clothes) {
			System.out.print(++i);
			cp.getDescription(product);
			allProducts.add(product);
		}
		for (Product product : bp.books) {
			System.out.print(++i);
			bp.getDescription(product);
			allProducts.add(product);
		}
		System.out.println();
		System.out.println();
		boolean b = true;
		do {
			System.out.print("Enter the Product ID : ");
			String productId = sc.next();
			for (Product product : allProducts) {
				if (product.getProductId().equals(productId)) {
					shoppingCart.add(product);
				}
			}
			System.out.println();
			System.err.print("Enter 0 to Checkout or any Number to Continue");
			System.out.println();
			String opt = sc.next();
			if (opt.equals("0"))
				b = false;
		} while (b);

		System.err.println("Product ID\tProduct Name\t\tProduct Price");

		for (Product product : shoppingCart) {
			for (Product product2 : allProducts) {
				if (product.getProductId().equals(product2.getProductId())) {
					System.out.println(product.getProductId() + "  \t\t" + product.getProductName() + "\t\t\t"
							+ product.getProductPrice());
					totalCost += product.getProductPrice();
					break;
				}
			}
		}
		System.out.println();
		System.err.println("Total Cost : " + totalCost);

	}
}
