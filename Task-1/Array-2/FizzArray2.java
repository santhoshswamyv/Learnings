package array2;

public class FizzArray2 {
	public static void main(String[] args) {
		FizzArray2 s = new FizzArray2();
		int n=4;
		System.out.println(s.fizzArray2(n));
	}

	public String[] fizzArray2(int n) {
		String nums[] = new String[n];
		for (int i = 0; i < nums.length; i++)
			nums[i] = "" + i;

		return nums;
	}

}
