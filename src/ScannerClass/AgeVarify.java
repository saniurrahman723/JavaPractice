package ScannerClass;

import java.util.Scanner;

public class AgeVarify {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter age: ");
	int age = input.nextInt();
	
	
	if(age>18) {
		System.out.println("This person is eligible for vote");
	}else {
		System.out.println("This person is not eligible for vote");
	}
	
	
}
}
