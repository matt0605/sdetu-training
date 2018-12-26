package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is starting");

		// call printName
		printName();
		int numa = 10;
		int numb = 20;

		// call addNumbers
		addNumbers(numa, numb);

		// call addNumbers
		int product = multiplyNumbers(numa, numb);
		System.out.println("The product of numbers " + numa + " and " + numb + " is " + product);
		// System.out.println("The product of numbers " + numa + " and " + numb
		// + " is " + multiplyNumbers(numa, numb));

	}

	static void printName() {
		System.out.println("My name is Stafford");

	}

	static void addNumbers(int numbera, int numberb) {
		// this function will add two numbers

		int sum = numbera + numberb;
		System.out.println("The sum of numbera " + numbera + " and numberb " + numberb + " is " + sum);

	}

	static int multiplyNumbers(int numbera, int numberb) {

		int product = numbera * numberb;
		//call the a function within a function
		addNumbers(product + 50, product);
		return product;

	}

}
