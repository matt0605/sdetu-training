package basics;

public class States_Loops {

	public static void main(String[] args) {
		// Declare and Define an array
		String[] cities = { "New York", "San Francisco", "Miami", "Dallas" };
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);

		// Declare and Define an array
		String[] states = new String[5]; // define the size
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		
		int i = 0;

			//Do loop
		do {
			System.out.println("State Do While Loop =  " + states[i]);
			i = i + 1;
		} while (i < 5);
		
		
		
		// while loop	
		
		int n = 0;
		boolean stateFound = false;
		//while (n <= 4){
			while (!stateFound){
			String  state = states[n];
			System.out.println("displaying state While loop " + state);
			if (state == "Texas"){
			
			System.out.println("State While loop: " + state);
			stateFound = true;
			
			}
			n++;
		}
		
			
		//for loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++){
			System.out.println("State For Loop: " + states[x]);
		}

		// System.out.println(states[0]);

		// Declare array
		String[] countries;

		// Define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Cananda";
		countries[2] = "UK";

		System.out.println(countries[2]);

	}

}
