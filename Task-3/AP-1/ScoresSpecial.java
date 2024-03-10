package task3.ap1;

public class ScoresSpecial {
	public static void main(String[] args) {
		ScoresSpecial s = new ScoresSpecial();
		System.out.println(s.scoresSpecial(null, null));
	}

	public int scoresSpecial(int[] a, int[] b) {
		return largestSpecialScore(a) + largestSpecialScore(b);
	}

	int largestSpecialScore(int[] scores) {
		int max = 0;
		for (int score : scores) {
			if (score % 10 == 0 && score > max) {
				max = score;
			}
		}
		return max;
	}

}
