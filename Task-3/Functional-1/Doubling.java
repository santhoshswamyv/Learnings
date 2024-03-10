package task3.functional1;

import java.util.List;

public class Doubling {
	public static void main(String[] args) {
		Doubling s = new Doubling();
		System.out.println(s.doubling(null));
	}

	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		return nums;
	}

}
