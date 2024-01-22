package d12_primeNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Problem: find the given number is prime or not.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please give a number: ");
		int number = input.nextInt();
		boolean isIt = true;
		
		if(number<2) {
			isIt = false;
		} else {
			for(int check = 2; check <= number/2; check ++) {
				if(number%check == 0) {
					isIt = false;
					break;
				}
			}
		}
		
		if(isIt) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
		input.close();

	}

}
