package logic1;

public class CaughtSpeeding {
	public static void main(String[] args) {
		CaughtSpeeding s = new CaughtSpeeding();
		System.out.println(s.caughtSpeeding(0, false));
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday && speed <= 65 || speed <= 60)
			return 0;
		if (isBirthday && speed >= 66 && speed <= 85 || speed >= 61 && speed <= 80)
			return 1;
		if (isBirthday && speed >= 86 || speed >= 81)
			return 2;

		return 0;
	}

}
