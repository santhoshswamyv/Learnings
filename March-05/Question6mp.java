package march05;

public class Question6mp {
	public static void main(String[] args) {
		int arr[] = { 1, 6, 4 };
		int index = 0;
		System.out.println(array6(arr, index));
	}

	public static boolean array6(int arr[], int index) {

		if (index == arr.length) {
			return false;
		}

		if (arr[index] == 6) {
			return true;
		}

		return array6(arr, index + 1);

	}
}
