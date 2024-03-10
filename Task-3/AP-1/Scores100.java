package task3.ap1;

public class Scores100 {
	public static void main(String[] args) {
		Scores100 s = new Scores100();
		System.out.println(s.scores100(null));
	}

	public boolean scores100(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] == 100 && scores[i + 1] == 100) {
				return true;
			}
		}
		return false;
	}

}
