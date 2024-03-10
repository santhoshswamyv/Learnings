package task3.ap1;

public class MergeTwo {
	public static void main(String[] args) {
		MergeTwo s = new MergeTwo();
		System.out.println(s.mergeTwo(args, args, 0));
	}

	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] result = new String[n];
		int i = 0, j = 0, k = 0;
		while (k < n) {
			int compare = a[i].compareTo(b[j]);
			if (compare <= 0) {
				if (k == 0 || !a[i].equals(result[k - 1])) {
					result[k++] = a[i];
				}
				i++;
			} else {
				if (k == 0 || !b[j].equals(result[k - 1])) {
					result[k++] = b[j];
				}
				j++;
			}
		}
		return result;
	}

}
