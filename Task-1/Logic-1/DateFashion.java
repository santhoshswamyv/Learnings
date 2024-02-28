package logic1;

public class DateFashion {
	public static void main(String[] args) {
		DateFashion s = new DateFashion();
		System.out.println(s.dateFashion(0, 0));
	}

	public int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2)
			return 0;

		if (you >= 8 || date >= 8)
			return 2;

		return 1;
	}

}