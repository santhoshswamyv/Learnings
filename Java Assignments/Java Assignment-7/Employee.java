package javaassignment7;

public class Employee {
	// Instance variables
	private String name;
	private int employeeId;
	private String department;
	private double salary;

	// Static variable
	private static int numberOfEmployees;

	// Constructor
	public Employee(String name, int employeeId, String department, double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
		numberOfEmployees++; // Increment the static variable
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Getter for employeeId
	public int getEmployeeId() {
		return employeeId;
	}

	// Getter for department
	public String getDepartment() {
		return department;
	}

	// Getter for salary
	public double getSalary() {
		return salary;
	}

	// Static method to get the total number of employees
	public static int getNumberOfEmployees() {
		return numberOfEmployees;
	}
}
