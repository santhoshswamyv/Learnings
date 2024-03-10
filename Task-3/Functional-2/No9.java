package task3.functional2;

import java.util.List;

public class No9 {
	public static void main(String[] args) {
		No9 s = new No9();
		System.out.println(s.no9(null));
	}

	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf(n -> n % 10 == 9);
		return nums;
	}

}
