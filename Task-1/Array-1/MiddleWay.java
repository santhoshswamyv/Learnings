package array1;

public class MiddleWay {
	public static void main(String[] args) {
		MiddleWay s = new MiddleWay();
		int nums[] = { 7, 3, 1 };
		int nums2[] = { 7, 3, 1 };
		System.out.println(s.middleWay(nums, nums2));
	}

	public int[] middleWay(int[] a, int[] b) {
		int nums[] = { a[1], b[1] };
		return nums;
	}

}
