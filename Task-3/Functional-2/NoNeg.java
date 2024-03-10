package task3.functional2;

import java.util.List;

public class NoNeg {
	public static void main(String[] args) {
		NoNeg s = new NoNeg();
		System.out.println(s.noNeg(null));
	}

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(n -> n < 0);

		return nums;
	}

}
