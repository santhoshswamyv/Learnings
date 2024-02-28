package logic1;

public class NearTen {
	public static void main(String[] args) {
		NearTen s = new NearTen();
		System.out.println(s.nearTen(0));
	}

	public boolean nearTen(int num) {
		return (num % 10 <= 2 || num % 10 >= 8);
	}

}
