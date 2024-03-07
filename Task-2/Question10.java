package task2;

public class Question10 {
	public static void main(String[] args) {
		String st = "i love india";
		String str[] = st.split(" ");
		System.out.println(reverseString(str, 0));
	}

	public static String reverseString(String[] str, int index) {
		if (index == str.length - 1) {
			return str[index];
		} else {
			return reverseString(str, index + 1) + " " + str[index];
		}
	}
}
