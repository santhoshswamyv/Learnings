package javaassignment12.question2;

import java.util.Scanner;

public class EmployeeDriver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int id = (int) (Math.random() * 1000);
		System.out.print("Enter the Employee Name : ");
		String empName = sc.nextLine();
		System.out.println("Select the Employee Type : \n1) Hourly Employee \n2) Salaried Employee");
		String option = sc.next();
		if (option.equals("1")) {
			System.out.print("Hours Worked : ");
			int hoursWorked = sc.nextInt();
			Employee emp = new HourlyEmployee(id, empName, hoursWorked);
			emp.getEmployeeDetails();
		} else if (option.equals("2")) {
			System.out.print("Days Worked : ");
			int days = sc.nextInt();
			Employee emp = new SalariedEmployee(id, empName, days);
			emp.getEmployeeDetails();
		} else {
			sc.nextLine();
			main(null);
		}
	}
}
