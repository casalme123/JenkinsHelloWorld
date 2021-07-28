package learnProgramming2;

public class ClassesMain {

	public static void main(String[] args) {
		ClassesPart1 porsche = new ClassesPart1();
		ClassesPart1 holden = new ClassesPart1();

		porsche.setModel("Carrera");
		System.out.println("Model is " + porsche.getModel());
	}
}
