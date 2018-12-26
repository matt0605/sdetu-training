package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;  //declare String
		String wordChoice = "Lov";
		bookTitle = "Strength to Love"; //define
		
		if ( bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word " + wordChoice);
			
			
		}
		
		String browser = "Chrome";
		if ( browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is chrome");
			
			
		}
		
		// print the initials plus last 4 digits of SSN 
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "999999999";
		
		//length of a String
		System.out.println("SSN Length: " + SSN.length());
		
		//Start at 0, end at 1
		System.out.print(firstName.substring(0,1) );
		System.out.print(lastName.substring(0,1));
		
		//Start at 5 end at 9
		//System.out.println(SSN.substring(5,9));		
		System.out.println(SSN.substring(5));	
		

	}

}
