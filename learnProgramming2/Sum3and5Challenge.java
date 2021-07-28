package learnProgramming2;

public class Sum3and5Challenge {

	public static void main(String[] args) {
		// Add (Sum) Subtract (Difference) Multiply (Product) Divide (Quotient)

		int counter = 0;
		int sum = 0;

		for (int i = 1; i < 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				counter++;
				sum += i;
				System.out.println("Found number = " + i);
			}

			if (counter == 5) {
				break;
			}
		}

		System.out.println("Sum = " + sum);
	}

}
