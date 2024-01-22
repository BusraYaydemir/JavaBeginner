package d15_findNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Problem: Try to find the user's mind.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Think a number between 1 and 100");
		
		int down = 0;
		int up = 100;
		
		int ex;
		
		while(true) {
			ex = (down+up)/2;
			System.out.println("What about " + ex + " ?");
			System.out.println("1- less than");
			System.out.println("2- equal");
			System.out.println("3- greater than");
			
			System.out.print("Answer: ");
			int check = input.nextInt();
			
			if(check == 2) {
				System.out.println("Your number is " + ex);
				break;
			} else if (check == 1) {
				up = (down+up)/2;
			} else if (check == 3) {
				down = (down+up)/2;
			}
		}
		
		
		input.close();
		
	}

}
