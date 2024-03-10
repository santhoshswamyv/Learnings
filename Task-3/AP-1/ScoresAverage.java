package task3.ap1;

public class ScoresAverage {
	public static void main(String[] args) {
		ScoresAverage s = new ScoresAverage();
		System.out.println(s.scoresAverage(null));
	}

	public int scoresAverage(int[] scores) {
		int avg1 = average(scores, 0, scores.length / 2 - 1);
		int avg2 = average(scores, scores.length / 2, scores.length - 1);
		return avg1 > avg2 ? avg1 : avg2;
	}

	int average(int[] scores, int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += scores[i];
		}

		return sum / (scores.length / 2);
	}
}
