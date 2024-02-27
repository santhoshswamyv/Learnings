package string1;

public class MakeOutWord {
	public static void main(String[] args) {
		MakeOutWord s = new MakeOutWord();
		System.out.println(s.makeOutWord("<<>>", "Sandy"));
	}

	public String makeOutWord(String out, String word) {
		return out.substring(0, 2) + word + out.substring(2, 4);
	}

}
