package learnProgramming;

public class PrimitiveTypesChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteA = 2;
		short shortA = 3;
		int integerA = 4;
		long longTotal = 50000L + 10L * (byteA + shortA + integerA);

		System.out.println(longTotal);

		short shortTotal = (short) (1000 + 10 * (byteA + shortA + integerA));

		System.out.println(shortTotal);
	}

}
