package task3.ap1;

public class CommonTwo {
	public static void main(String[] args) {
		CommonTwo s = new CommonTwo();
		System.out.println(s.commonTwo(args, args));
	}

	public int commonTwo(String[] a, String[] b) {
		int count = 0;
		int i = 0, j = 0;
		while (i < a.length && j < b.length) {
			int compare = a[i].compareTo(b[j]);
			if (compare == 0) {
				count++;
				while (i < a.length - 1 && a[i].equals(a[i + 1])) {
					i++;
				}
				while (j < b.length - 1 && b[j].equals(b[j + 1])) {
					j++;
				}
				i++;
				j++;
			} else if (compare < 0) {
				i++;
			} else {
				j++;
			}
		}
		return count;
	}

}
