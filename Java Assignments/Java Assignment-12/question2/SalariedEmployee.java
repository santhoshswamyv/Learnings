package javaassignment12.question2;

public class SalariedEmployee extends Employee {
	private final double PERDAYSALARY = 1600;
	private int days;

	public SalariedEmployee(int id, String name, int days) {
		super(id, name);
		this.days = days;
	}

	@Override
	double calculatePay() {
		return PERDAYSALARY * days;
	}

	@Override
	void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("Salary for Salaried Employee  : " + calculatePay());
	}
}
