package task2;

import java.util.Scanner;

public class Question5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter a: ");
		double a = sc.nextDouble();

		System.out.print("Enter b: ");
		double b = sc.nextDouble();

		System.out.print("Enter c: ");
		double c = sc.nextDouble();

		double rpart = Math.pow(b, 2) - 4 * a * c;

		if (rpart >= 0) {
			double root1 = (-b + Math.sqrt(rpart)) / (2 * a);
			double root2 = (-b - Math.sqrt(rpart)) / (2 * a);

			System.out.println("The roots of the equation are: " + root1 + " and " + root2);
		} else {
			System.out.println("The equation has no real roots.");
		}

	}
}
