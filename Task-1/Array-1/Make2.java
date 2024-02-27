package array1;

public class Make2 {
	public static void main(String[] args) {
		Make2 s = new Make2();
		int nums[] = { 7, 3, 1 };
		int nums2[] = { 7, 3, 1 };
		System.out.println(s.make2(nums, nums2));
	}

	public int[] make2(int[] a, int[] b) {
		int[] result = new int[2];
		if (a.length >= 2) {
			result[0] = a[0];
			result[1] = a[1];
		} else if (a.length == 1) {
			result[0] = a[0];
			result[1] = b[0];
		} else {
			result[0] = b[0];
			result[1] = b[1];
		}
		return result;
	}

}
