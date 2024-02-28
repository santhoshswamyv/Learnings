package logic1;

public class SquirrelPlay {
	public static void main(String[] args) {
		SquirrelPlay s = new SquirrelPlay();
		System.out.println(s.squirrelPlay(0, false));
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer) {
			if (temp >= 60 && temp <= 100)
				return true;
		}

		if (temp >= 60 && temp <= 90)
			return true;

		return false;
	}

}
