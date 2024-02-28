package logic2;

public class MakeChocolate {
	public static void main(String[] args) {
		MakeChocolate s = new MakeChocolate();
		System.out.println(s.makeChocolate(0, 0, 0));
	}

	public int makeChocolate(int small, int big, int goal) {
		int maxBig = goal / 5;
		if (maxBig <= big)
			goal -= maxBig * 5;
		else
			goal -= big * 5;

		if (goal <= small)
			return goal;

		return -1;
	}

}
