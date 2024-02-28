package logic1;

public class FizzString2 {
	public static void main(String[] args) {
		FizzString2 s = new FizzString2();
		System.out.println(s.fizzString2(3));
	}

	public String fizzString2(int n) {
		if (n % 3 == 0 && n % 5 == 0)
			return "FizzBuzz!";
		else if (n % 3 == 0)
			return "Fizz!";
		else if (n % 5 == 0)
			return "Buzz!";

		return n + "!";
	}

}
