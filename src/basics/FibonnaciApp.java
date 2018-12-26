package basics;

public class FibonnaciApp {

	static final int LIMIT = 7;

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonaci
		// numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 1 + 0 =1
		// fib(3) = fib(2) + fib(1) = 1 +1 =2
		// fib(4) = fib(3) + fib(2) = 2 +1 = 3
		// fib(5) = fib(4) + fib(3) = 3 +2 =5
		// fib(6) = fib(5) + fib(4) = 5 +3 = 8

		int n = 0;
		for (int i = 0; i < LIMIT; i++) {
			System.out.println("The Fibonnaci Number of " + i + " is " + fib(n));
			n++;
		}

	}

	public static int fib(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		
	 else  {  
		// n = fib(n-1) + fib(n-2);
		 return (fib(n-1) + fib(n-2)); //recursion- call a function within a function
		
	}

		//return n;
	}

}
