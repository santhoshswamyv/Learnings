package task3.ap1;

public class ScoreUp {
	public static void main(String[] args) {
		ScoreUp s = new ScoreUp();
		System.out.println(s.scoreUp(args, args));
	}

	public int scoreUp(String[] key, String[] answers) {
		int score = 0;
		for (int i = 0; i < key.length; i++) {

			if (answers[i].equals("?"))
				continue;
			else if (key[i].equals(answers[i])) {
				score += 4;
			} else {
				score -= 1;
			}
		}

		return score;
	}

}
