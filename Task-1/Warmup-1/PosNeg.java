package warmup1;

public class PosNeg {
	public static void main(String[] args) {
		PosNeg s = new PosNeg();
		System.out.println(s.posNeg(0, 0, false));

	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			if (a < 0 && b < 0)
				return true;
			else
				return false;
		} else if (a < 0 && b < 0)
			return false;

		if (a < 0 || b < 0)
			return true;

		return false;
	}

}

//  if (negative) {
//    return (a < 0 && b < 0);
//  }
//  else {
//    return ((a < 0 && b > 0) || (a > 0 && b < 0));
//  }