package array1;

public class Bigger2 {
	public static void main(String[] args) {
		Bigger2 s = new Bigger2();
		int nums[] = { 7, 3, 1 };
		int nums2[] = { 7, 3, 1 };
		System.out.println(s.biggerTwo(nums, nums2));
	}

	public int[] biggerTwo(int[] a, int[] b) {
		int max = Math.max((a[0] + a[1]), b[0] + b[1]);
		if (max == a[0] + a[1]) {
			return a;
		}

		if (max == b[0] + b[1])
			return b;

		return a;

	}

}
