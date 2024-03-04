package string3;

import java.util.ArrayList;

public class SumNumbers {
	public static void main(String[] args) {
		SumNumbers s = new SumNumbers();
		System.out.println(s.sumNumbers(null));
	}

	public int sumNumbers(String str) {
		String temp = "";
		ArrayList<String> temps = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				temp += str.charAt(i);
			}

			if ((!Character.isDigit(str.charAt(i)) || i == str.length() - 1) && !temp.equals("")) {
				temps.add(temp);
				temp = "";
			}
		}

		int sum = 0;
		for (int i = 0; i < temps.size(); i++) {
			sum += Integer.parseInt(temps.get(i));
		}

		return sum;
	}

}
