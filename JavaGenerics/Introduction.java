package JavaGenerics;

import java.util.ArrayList;

public class Introduction {

	public static void main(String[] args) {
		ArrayList items = new ArrayList();
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);

		printDoubled(items);

		ArrayList<Integer> items2 = new ArrayList<>();
		items2.add(6);
		items2.add(7);
		items2.add(8);
		items2.add(9);
		items2.add(10);

		printDoubled2(items2);
	}

	private static void printDoubled(ArrayList n) {
		for (Object i : n) {
			System.out.println((Integer) i * 2);
		}
	}

	private static void printDoubled2(ArrayList<Integer> n) {
		for (int i : n) {
			System.out.println(i * 2);
		}
	}
}
