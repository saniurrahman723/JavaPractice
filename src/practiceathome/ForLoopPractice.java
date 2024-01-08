package practiceathome;

public class ForLoopPractice {
	public static void main(String[] args) {

		//Q.Write a Java program to use a for loop to print the numbers from 1 to 10
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("----------");
		//Q.Write a Java program to print all even numbers between 1 and 50 using a for loop
		
		for(int i=2; i<=50; i+=2) {
			System.out.println(i);
		}
		System.out.println("----------");
		
		
		//Q.Write a Java program to check and print all prime numbers between 1 and 100 using a for loop.
		  System.out.println("Prime numbers between 1 and 100:");

	        for (int i = 2; i <= 100; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    // Function to check if a number is prime
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	}
}