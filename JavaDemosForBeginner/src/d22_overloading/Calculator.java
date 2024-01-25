package d22_overloading;

public class Calculator {

	
	public void add(int... numbers) {
		int total=0;
		for (int number:numbers) {
			total += number;
		}
		System.out.println(total);
	}
	
	
	public void add(int number1, int number2) {
		System.out.println(number1+number2);
	}
	
	
	public void add(int number1, int number2, int number3) {
		System.out.println(number1+number2+number3);
	}
	
	
}
