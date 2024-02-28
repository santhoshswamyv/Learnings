package logic1;

public class CigarParty {
	public static void main(String[] args) {
		CigarParty s = new CigarParty();
		System.out.println(s.cigarParty(40, false));
	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			return cigars >= 40;
		}

		return cigars >= 40 && cigars <= 60;
	}

}
