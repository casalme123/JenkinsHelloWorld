
public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello Christian!");

		int firstNumber = (10 + 5) + (2 * 10);
		int secondNumber = 12;
		int thirdNumber = firstNumber * 2;
		int totalNumbers = firstNumber + secondNumber + thirdNumber;
		System.out.println(totalNumbers);
		System.out.println(firstNumber);

		int myLastOne = 1000 - totalNumbers;
		System.out.println(myLastOne);

		// Call SpeedConverter
		double miles = SpeedConverter.toMilesPerHour(10.5);
		System.out.println("Miles = " + miles);

		SpeedConverter.printConversion(10.5);
	}
}
