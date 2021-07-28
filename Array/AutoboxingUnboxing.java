package Array;

import java.util.ArrayList;

class IntClass {
	private int myValue;

	public IntClass(int myValue) {
		this.myValue = myValue;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}
}

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		String[] strArray = new String[10];
		int[] intArray = new int[10];

		ArrayList<String> strArrayList = new ArrayList<>();
		strArrayList.add("Tim");

		ArrayList<IntClass> intClassesArrayList = new ArrayList<>();
		intClassesArrayList.add(new IntClass(54));
		Integer integer = new Integer(54);
		Double doubleValue = new Double(12.25);

		ArrayList<Integer> intArrayList = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			intArrayList.add(Integer.valueOf(i));
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " ------------> " + intArrayList.get(i).intValue());
		}

		Integer myIntValue = 56; // Integer.valueOf(56);
		int myInt = myIntValue.intValue(); // myIntValue.intValue;

		ArrayList<Double> myDoubles = new ArrayList<>();
		for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
//			myDoubles.add(Double.valueOf(dbl));
			myDoubles.add(dbl);
		}

		for (int i = 0; i < myDoubles.size(); i++) {
//			double value = myDoubles.get(i).doubleValue();
			double value = myDoubles.get(i);
			System.out.println(i + " ------> " + value);
		}
	}

}
