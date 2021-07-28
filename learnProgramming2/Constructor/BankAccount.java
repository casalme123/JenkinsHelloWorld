package learnProgramming2.Constructor;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	public BankAccount() {
		this(122313, 55.20, "Jacob", "jacob08@gmail.com", "0942447563");
		System.out.println("Empty constructor called");
	}

	public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		System.out.println("Account Constructor");
	}

	public BankAccount(String customerName, String email, String phoneNumber) {
		this(99999, 1005.24, customerName, email, phoneNumber);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void depositFunds(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made.");
		System.out.println("New Balance: " + this.balance);
	}

	public void withDrawFunds(double withdrawAmount) {
		if (this.balance - withdrawAmount < 0) {
			System.out.println("Only " + this.balance + " available. Withdrawal not processed");
		} else {
			this.balance -= withdrawAmount;
			System.out.println("Withdrawal of " + withdrawAmount + " processed.");
			System.out.println("New Balance: " + this.balance);
		}
	}
}
