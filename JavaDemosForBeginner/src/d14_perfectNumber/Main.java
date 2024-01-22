package d14_perfectNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Problem: Determine the given number is a perfect number or not
		
		// Perfect Number is a number that the sum of the numbers can be divided.
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Give a number: ");
		
		int number = input.nextInt();
		int total=0;
		
		if(number < 1) {
			System.out.println(number + " is not a perfect number");
		}else {
			for(int i = 1; i <= number/2; i++) {
				if(number%i == 0) {
					total += i;
				}
			}
		}
		
		if(number == total || number == 1) {
			System.out.println(number + " is a perfect number");
		} else {
			System.out.println(number + " is not a perfect number");
		}
		
		input.close();

	}

}
