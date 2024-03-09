package javaassignment2;

import java.util.Scanner;

public class Question4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("BMI Calculator\n");

		System.out.print("Enter the Weight(in kg) : ");
		float weight = sc.nextFloat();

		System.out.println();

		System.out.print("Enter the Height(in cm) : ");
		double height = sc.nextDouble();

		height = height / 100.0;

		System.out.println();

		System.out.println(bmiCalculator(weight, height));

	}

	public static float bmiCalculator(float weight, double height) {

		double bmi = weight / Math.pow(height, 2);

		return (float) bmi;

	}
}
