package warmup1;

public class SleepIn {

	public static void main(String[] args) {
		SleepIn s = new SleepIn();
		System.out.println(s.sleepIn(false, false));
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (weekday && vacation)
			return true;
		else if (weekday)
			return false;
		else
			return true;
	}

}
