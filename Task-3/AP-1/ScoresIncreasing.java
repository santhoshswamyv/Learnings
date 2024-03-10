package task3.ap1;

public class ScoresIncreasing {
	public static void main(String[] args) {
		ScoresIncreasing s = new ScoresIncreasing();
		System.out.println(s.scoresIncreasing(null));
	}

	public boolean scoresIncreasing(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] > scores[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
