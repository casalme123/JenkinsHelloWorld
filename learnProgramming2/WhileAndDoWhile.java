package learnProgramming2;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		int count = 1;
		while (count != 6) {
			System.out.println("1.) Count value is " + count);
			count++;
		}

//		for (int i = 1; i < 6; i++) {
//			System.out.println("Count value is " + count);
//			System.out.println("Index value is " + i);
//		}

		for (count = 1; count != 6; count++) {
			System.out.println("2.) Count value is " + count);
		}

		count = 1;
		while (true) {
			if (count == 6) {
				break;
			}
			System.out.println("3.) Count value is " + count);
			count++;
		}

		count = 1;
		do {
			System.out.println("4.) Count value was " + count);
			count++;
		} while (count != 6);

		count = 6;

		do {
			System.out.println("5.) Count value was " + count);
			count++;

			if (count > 100) {
				break;
			}
		} while (count != 6);

		// CHALLENGE: Create a method called isEvenNumber that takes a parameter of type
		// int. Its purpose is to determine if the argument passed to the method is an
		// even number or not. return true if an even number, otherwise return false;

		// CHALLENGE2: Modify the while code, make it also record the total number of
		// even numbers it has found and break once 5 are found, and at the end, display
		// the total number of even numbers found

		int numberValue = 4;
		int finishNumber = 20;
		int counter = 0;
		int sum = 0;

		int evenNumbersFound = 0;

		while (numberValue <= finishNumber) {
			numberValue++;
			if (!isEvenNumber(numberValue)) {
				continue; // skip the numberValue
			}

			counter++;
			sum += numberValue;
			evenNumbersFound++;

			if (counter == 6) {
				System.out.println("Total amount = " + sum);
				break;
			}

			System.out.println("Even number " + numberValue);
		}

		System.out.println("Total even numbers found = " + evenNumbersFound);

//		isEvenNumber(100);
//		isEvenNumber(21);
//		isEvenNumber(42);
	}

	public static boolean isEvenNumber(int num) {
//		while (num % 2 == 0) {
//			return true;
//		}
//		return false;
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}
}
