package combinedassignment1;

public class Question2 {
	public static void main(String[] args) {
		byte a = 10;
		if (a > 5) {
			byte b = 20;
			System.out.println(b); // Here b is visible because b is initialized in this block
		}
		System.out.println(a);
//		System.out.println(b);  //Compile Time Error (b is inside the if block it is not visible)
	}
}
