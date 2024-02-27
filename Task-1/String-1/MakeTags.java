package string1;

public class MakeTags {
	public static void main(String[] args) {
		MakeTags s = new MakeTags();
		System.out.println(s.makeTags("i", "Sandy"));
	}

	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}

}
