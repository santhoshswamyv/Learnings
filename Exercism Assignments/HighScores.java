package exercism;

import java.util.*;

public class HighScores {

	List<Integer> highScores;

	public HighScores(List<Integer> highScores) {
		this.highScores = highScores;
	}

	List<Integer> scores() {
		return highScores;
	}

	Integer latest() {
		return highScores.get(highScores.size() - 1);
	}

	Integer personalBest() {
		return Collections.max(highScores);
	}

	List<Integer> personalTopThree() {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (Integer score : highScores) {
			pq.add(score);
			if (pq.size() > 3) {
				pq.poll();
			}
		}
		List<Integer> topThree = new ArrayList<>(pq);
		Collections.sort(topThree);
		Collections.reverse(topThree);
		return topThree;

	}

}
