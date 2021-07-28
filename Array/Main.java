package Array;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);

		for (int i = 0; i < myIntegers.length; i++) {
			System.out.println("Element " + i + ", type value was " + myIntegers[i]);
		}
		System.out.println("The average is " + getAverage(myIntegers));
	}

	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity + " integer values. \r");

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		return array;
	}

	public static double getAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return (double) sum / (double) array.length;
	}

}
