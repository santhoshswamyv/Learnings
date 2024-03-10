package task3.functional1;

import java.util.List;

public class Math1 {
	public static void main(String[] args) {
		Math1 s = new Math1();
		System.out.println(s.math1(null));
	}

	public List<Integer> math1(List<Integer> nums) {
		nums.replaceAll(n -> (n + 1) * 10);
		return nums;
	}

}
