package Inheritance;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tails;
	private int teeth;
	private String coat;

	public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tails, int teeth,
			String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tails = tails;
		this.teeth = teeth;
		this.coat = coat;
	}

	private void chew() {
		System.out.println("Dog is chewing");
	}

	@Override
	public void eat() {
		System.out.println("Dog is now eating");
		super.eat();
	}

	public void walk() {
		System.out.println("Dog walk");
		super.move(10);
	}

	public void run() {
		System.out.println("Dog run");
		move(20);
	}

	private void moveLegs(int speed) {
		System.out.println("Dog's leg move");
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog move");
		moveLegs(speed);
		super.move(speed);
	}

}
