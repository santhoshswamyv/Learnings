package array1;

public class PlusTwo {
	public static void main(String[] args) {
		PlusTwo s = new PlusTwo();
		int nums[] = { 7, 3, 1 };
		int nums2[] = { 7, 3, 1 };
		System.out.println(s.plusTwo(nums, nums2));
	}

	public int[] plusTwo(int[] a, int[] b) {
		int res[] = new int[4];
		res[0] = a[0];
		res[1] = a[1];
		res[2] = b[0];
		res[3] = b[1];
		return res;
	}

}
