package array3;

public class LinearIn {
	public static void main(String[] args) {
		LinearIn s = new LinearIn();
		int outer[] = { 1, 2, 4, 4, 6 };
		int inner[] = { 2, 4 };
		System.out.println(s.linearIn(outer, inner));
	}

	public boolean linearIn(int[] outer, int[] inner) {
		int count = 0;
		for (int i = 0; i < inner.length; i++) {
			for (int j = 0; j < outer.length; j++) {
				if (inner[i] == outer[j]) {
					count++;
					break;
				}
			}
		}

		return count == inner.length;
	}

}
