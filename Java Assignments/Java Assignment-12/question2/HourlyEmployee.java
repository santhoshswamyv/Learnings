package javaassignment12.question2;

public class HourlyEmployee extends Employee {
	private final double HOURLYRATE = 200;
	private int hoursWorked;

	public HourlyEmployee(int id, String name, int hoursWorked) {
		super(id, name);
		this.hoursWorked = hoursWorked;
	}

	@Override
	double calculatePay() {
		return HOURLYRATE * hoursWorked;
	}

	@Override
	void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("Salary for Hourly Employee : " + calculatePay());
	}
}
