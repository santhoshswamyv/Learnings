package array2;

public class MatchUp {
	public static void main(String[] args) {
		MatchUp s = new MatchUp();
		int nums1[]= {1, 2, 2, 6, 99, 99, 7};
		int nums2[]= {2, 7, 6, 2, 6, 7, 2};
		System.out.println(s.matchUp(nums1, nums2));
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int c = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2)
				c++;
		}

		return c;
	}

}
