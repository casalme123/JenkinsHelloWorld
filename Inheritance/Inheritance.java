package Inheritance;

public class Inheritance {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog dog = new Dog("Yorkie", 6, 20, 24, 42, 2, 2, 4, 1, "long silky");
		dog.eat();
		dog.walk();
		dog.run();
	}

}
