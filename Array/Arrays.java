package Array;

public class Arrays {

	public static void main(String[] args) {
		int[] myIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int myVariable = 50;
		int[] myVariable;
		myVariable = new int[15];

		// OR

		int[] myIntArray2 = new int[10];
		myIntArray2[5] = 45;
		myIntArray2[5] = 476;
		myIntArray2[5] = 50;
		double[] myDoubleArray = new double[10];

		System.out.println(myIntArray[0]);
		System.out.println(myIntArray[6]);
		System.out.println(myIntArray[8]);

		System.out.println(myIntArray2[5]);

		for (int index : myIntArray2) {
			System.out.println("myIntArray2 = " + index);
		}

		for (int i = 0; i < myIntArray.length; i++) {
			System.out.println(myIntArray[i]);
		}

		for (int i = 0; i < 10; i++) {
			myIntArray[i] = i * 10;

		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Element " + i + ", value is " + myIntArray[i]);

		}

		for (int i = 0; i < myVariable.length; i++) {
			myVariable[i] = i * 10;
		}

		for (int i = 0; i < myVariable.length; i++) {
			System.out.println("Element " + i + ", value is " + myVariable[i]);

		}

		printArray(myIntArray2);
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + ", value is " + array[i]);

		}
	}

}
