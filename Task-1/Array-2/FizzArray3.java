package array2;

public class FizzArray3 {
	public static void main(String[] args) {
		FizzArray3 s = new FizzArray3();
		int start=5,end=3;
		System.out.println(s.fizzArray3(start, end));
	}

	public int[] fizzArray3(int start, int end) {
		int nums[] = new int[end - start];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = start++;
		}

		return nums;
	}

}
