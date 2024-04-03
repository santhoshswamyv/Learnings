package javaassignment12.question2;

abstract class Employee {
	protected int id;
	protected String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	abstract double calculatePay();

	void getEmployeeDetails() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
	}
}
