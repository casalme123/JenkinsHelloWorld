package learnProgramming;

public class CodeBlocksMethodsAndChallenge {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		// Create a method called displayHighScorePosition
		// it should a players name as a parameter, and a 2nd parameter as a position in
		// the high score table
		// You should display the players name along with a message like " managed to
		// get into position " and the position they got and a further message " on the
		// high score table".
		// Create a 2nd method called calculateHighScorePosition
		// it should be sent one argument only, the player score
		// it should return an int
		// the return data should be
		// 1 if the score is > 1000
		// 2 if the score is > 500 and < 1000
		// 3 if the score is > 100 and < 500
		// 4 in all other cases
		// call both methods and display the results of the ff:
		// a score of 1500, 900, 400, and 50

		int position = calculateHighScorePosition(1500);
		displayHighScorePosition("Lewie", position);

		position = calculateHighScorePosition(900);
		displayHighScorePosition("Rose", position);

		position = calculateHighScorePosition(400);
		displayHighScorePosition("Adona", position);

		position = calculateHighScorePosition(50);
		displayHighScorePosition("C2", position);

//		String playerName = "Adona";
//		String position = "Champion";
//		int playerScore = 50;

//		displayHighScorePosition(playerName, position);
//		calculateHighScorePosition(playerScore);
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Calculated final score was " + finalScore);

			return finalScore;
		} else {
			return -1;
		}
	}

	public static void displayHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " managed to get into position " + position + " on the high score table");
	}

	public static int calculateHighScorePosition(int playerScore) {

		int position = 4;

		if (playerScore > 1000) {
			position = 1;
//			return 1;
		} else if ((playerScore > 500) && (playerScore < 1000)) {
			position = 2;
//			return 2;
		} else if ((playerScore > 100) && (playerScore < 500)) {
			position = 3;
//			return 3;
//		} else {
//			return 4;
		}
		return position;
	}
}
