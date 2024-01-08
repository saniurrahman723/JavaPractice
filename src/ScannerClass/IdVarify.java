package ScannerClass;

import java.util.Scanner;

public class IdVarify {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Plese Enter ID :");
		int id = scan.nextInt();
		
		//Input id 1,2,3,4
		
		if (id == 1) {
			System.out.println("Alex");
		}
		else if (id == 2) {
			System.out.println("James");
		}
		else if (id == 3) {
			System.out.println("Jhon");
		}
		else if (id == 4) {
			System.out.println("Morrison");
		}
		else {
			System.out.println("Invalid ID Number");
		}
	}
}
