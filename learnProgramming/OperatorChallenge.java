package learnProgramming;

public class OperatorChallenge {

	public static void main(String[] args) {

		double firstValue = 20.00d;
		double secondValue = 80.00d;

		double totalValue = (firstValue + secondValue) * 100.00d;
		double getRemainder = totalValue % 40.00d;

		System.out.println("Total Value: " + totalValue);
		System.out.println("Remainder: " + getRemainder);

		boolean checkRemainder = (getRemainder == 0) ? true : false;

		System.out.println("Check Remainder: " + checkRemainder);

		if (!checkRemainder) {
			System.out.println("Got some remainder");
		}
	}
}
