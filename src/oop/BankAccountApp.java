package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		String cAccount = "checking";
		String sAccount = "savings";

		double deposit = 5000;

		// calls the constructors
		BankAccount acct = new BankAccount(); // default constructor
		BankAccount cacct = new BankAccount(cAccount);
		BankAccount acctD = new BankAccount(sAccount, deposit);

		// System.out.println(acct.rountingNumber);
		acct.name = "Matthew Zeon";
		acctD.accountNumber = "54321";

		acctD.deposit(5000);
		acctD.deposit(5000);
		acctD.deposit(5000);
		acctD.withdraw(2000);
		System.out.println(acctD.toString());

		/*
		 * acctD.checkBalance();
		 * 
		 * //demo overriding System.out.println("Calling the toString()");
		 * 
		 * System.out.println(acctD.toString());
		 * 
		 * //demo for inheritance CDAccount cd1 = new CDAccount(); cd1.balance = 3000;
		 * cd1.name = "Chelsea"; cd1.accountType = "CD Account";
		 * System.out.println(cd1.toString()); cd1.compound();
		 */

		// demo setter and getter
		acct.setName("bob");
		System.out.println(acct.getName());
		
		acct.setSsn("123456789");
		System.out.println(acct.getSsn());
		
		//calling interface methods
		acct.setRate();
		acct.increaseRate();
		
		LoanAccount loanacct = new LoanAccount();
		loanacct.increaseRate();
		loanacct.setRate();
		loanacct.setAmort();
		loanacct.setTerm(5);
		
		//Example of Polymorphism -changes where we are pointing
		IRate acct1 = new LoanAccount();
		acct1.increaseRate();  //reference the methods in IRate but call the methods in LoanAccount
		acct1.setRate();      //reference the method in IRate but call the methods in LoanAccount

	}

}
