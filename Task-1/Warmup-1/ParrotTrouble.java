package warmup1;

public class ParrotTrouble {

	public static void main(String[] args) {
		ParrotTrouble s = new ParrotTrouble();
		System.out.println(s.parrotTrouble(false, 0));
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		if (hour < 7 || hour > 20) {
			if (talking)
				return true;
		}

		return false;
	}

}
