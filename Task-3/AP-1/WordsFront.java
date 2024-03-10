package task3.ap1;

public class WordsFront {
	public static void main(String[] args) {
		WordsFront s = new WordsFront();
		System.out.println(s.wordsFront(args, 0));
	}

	public String[] wordsFront(String[] words, int n) {

		String[] res = new String[n];

		for (int i = 0; i < n; i++) {
			res[i] = words[i];
		}
		return res;
	}

}
