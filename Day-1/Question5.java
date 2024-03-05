package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the Number of Strings to be Entered : ");
		int size = sc.nextInt();
		String inps[] = new String[size];
		int i = 0;
		while (i < size) {
			System.out.print("Enter the String : ");
			inps[i++] = sc.next();
		}

		for (int j = 0; j < inps.length; j++) {
			char temp[] = inps[j].toCharArray();
			Arrays.sort(temp);
			String res = "";
			for (int j2 = temp.length - 1; j2 >= 0; j2--) {
				res += temp[j2];
			}
			inps[j] = res;
		}
		i = 1;
		for (String string : inps) {
			System.out.println("String " + i++ + " : " + string);
		}
	}
}
