package practiceathome;

import java.util.Scanner;

public class Count_Vowels {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter a string"); 
		String vowels = reader.nextLine(); 
		int count = 0; 
		
	
		char[] characters = vowels.toCharArray(); 
		for (int i = 0; i < characters.length; i++) { 
			char ch = characters[i]; 
			// check if current character is a vowel 
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { 
				// increase count 
				count++; 
			} 
		} 
		System.out.println("Number of vowels: " + count); 
	} 

	}

