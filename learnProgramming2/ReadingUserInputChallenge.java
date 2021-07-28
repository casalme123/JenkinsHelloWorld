package learnProgramming2;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {

		int sum = 0;
		int counter = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			int order = counter + 1;
			System.out.println("Enter number #" + order + ":");

			boolean isAnInt = scanner.hasNextInt();

			if (isAnInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
				if (counter == 10) {
					break;
				}
			} else {
				System.out.println("Invalid Number");
			}

			scanner.nextLine(); // handle end of line (enter key)
		}

		System.out.println("sum = " + sum);
		scanner.close();

		// OR

//		while (counter < 10) {
//			int order = counter + 1;
//			System.out.print("Enter number #" + order + ":");
//			boolean checkInput = scanner.hasNextInt();
//
//			if (checkInput) {
//				int inputNumber = scanner.nextInt();
//				counter++;
//				sum += inputNumber;
//			} else {
//				System.out.println("Invalid Number");
//			}
//			scanner.nextLine(); // handle end of line (enter key)
//		}
//		System.out.println("sum = " + sum);
//		scanner.close();
//
	}

}
