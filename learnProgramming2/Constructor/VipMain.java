package learnProgramming2.Constructor;

public class VipMain {

	public static void main(String[] args) {
		VipCustomer vipCustomer = new VipCustomer("NameA", 123, "email@gmail.com");
		VipCustomer vipCustomer2 = new VipCustomer("Name2", 345);
		VipCustomer vipCustomer3 = new VipCustomer();

		System.out.println(vipCustomer.getName());
		System.out.println(vipCustomer.getEmail());
		System.out.println(vipCustomer2.getName());
		System.out.println(vipCustomer3.getName());
	}

}
