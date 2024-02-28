package logic2;

public class MakeBricks {
	public static void main(String[] args) {
		MakeBricks s = new MakeBricks();
		System.out.println(s.makeBricks(0, 0, 0));
	}

	public boolean makeBricks(int small, int big, int goal) {
		if (goal > big * 5 + small)
			return false;
		else if (goal % 5 > small)
			return false;

		return true;

	}

}
