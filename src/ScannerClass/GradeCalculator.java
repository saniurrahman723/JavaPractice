package ScannerClass;

import java.util.Scanner;

public class GradeCalculator {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("Enter Marks:");
	int mark = input.nextInt();
	

	if (mark>=30 && mark<=39) {
		System.out.println("Grade F");
	}
	else if (mark>=40 && mark<=49) {
		System.out.println("Grade D");
	}
	else if (mark>=50 && mark<=59) {
		System.out.println("Grade C");
	}
	else if (mark>=60 && mark<=69) {
		System.out.println("Grade B");
	}
	else if (mark>=70 && mark<=79) {
		System.out.println("Grade A");
	}
	else if (mark>=80 && mark<=99) {
		System.out.println("Grade A+");
	}
	else {
		System.out.println("Invalid Entry");
	}

}
}
