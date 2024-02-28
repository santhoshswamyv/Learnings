package logic1;

public class AlarmClock {
	public static void main(String[] args) {
		AlarmClock s = new AlarmClock();
		System.out.println(s.alarmClock(0, false));
	}

	public String alarmClock(int day, boolean vacation) {
		if (vacation) {
			if (day == 0 || day == 6) {
				return "off";
			} else {
				return "10:00";
			}
		} else {
			if (day == 0 || day == 6) {
				return "10:00";
			} else {
				return "7:00";
			}
		}
	}

}
