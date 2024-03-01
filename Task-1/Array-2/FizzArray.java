package array2;

public class FizzArray {
	public static void main(String[] args) {
		FizzArray s = new FizzArray();
		int n=4;
		System.out.println(s.fizzArray(n));
	}

	public int[] fizzArray(int n) {
		int nums[] = new int[n];
		for (int i = 0; i < nums.length; i++)
			nums[i] = i;

		return nums;
	}

}
