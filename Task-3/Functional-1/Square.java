package task3.functional1;

import java.util.List;

public class Square {
	public static void main(String[] args) {
		Square s = new Square();
		System.out.println(s.square(null));
	}

	public List<Integer> square(List<Integer> nums) {
		nums.replaceAll(n -> n * n);
		return nums;
	}

}
