package d18_classDemo;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(1,2,3,4,5,6,7,8,9));
		System.out.println(calculator.subtract(9,8,7,6,5,4,3,2,1));
		System.out.println(calculator.multiplication(1,2,3,4,5,6,7,8,9));
		System.out.println(calculator.divided(4,2));
	}

}
