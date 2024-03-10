package task3.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
	public static void main(String[] args) {
		Two2 s = new Two2();
		System.out.println(s.two2(null));
	}

	public List<Integer> two2(List<Integer> nums) {
		return nums.stream().map(n -> n * 2).filter(n -> n % 10 != 2).collect(Collectors.toList());
	}

}
