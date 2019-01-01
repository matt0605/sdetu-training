package labs;

public class BankAccountApp {

	public static void main(String[] arg) {

		BankAccount acc1 = new BankAccount("465329874", 1000);
		BankAccount acc2 = new BankAccount("645329874", 2000);
		BankAccount acc3 = new BankAccount("555329874", 3000);

		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.showBalance();
		acc1.makeDeposit(500);
		acc1.payBill(100);
		acc1.accrue();
		System.out.println(acc1.toString());

	}

}

class BankAccount implements IInterest{

	// Properties of a bank account
	private static int ID = 1000; // Internal ID
	private String accountNumber; // ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "000257566";
	private String name;
	private String SSN;
	private double balance;

	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		this.SSN = SSN;
		balance = initDeposit;
		ID++;
		setAccountNumber();
		
		
		
	}

	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("New Account Created--Your account number is " + accountNumber);
	}

	// Setter and Getter Methods

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	//
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying Bill: " + amount);
		showBalance();
	}

	//
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making Deposit: " + amount);
		showBalance();
	}

	//
	public void showBalance() {
		System.out.println("Balance: " + balance);

	}

	//needed when IInterest is implemented
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: "+ routingNumber + "]\n" + "[Balance " + balance + "]";		
	}

	
	
}
