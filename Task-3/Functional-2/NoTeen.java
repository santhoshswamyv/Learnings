package task3.functional2;

import java.util.List;

public class NoTeen {
	public static void main(String[] args) {
		NoTeen s = new NoTeen();
		System.out.println(s.noTeen(null));
	}

	public List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(n -> n >= 13 && n <= 19);

		return nums;
	}

}
