package Array;

import java.util.Arrays;

public class ArrayChallenge2 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Array = " + Arrays.toString(array));

		reverse(array);

		System.out.println("Reverse Array = " + Arrays.toString(array));

	}

	private static void reverse(int[] array) {

		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		for (int i = 0; i < halfLength; i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - 1] = temp;
		}
	}

}
