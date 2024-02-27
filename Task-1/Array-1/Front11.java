package array1;

public class Front11 {
	public static void main(String[] args) {
		Front11 s = new Front11();
		int nums[] = { 7, 3, 1 };
		int nums2[] = { 7, 3, 1 };
		System.out.println(s.front11(nums, nums2));
	}

	public int[] front11(int[] a, int[] b) {
		if (a.length >= 1 && b.length >= 1) {
			int res[] = new int[2];
			res[0] = a[0];
			res[1] = b[0];
			return res;
		}

		if (a.length >= 1 && b.length < 1) {
			int res[] = new int[1];
			res[0] = a[0];
			return res;
		}

		if (a.length < 1 && b.length >= 1) {
			int res[] = new int[1];
			res[0] = b[0];
			return res;
		}

		return a;
	}

}
