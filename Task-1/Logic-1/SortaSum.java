package logic1;

public class SortaSum {
	public static void main(String[] args) {
		SortaSum s=new SortaSum();
		System.out.println(s.sortaSum(0, 0));
	}
	public int sortaSum(int a, int b) {
		if (a + b < 10 || a + b > 19)
			return a + b;

		return 20;
	}

}
