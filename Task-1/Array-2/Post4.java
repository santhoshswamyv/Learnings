package array2;

public class Post4 {
	public static void main(String[] args) {
		Post4 s = new Post4();
		int nums[]= {1, 2, 2, 6, 99, 99, 7};
		System.out.println(s.post4(nums));
	}

	public int[] post4(int[] nums) {
		int i = 0;
		int index = 0;
		while (i < nums.length) {
			if (nums[i] == 4) {
				index = i + 1;
			}
			i++;
		}
		int res[] = new int[nums.length - index];

		for (int j = 0; index < nums.length; index++) {
			res[j++] = nums[index];
		}
		return res;
	}

}
