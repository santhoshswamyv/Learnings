package javaassignment1;

public class Question1 {
	public static void main(String[] args) {

		float floatNum = 10.5f;
		int intNum = (int) floatNum;
		System.out.println("Float value: " + floatNum);
		System.out.println("Converted to int: " + intNum);

		double doubleNum = 20.5;
		floatNum = (float) doubleNum;
		System.out.println("\nDouble value: " + doubleNum);
		System.out.println("Converted to float: " + floatNum);

		intNum = 30000;
		short shortNum = (short) intNum;
		System.out.println("\nInt value: " + intNum);
		System.out.println("Converted to short: " + shortNum);

		long longNum = 238383l;
		intNum = (int) longNum;
		System.out.println("\nInt value: " + longNum);
		System.out.println("Converted to int: " + intNum);
		
	}
}
