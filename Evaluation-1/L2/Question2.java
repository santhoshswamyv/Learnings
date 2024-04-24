package evaluation1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question2 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int size = sc.nextInt();
		int arr[] = new int[size];
		int t = 0;
		while (t < size) {
			arr[t++] = sc.nextInt();
		}

//		int arr[] = { 4, 1, 2, 3, 1, 2, 5, 2 };

		int output[] = new int[arr.length];
		HashMap<Integer, Integer> frequencyCount = new HashMap<>();

		for (int i : arr) {
			if (!frequencyCount.containsKey(i)) {
				frequencyCount.put(i, 0);
			}

			frequencyCount.put(i, frequencyCount.get(i) + 1);
		}

		int j = 0;
		while (j < output.length) {
			int freqAndDigit[] = maxFromMap(frequencyCount);
			frequencyCount.put(freqAndDigit[1], 0);
			for (int i = 0; i < freqAndDigit[0]; i++) {
				output[j++] = freqAndDigit[1];
			}
		}

		System.out.println(Arrays.toString(output));
	}

	public static int[] maxFromMap(HashMap<Integer, Integer> map) {
		int temp[] = new int[2];
		int max = -1;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			if (max < val) {
				max = val;
				temp[0] = val;
				temp[1] = key;
			}
		}
		return temp;
	}

}
