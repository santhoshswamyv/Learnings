package javaassignment7;

public class Flight {
	// Instance variables
	private String flightNumber;
	private String origin;
	private String destination;
	private double price;

	// Static variable
	private static int totalFlights;

	// Constructor
	public Flight(String flightNumber, String origin, String destination, double price) {
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.price = price;
		totalFlights++; // Increment the static variable
	}

	// Getter for flightNumber
	public String getFlightNumber() {
		return flightNumber;
	}

	// Getter for origin
	public String getOrigin() {
		return origin;
	}

	// Getter for destination
	public String getDestination() {
		return destination;
	}

	// Getter for price
	public double getPrice() {
		return price;
	}

	// Static method to get the total number of flights
	public static int getTotalFlights() {
		return totalFlights;
	}
}
