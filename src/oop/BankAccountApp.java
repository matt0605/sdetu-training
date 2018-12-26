package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		String cAccount = "checking";	
		String sAccount = "savings";
		
		double deposit = 5000;
		
		//calls the constructors
		BankAccount acct = new BankAccount(); //default constructor
		BankAccount cacct = new BankAccount(cAccount);
		BankAccount acctD = new BankAccount(sAccount, deposit);
		
		//System.out.println(acct.rountingNumber);
		acctD.name = "Matthew Zeon";
		acctD.accountNumber = "54321";
		
		
		acctD.deposit(5000);
		acctD.deposit(5000);
		acctD.deposit(5000);
		acctD.withdraw(2000)
		;
		System.out.println(acctD.toString());
		
		/*
		acctD.checkBalance();
		
		//demo overriding
		System.out.println("Calling the toString()");
		
	    System.out.println(acctD.toString());
	    
	    //demo for inheritance
	    CDAccount cd1 = new CDAccount();
	    cd1.balance = 3000;
	    cd1.name = "Chelsea";
	    cd1.accountType = "CD Account";
	    System.out.println(cd1.toString());
	    cd1.compound();
	   */
		
		//demo setter and getter
	  //   String s = acctD.setName(acctD.name);
	//	acctD.getName(someName);
		
	}

}
