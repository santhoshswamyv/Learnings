package javaassignment9;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee s = new HourlyEmployee("Nagaraj", 1, 23);
		s.getEmployeeDetails();

		System.out.println();

		s = new SalariedEmployee("Selva", 2, 18000);
		s.getEmployeeDetails();
	}
}

class Employee {
	String name;
	int employeeId;

	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public void getEmployeeDetails() {
		System.out.println("Name: " + name + "\nEmployee ID: " + employeeId);
	}

}

class HourlyEmployee extends Employee {
	int hoursWorked;

	public HourlyEmployee(String name, int employeeId, int hoursWorked) {
		super(name, employeeId);
		this.hoursWorked = hoursWorked;
	}

	public void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("Hours Worked : " + hoursWorked);
	}
}

class SalariedEmployee extends Employee {
	double salary;

	public SalariedEmployee(String name, int employeeId, double salary) {
		super(name, employeeId);
		this.salary = salary;
	}

	public void getEmployeeDetails() {
		super.getEmployeeDetails();
		System.out.println("Salary : " + salary);
	}
}
