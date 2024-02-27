package string1;

public class StartWord {
	public static void main(String[] args) {
		StartWord s = new StartWord();
		System.out.println(s.startWord("Hippo", "Hi"));
	}

	public String startWord(String str, String word) {
		if (str.length() >= word.length() && str.substring(1, word.length()).equals(word.substring(1))) {
			return str.substring(0, word.length());
		}
		return "";
	}

}
