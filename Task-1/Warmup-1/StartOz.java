package warmup1;

public class StartOz {
	public static void main(String[] args) {
		StartOz s = new StartOz();
		System.out.println(s.startOz("oz"));
	}

	public String startOz(String str) {
		String res = "";
		if (str.length() >= 1 && str.substring(0, 1).equals("o"))
			res += "o";

		if (str.length() >= 2 && str.substring(1, 2).equals("z"))
			res += "z";

		return res;
	}

}
