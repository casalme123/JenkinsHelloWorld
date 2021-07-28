package learnProgramming;

public class FloatandDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = " + myMinFloatValue);
		System.out.println("Float maximum value = " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value = " + myMinDoubleValue);
		System.out.println("Double maximum value = " + myMaxDoubleValue);

		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5d / 3d; // or 5.00 / 3.00

		System.out.println("MyIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);

		double numberOfPound = 200d;
		double convertedKilograms = numberOfPound * 0.45359237d;

		System.out.println("Converted kilograms = " + convertedKilograms);

		double pi = 3.1415927d;
		double anotherNumber = 3_000_000.4_567_890d;

		System.out.println(pi);
		System.out.println(anotherNumber);

	}

}
