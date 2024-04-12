package javaassignment13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop {
	private int laptopId;
	private String brand;
	private String model;
	private double price;

	public Laptop(int laptopId, String brand, String model, double price) {
		this.laptopId = laptopId;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop{" + "laptopId=" + laptopId + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", price="
				+ price + '}';
	}
}

class LaptopPriceComparator implements Comparator<Laptop> {
	@Override
	public int compare(Laptop l1, Laptop l2) {
		return Double.compare(l1.getPrice(), l2.getPrice());
	}
}

public class Question5 {
	public static void main(String[] args) {
		List<Laptop> laptops = new ArrayList<>();
		laptops.add(new Laptop(1, "Dell", "Inspiron 15", 899.99));
		laptops.add(new Laptop(2, "HP", "Pavilion x360", 799.99));
		laptops.add(new Laptop(3, "Lenovo", "IdeaPad 3", 649.99));
		laptops.add(new Laptop(4, "Acer", "Aspire 5", 729.99));

		System.out.println("Laptops before sorting:");
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}

//		Collections.sort(laptops, Comparator.comparingDouble(Laptop::getPrice));
		Collections.sort(laptops, new LaptopPriceComparator());

		System.out.println("\nLaptops after sorting based on price:");
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}
	}
}
