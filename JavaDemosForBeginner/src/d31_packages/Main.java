package d31_packages;

import java.util.Scanner; // Built-in Packages: Own Packages of Java

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Name: ");
		
		String name = scanner.nextLine();
		
		System.out.println("Hi " + name);
	}

}
