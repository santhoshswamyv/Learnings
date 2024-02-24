package warmup1;

public class MixStart {
	public static void main(String[] args) {
		MixStart s = new MixStart();
		System.out.println(s.mixStart("pix"));
	}

	public boolean mixStart(String str) {
		if (str.length() > 2) {
			String s = str.substring(1, 3);
			if (s.equals("ix"))
				return true;
		}
		return false;
	}

}
