package learnProgramming2.Constructor;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String email;

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}

	public VipCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "default123@gmail.com");
	}

	public VipCustomer() {
//		System.out.println(this.name + " " + this.creditLimit + " " + this.email);
		this("John Doe", 112233, "johndoe@gmail.com");
	}

}
