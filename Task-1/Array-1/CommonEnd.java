package array1;

public class CommonEnd {
	public static void main(String[] args) {
		CommonEnd s = new CommonEnd();
		int nums[] = { 7, 3, 1 };
		int nums2[] = { 7, 3, 1 };
		System.out.println(s.commonEnd(nums, nums2));
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
			return true;

		return false;
	}

}
