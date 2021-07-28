package learnProgramming;

public class KeywordsAndExpressions {

	public static void main(String[] args) {

		int int2 = 5;
		// int2 is an expression

		// a mile is equal to 1.609344 kilometres
		double kilometres = (100 * 1.609344);

		int highScore = 50;
		if (highScore == 50) {
			System.out.println("This is an expression");
		}

		// In the following code that I will type below, write down what parts of the
		// code are expressions.
		int score = 100;
		if (score > 99) {
			System.out.println("You got the high score!");
		}

		// Statements
		int myVariables = 50;
		if (myVariables == 50)
			System.out.println("Printed");
		myVariables++;
		myVariables--;
		System.out.println("This is a test");
		System.out.println("This is " + "another" + " still more.");

		int anotherVariable = 50;
		myVariables--;
		System.out.println("This is another one");
	}

}
