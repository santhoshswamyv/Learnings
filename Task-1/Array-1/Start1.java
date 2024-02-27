package array1;

public class Start1 {
	public static void main(String[] args) {
		Start1 s = new Start1();
		int nums[] = { 7, 3, 1 };
		int nums2[] = { 7, 3, 1 };
		System.out.println(s.start1(nums, nums2));
	}

	public int start1(int[] a, int[] b) {
		if (a.length > 0 && b.length > 0) {
			if (a[0] == 1 && b[0] == 1) {
				return 2;
			} else if (a[0] == 1)
				return 1;
			else if (b[0] == 1)
				return 1;
		} else if (a.length > 0 && b.length < 1) {
			if (a[0] == 1)
				return 1;
		} else if (b.length > 0 && a.length < 1)
			if (b[0] == 1)
				return 1;

		return 0;

	}

}
