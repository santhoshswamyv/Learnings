package javaassignment2;

import java.util.Scanner;

public class Question5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the Total Seconds : ");

		System.out.println("Total Time : " + convertSeconds(sc.nextInt()));
	}

	public static String convertSeconds(int totalSeconds) {
		if (totalSeconds < 0)
			return "Seconds cannot be Negative";

		int hour = totalSeconds / 3600;
		int minutes = (totalSeconds - (hour * 3600)) / 60;
		int sec = totalSeconds - (hour * 3600) - (minutes * 60);

		String totalTime = "";

		if (hour < 10)
			totalTime += "0" + hour;
		else
			totalTime += hour;

		totalTime += ":";

		if (minutes < 10)
			totalTime += "0" + minutes;
		else
			totalTime += minutes;

		totalTime += ":";

		if (sec < 10)
			totalTime += "0" + sec;
		else
			totalTime += sec;

		return totalTime;
	}

}
