package string3;

public class MaxBlocks {
	public static void main(String[] args) {
		MaxBlocks s = new MaxBlocks();
		System.out.println(s.maxBlock(null));
	}

	public int maxBlock(String str) {
		int c1 = 1, c2 = 0;
		for (int i = 0; i < str.length(); i++) {
			c1 = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					c1++;
				else
					break;
			}
			if (c1 > c2) {
				c2 = c1;
			}
		}
		return c2;
	}

}
