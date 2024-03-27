package javaassignment9;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v = new Bike();
		v.start();
		v.stop();

		System.out.println();

		v = new Car();
		v.start();
		v.stop();
	}
}

class Vehicle {

	public void start() {
		System.out.println("Vehicle Starts");
	}

	public void stop() {
		System.out.println("Vehicle Stops");
	}
}

class Car extends Vehicle {
	public void start() {
		System.out.println("Car Starts");
	}

	public void stop() {
		System.out.println("Car Stops");
	}
}

class Bike extends Vehicle {
	public void start() {
		System.out.println("Bike Starts");
	}

	public void stop() {
		System.out.println("Bike Stops");
	}
}