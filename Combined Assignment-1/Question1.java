package combinedassignment1;

import java.util.Scanner;

public class Question1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double weights[] = new double[10];
		int i = 0;
		while (i < weights.length) {
			weights[i++] = sc.nextDouble();
		}

		short overallWeight = 0;
		i = 0;
		while (i < weights.length) {
			overallWeight += weights[i++];
		}

		float averageWeight = overallWeight / weights.length;

		System.out.println("Average Weight of 10 Peoples : " + averageWeight);

	}
}
