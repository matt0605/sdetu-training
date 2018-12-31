package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
	System.out.println("setRate in LoanAccount");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("increaseRate in LoanAccount");
		
	}
	
	public void setTerm (int term) {
		
		System.out.println("Setting term to: " + term + "years");
	}
	
	public void setAmort () {
		System.out.println("Setting Amort");
	}

}
