package exercism;

import java.util.Arrays;

public class BirdWatcher {
	private final int[] birdsPerDay;

	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay.clone();
	}

	public int[] getLastWeek() {
		return this.birdsPerDay;
	}

	public int getToday() {
		return this.birdsPerDay[birdsPerDay.length - 1];
	}

	public void incrementTodaysCount() {
		this.birdsPerDay[birdsPerDay.length - 1] = this.birdsPerDay[birdsPerDay.length - 1] + 1;
	}

	public boolean hasDayWithoutBirds() {
		for (int n : this.birdsPerDay) {
			if (n == 0)
				return true;
		}
		return false;
	}

	public int getCountForFirstDays(int numberOfDays) {
		return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();

	}

	public int getBusyDays() {
		int busyDays = 0;
		for (int n : this.birdsPerDay) {
			if (n >= 5)
				busyDays++;
		}

		return busyDays;
	}
}
