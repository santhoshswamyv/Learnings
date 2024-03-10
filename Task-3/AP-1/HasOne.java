package task3.ap1;

public class HasOne {
	public static void main(String[] args) {
		HasOne s = new HasOne();
		System.out.println(s.hasOne(0));
	}

	public boolean hasOne(int n) {
		return (n + "").contains("1");
	}
}