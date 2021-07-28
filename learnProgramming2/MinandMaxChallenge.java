package learnProgramming2;

import java.util.Scanner;

public class MinandMaxChallenge {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		int min = 0;
//		int max = 0;
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		boolean first = true;

		while (true) {
			System.out.println("Enter number: ");

			boolean isAnInt = scanner.hasNextInt();

			if (isAnInt) {
				int number = scanner.nextInt();

				if (first) {
					first = false; // one time call to get min
					min = number;
					max = number;
				}

				if (number > max) {
					max = number;
				}

				if (number < min) {
					min = number;
				}
			} else {
				break;
			}

			scanner.nextLine(); // handle input
		}

		System.out.println("min = " + min + " , max = " + max);
		scanner.close();

	}

}
