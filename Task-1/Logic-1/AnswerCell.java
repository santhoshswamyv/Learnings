package logic1;

public class AnswerCell {
	public static void main(String[] args) {
		AnswerCell s = new AnswerCell();
		System.out.println(s.answerCell(false, false, false));
	}

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			return false;
		}
		if (isMorning) {
			return isMom;
		}
		return true;
	}

}
