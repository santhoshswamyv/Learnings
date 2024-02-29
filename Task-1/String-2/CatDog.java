package string2;

public class CatDog {
	public static void main(String[] args) {
		CatDog s = new CatDog();
		System.out.println(s.catDog("catcat"));
	}

	public boolean catDog(String str) {
		int cc = 0;
		int cd = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if ((str.substring(i, i + 3)).equals("cat"))
				cc++;
			else if ((str.substring(i, i + 3)).equals("dog"))
				cd++;
		}

		return cc == cd;

	}

}
