package javaassignment2;

import java.util.Scanner;

public class Question1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Celcius : ");

		System.out.println("Farenheit : " + celciusToFarenheit(sc.nextFloat()));
	}

	public static float celciusToFarenheit(float celcius) {

		float farenheit = celcius * 9 / 5 + 32;
		return farenheit;
	}
}
