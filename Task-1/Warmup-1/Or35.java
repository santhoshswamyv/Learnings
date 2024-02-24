package warmup1;

public class Or35 {
	public static void main(String[] args) {
		Or35 s = new Or35();
		System.out.println(s.or35(9));
	}

	public boolean or35(int n) {
		if (n % 3 == 0 || n % 5 == 0)
			return true;
		
		return false;
	}

}
