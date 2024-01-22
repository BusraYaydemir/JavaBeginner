package d9_recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		// Problem: Find the biggest number, total and average of an array. 
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		int biggest=numbers[0];
		int total = 0;
		for(int number:numbers) {
			if(biggest<number) {
				biggest = number;
			}
			total +=number;
		}
		
		System.out.println("The Biggest Number: " + biggest);
		System.out.println("The Total: " + total);
		System.out.println("The Average: " + (total/numbers.length));
	}

}
