package array2;

public class FizzBuzz {
	public static void main(String[] args) {
		FizzBuzz s = new FizzBuzz();
		
		int start=5,end=3;
		System.out.println(s.fizzBuzz(start, end));
	}

	public String[] fizzBuzz(int start, int end) {
		String res[] = new String[end - start];
		for (int i = start, j = 0; i < end; i++, j++) {
			if (i % 3 == 0 && i % 5 == 0)
				res[j] = "FizzBuzz";
			else if (i % 3 == 0)
				res[j] = "Fizz";
			else if (i % 5 == 0)
				res[j] = "Buzz";
			else
				res[j] = String.valueOf(i);
		}

		return res;
	}
}
