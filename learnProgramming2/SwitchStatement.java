package learnProgramming2;

public class SwitchStatement {

	public static void main(String[] args) {

//		int value = 3;
//		if (value == 1) {
//			System.out.println("Value was 1");
//		} else if (value == 2) {
//			System.out.println("Value was 2");
//		} else {
//			System.out.println("Value was 3");
//		}

		int switchValue = 6;

		switch (switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;

		case 2:
			System.out.println("Value was 2");

		case 3:
		case 4:
		case 5:
			System.out.println("Value was a 3, 4 or 5");
			System.out.println("Actually it was " + switchValue);
			break;
		default:
			System.out.println("Value was not 1, 2, 3, 4 or 5");
			break;
		}

		// CHALLENGE: Create a new switch statement using char instead of int
		// create a new char variable
		// create a switch statement testing for
		// A, B, C, D, or E
		// display a message if any of these are found and then break
		// Add a default which displays a message saying not found

		char newOption = 'G';

		switch (newOption) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
			System.out.println("I'm " + newOption);
			break;

		default:
			System.out.println("No letter found!");
			break;
		}

		// Month
		String month = "JANUARY";
		switch (month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
		case "june":
			System.out.println("Jun");
			break;
		default:
			System.out.println("Not sure");
			break;
		}

		// CHALLENGE 2
//		int day = -1;
//		printDayOfTheWeek(day);

		printDayOfTheWeek(-1);
		printDayOfTheWeek(1);
		printDayOfTheWeek(3);

	}

	public static void printDayOfTheWeek(int day) {
		switch (day) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid day");
			break;
		}

		if (day == 0) {
			System.out.println("Sunday");
		} else if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid day");
		}
	}
}
