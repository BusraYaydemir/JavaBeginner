package d16_methods;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(addNumbers(1,2,3,4,5));
		System.out.println(addNumbers("Second Method: ", 1,2,3,4,5));
		addCustomer();
		
	}
	
	public static void addCustomer() {
		System.out.println("Customer Added!");
	}
	
	
	// Variable Arguments: int... You can enter how many numbers do you want.
	public static int addNumbers(int... numbers) {
		int total = 0;
		
		for(int number:numbers) {
			total+=number;
		}
		return total;
	}
	
	public static int addNumbers(String name1, int number1, int... numbers) {
		int total = 0;
		
		for(int number:numbers) {
			total+=number;
		}
		return total;
	}
	
	

}
