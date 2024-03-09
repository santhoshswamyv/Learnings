package task1;

public class Triangle {
	public static void main(String[] args) {
		Triangle s = new Triangle();
		System.out.println(s.triangle(34));
	}

	public int triangle(int rows) {
		if (rows == 0)
			return 0;
		return rows + triangle(rows - 1);
	}

}
