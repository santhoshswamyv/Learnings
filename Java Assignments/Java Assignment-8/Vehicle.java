package javaassignment8;

public class Vehicle {

	private String model;
	private String manufacturer;
	private int year;

	public Vehicle(String model, String manufacturer, int year) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void displayInfo() {
		System.out.println("Model: " + model);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Year: " + year);
	}
}

class Car extends Vehicle {

	private int numDoors;

	public Car(String model, String manufacturer, int year, int numDoors) {
		super(model, manufacturer, year);
		this.numDoors = numDoors;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Number of Doors: " + numDoors);
	}
}
