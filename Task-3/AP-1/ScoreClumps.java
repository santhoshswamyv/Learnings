package task3.ap1;

public class ScoreClumps {
	public static void main(String[] args) {
		ScoreClumps s = new ScoreClumps();
		System.out.println(s.scoresClump(null));
	}

	public boolean scoresClump(int[] scores) {
		for (int i = 0; i < scores.length - 2; i++) {
			if (scores[i + 2] - scores[i] <= 2) {
				return true;
			}
		}

		return false;
	}

}
