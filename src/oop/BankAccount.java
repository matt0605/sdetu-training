package oop;

public class BankAccount implements IRate {

	// Define variables
	String accountNumber;
	// static belongs to the Class not the object
	// final >>> constant (often static
	private static final String rountingNumber = "12345"; // predefined to the class

	// Instance Variables
	String name;
	String ssn;
	String accountType;
	double balance;
	

	// Constructor definitions:
	// 1. The are used to define/ setup/ initialize properties of an object
	// 2. Constructors are Implicitly called upon instantiation
	// 3. The same name as the class itself
	// 4. Have no return type

	// constructor (){
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");

	}

	// Overloading: Call same method with different argument
	BankAccount(String accountType) {

		System.out.println("NEW ACCOUNT is " + accountType);

	}

	BankAccount(String accountType, double initDeposit) {

		System.out.println("NEW ACCOUNT is " + accountType);
		System.out.println("Initial Deposit of " + initDeposit);
		String msg = null; // keep it in the scope
		// or String msg = "";
		if (initDeposit < 1000) {
			msg = "Error: Minimum deposit must be at least $1000";

		} else {
			msg = "Thanks for our initial deposit of $" + initDeposit;
		}

		System.out.println(msg);
		balance = initDeposit;

	}

	// Methods

	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");

	}

	public void withdraw(double amount) {

		balance = balance - amount;
		showActivity("WITHDRAW");

	}

	// private can only be called from within the class
	private void showActivity(String activity) {

		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: " + balance);
	}

	void checkBalance() {
		System.out.println("Balance: " + balance);
	}

	void checkStatu() {

	}
	
	
	//Interfaces
	public void setRate() {
		
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		
		System.out.println("Increasing Rate");
	}

	// override the java toString() with your own method
	@Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT#" + accountNumber + " . ROUTING #" + rountingNumber + "BALANCE: $"
				+ balance + " ]";
	}

	// Setter

	public void setName(String name) {

		this.name = "Mr." + name; // the name that belongs to the class
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;

	}

	// getter
	public String getName() {

		return name;
	}

	public String getSsn() {

		return ssn;

	}

}
