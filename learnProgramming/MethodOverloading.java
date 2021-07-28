package learnProgramming;

public class MethodOverloading {
	public static void main(String[] args) {

		int newScore = calculateScore("Tim", 500); // Tim, 500
		System.out.println("New score is " + newScore); // value is 500,000
		calculateScore(75);
		calculateScore();

		calcFeetAndInchesToCentimeters(0, 1);
		calcFeetAndInchesToCentimeters(156);
	}

	public static int calculateScore(String playername, int score) {
		System.out.println("Player " + playername + " scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}

	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}

	// CHALLENGE

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

		double inchToCM = 2.54d;
		double footToInches = 12d;
		double centimeters;

		if ((feet < 0) || ((inches < 0) || (inches > 12))) {
			System.out.println("Invalid feet or inches parameters");
			return -1;
		}

		centimeters = (feet * footToInches) * inchToCM;
		centimeters += inches + inchToCM;
		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
		return centimeters;

	}

	public static double calcFeetAndInchesToCentimeters(double inches) {

		double footToInches = 12d;
		double feet = (int) inches / footToInches;
		double remainingInches = (int) inches % footToInches;

		if (inches < 0) {
			return -1;
		}

		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
		return calcFeetAndInchesToCentimeters(feet, remainingInches);

	}
}
