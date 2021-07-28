package learnProgramming;

public class StringType {

	public static void main(String[] args) {
		// String Data Type
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more.";
		System.out.println("myString is equal to " + myString);
		myString = myString + "\u00A9 2019";
		System.out.println("myString is equal to " + myString);
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString);
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("LastString is equal to " + lastString);
		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println("LastString is equal to " + lastString);

		// If-then Statement
		boolean isAlien = false;
		if (isAlien == false) {
			System.out.println("It is not an alien!");
			System.out.println("And I am scared of aliens");
		}

		int topScore = 95;
		if (topScore >= 100) {
			System.out.println("You got the high score!");
		}

		// Logical and Operator
		int secondTopScore = 60;
		if ((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Greater than second top score and less than 100");
		}

		// Logical OR Operator
		if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("Either or both of the conditions are true");
		}

		// Assignment Operator vs Equals to Operator
		int newValue = 50;
		if (newValue == 50) {
			System.out.println(("This is true"));
		}

		boolean isCar = true; // false
		if (isCar) { // !isCar
			System.out.println("This is not supposed to happen");
		}

		// Ternary Operator
		isCar = true;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		}

		// Search in Google: summary of operators in java
		// Search in Google: java operator precedence table

	}

}
