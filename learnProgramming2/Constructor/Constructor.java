package learnProgramming2.Constructor;

public class Constructor {

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount(12345, 100, "Bob", "sample@gmail.com", "09101667132");
		BankAccount bankAccount2 = new BankAccount();
		BankAccount bankAccount3 = new BankAccount("Tim", "tim@yahoo.com", "12345");
//		bankAccount.setAccountNumber(123456);
//		bankAccount.setBalance(100);
//		bankAccount.setCustomerName("Bob");
//		bankAccount.setEmail("sample@gmail.com");
//		bankAccount.setPhoneNumber("09101667132");

		System.out.println("1.) Account Number: " + bankAccount.getAccountNumber());
		System.out.println("1.) Bank Account: " + bankAccount.getBalance());

		System.out.println("2.) Account Number: " + bankAccount2.getAccountNumber());
		System.out.println("2.) Bank Account: " + bankAccount2.getBalance());

		System.out.println("3.) Account Number: " + bankAccount3.getAccountNumber());
		System.out.println("3.) Bank Account: " + bankAccount3.getBalance());

		bankAccount.withDrawFunds(50.00);
		bankAccount.depositFunds(100);
		bankAccount.withDrawFunds(190);
	}
}
