package combinedassignment1;

import java.util.Scanner;

public class Question4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Default Values of Instance Variables");
		Product dv = new Product();
		dv.defaultValues();

		System.out.print("\nProduct Name : ");
		String name = sc.next();

		System.out.print("\nProduct Type : ");
		char type = sc.next().charAt(0);

		System.out.print("\nProduct Code : ");
		long code = sc.nextLong();

		System.out.print("\nProduct Price : ");
		double price = sc.nextDouble();

		System.out.print("\nProduct Quantity : ");
		short quantity = sc.nextShort();

		System.out.println();

		Product s = new Product(name, type, code, price, quantity);
		s.printProduct();
	}

}

class Product {
	String pName;
	char pType;
	long pCode;
	double pPrice;
	short pQuantity;

	public Product() {
	}

	public Product(String pName, char pType, long pCode, double pPrice, short pQuantity) {
		this.pName = pName;
		this.pType = pType;
		this.pCode = pCode;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
	}

	public void defaultValues() {
		System.out.println(pName);
		System.out.println(pType);
		System.out.println(pCode);
		System.out.println(pPrice);
		System.out.println(pQuantity);
	}

	public void printProduct() {
		System.err.println("Product Details\n");
		System.out.println("Product Name : " + pName);
		System.out.println("Product Type : " + pType);
		System.out.println("Product Code : " + pCode);
		System.out.println("Product Price : " + pPrice);
		System.out.println("Product Quantity : " + pQuantity);
	}

}