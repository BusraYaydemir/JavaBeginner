package d13_vowel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Problem: Determine the given character is a vowel or not
		
		System.out.print("give a letter: ");
		Scanner input = new Scanner(System.in);
		
		char character = input.next().charAt(0);
		
		switch(character) {
		case 'A':
		case 'E':
		case 'I':
		case 'İ':
		case 'O':
		case 'Ö':
		case 'U':
		case 'Ü':
		case 'a':
		case 'e':
		case 'ı':
		case 'i':
		case 'o':
		case 'ö':
		case 'u':
		case 'ü':
			System.out.println(character + " is a vowel letter");
			break;
		default:
				System.out.println(character + " is not a vowel letter");
		}
		
		input.close();

	}

}
