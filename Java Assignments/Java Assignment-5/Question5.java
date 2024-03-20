package javaassignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Number of Rows : ");
		int weights[][] = new int[sc.nextInt()][];
		int minWeights[] = new int[weights.length];
		for (int i = 0; i < weights.length; i++) {
			System.out.print("Enter the Weight of Persons in Row  : ");
			weights[i] = new int[sc.nextInt()];
			for (int j = 0; j < weights[i].length; j++) {
				weights[i][j] = sc.nextInt();
			}
			Arrays.sort(weights[i]);
			minWeights[i] = weights[i][0];
		}
		int row = sc.nextInt();
		if (row > 0 && row < minWeights.length) {
			System.out.print("Select the Row to Find the Minimum Weight : " + minWeights[row - 1]);
		} else {
			System.out.print("Selected  Row is not Available");
		}
	}
}
