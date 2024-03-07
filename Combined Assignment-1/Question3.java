package combinedassignment1;

import java.util.Scanner;

public class Question3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("BMI Calculator\n");
		System.out.print("Enter the Number of Persons to Check BMI : ");
		byte count = sc.nextByte();
		System.out.println();
		BMI calc[] = new BMI[count];

		int i = 0;
		while (i < calc.length) {
			System.out.print("Enter the Name : ");
			String name = sc.next();
			System.out.print("Enter the Weight : ");
			byte weight = sc.nextByte();
			System.out.print("Enter the Height : ");
			double height = sc.nextDouble();
			height = height / 100.0;

			double bmi = weight / Math.pow(height, 2);

			String result;

			if (bmi <= 18.5) {
				result = "Underweight";
			} else if (bmi > 18.5 && bmi <= 25) {
				result = "normal";
			} else {
				result = "overweight";
			}

			BMI s = new BMI(name, weight, height, bmi, result);
			calc[i++] = s;
			System.out.println();

		}

		for (int j = 0; j < calc.length; j++) {
			for (int j2 = j + 1; j2 < calc.length; j2++) {
				if (calc[j].bmi > calc[j2].bmi) {
					BMI temp = calc[j];
					calc[j] = calc[j2];
					calc[j2] = temp;
				}
			}
		}

		System.out.print("Name \t|\tBMI \t|\t Remark");
		System.out.println();

		for (int j = calc.length - 1; j >= 0; j--) {
			System.out.print(calc[j].name + "\t|\t");
			System.out.printf("%,.2f", calc[j].bmi);
			System.out.print("\t|\t");
			System.out.print(calc[j].result);
			System.out.println();
		}
	}
}

class BMI {
	String name;
	byte weight;
	double height;
	double bmi;
	String result;

	public BMI(String name, byte weight, double height, double bmi, String result) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.bmi = bmi;
		this.result = result;
	}
}
