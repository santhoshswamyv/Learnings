package warmup1;

public class MonkeyTrouble {

	public static void main(String[] args) {
		MonkeyTrouble s = new MonkeyTrouble();
		System.out.println(s.monkeyTrouble(false, false));
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile && bSmile)
			return true;
		else if (!aSmile && !bSmile)
			return true;

		return false;

	}

}
