package logic1;

public class TeaParty {
	public static void main(String[] args) {
		TeaParty s = new TeaParty();
		System.out.println(s.teaParty(0, 0));
	}

	public int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5) {
			return 0;
		} else if (tea >= 2 * candy || candy >= 2 * tea) {
			return 2;
		} else {
			return 1;
		}
	}

}
