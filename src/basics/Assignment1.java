package basics;

public class Assignment1 {

	static int randNum = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Sum is: " + takeValueReturnSum(randNum));

		long num = 5;

		System.out.println("The CFV number of " + randNum + " is " + computesFactorialValue(num));

		int[] numbers = { 8, 5, 2, 4, 6 };
		System.out.println("The minimun number of the array is: " + returnMinimum(numbers));
		System.out.println("The avergae number of the array is: " + returnAverage(numbers));
		System.out.println("The maximum number of the array is: " + returnMaximum(numbers));

	}

	// Write a function that takes a value n returns the sum of numbers 1 to n
	public static int takeValueReturnSum(int n) {
		
	  int sum = 0;
		
		for (n = 1; n < 10; n++){
		sum = sum + n;
		}
		return sum;
		
		
	}
	
	
    public static int sum(int[] numbers) {
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        return sum;
    }
	

	// Write a function that computes the factorial value
	// Definition: n! = n*(n-1)! , where 0! = 1
	// 1! = 1
	// 2! = 2 * 1! = 2 * 1
	// 3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
	// 4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
	// 5! = 4 * 3! = 4 * 3 * 2! = 5 *4 * 3 * 2 * 1! = 5 * 4 * 3 * 2 * 1
	// Hint: use the recursive method that was used to calculate Fibonnaci
	// number

	public static long computesFactorialValue(long n) {

		// for (int n = 1; n < 10; n++){

		if (n <= 1) {
			return 1;
		} else {

			return n * computesFactorialValue(n - 1);
		}

	}

	
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else if (n == 1) {
            return 1;
        }
        return factorial(n-1) * n;
    }
	/*
	 * Write 3 functions that take an array as a parameter and return the
	 * minimum, average, and maximum values of that array. Hint: this should be
	 * static functions with a return type of the same data type as the array
	 * declaration.
	 */
	public static int returnMinimum(int array[]) {

		// declare length of an array
		int len = array.length;		
		int i;
		int mini = array[0];

		for (i = 0; i < len - 1; i++) {
			// x = min(array[i], array[i +1]);

			if (array[i + 1] < mini) {
				mini = array[i + 1];
				//System.out.println(mini);
			}

		}

		return mini;

	}
	
	
	
	public static int returnAverage(int array[]) {

		// declare length of an array
		int len = array.length;		
		int i;
		int total = 0;
		int avg = 0;
		

		for (i = 0; i < len; i++) {
		
			
			
			total = total + array[i]; 
			avg = total/len;
			

		}

		return avg;

	}
	
	public static int returnMaximum(int array[]) {

		// declare length of an array
		int len = array.length;		
		int i;
		int maxi = array[0];

		for (i = 0; i < len - 1; i++) {
			

			if (array[i + 1] > maxi) {
				maxi = array[i + 1];
				
			}

		}

		return maxi;

	}

	
	//Instructor Solution
	
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
     
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
     
    public static int findAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }
	
	

}
