package logic1;

public class WithoutDoubles {
	public static void main(String[] args) {
		WithoutDoubles s = new WithoutDoubles();
		System.out.println(s.withoutDoubles(0, 0, false));
	}

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (noDoubles && die1 == die2) {
			if (die1 == 6)
				return 1 + die2;
			else
				return die1 + 1 + die2;
		}
		return die1 + die2;
	}

}
