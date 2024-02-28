package logic1;

public class SpecialEleven {
	public static void main(String[] args) {
		SpecialEleven s = new SpecialEleven();
		System.out.println(s.specialEleven(22));
	}

	public boolean specialEleven(int n) {
		return (n % 11 == 0 || n % 11 == 1);
	}

}
