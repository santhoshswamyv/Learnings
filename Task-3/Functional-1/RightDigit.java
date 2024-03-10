package task3.functional1;

import java.util.List;

public class RightDigit {
	public static void main(String[] args) {
		RightDigit s = new RightDigit();
		System.out.println(s.rightDigit(null));
	}

	public List<Integer> rightDigit(List<Integer> nums) {
		nums.replaceAll(n -> n % 10);
		return nums;
	}

}
