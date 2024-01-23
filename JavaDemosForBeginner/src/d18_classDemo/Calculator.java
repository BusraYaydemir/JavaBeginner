package d18_classDemo;

public class Calculator {

	public double add(double... numbers) {
		double result=0;
		for(double number:numbers) {
			result+=number;
		}
		return result;
	}
	
	public double subtract(double... numbers) {
		double result=numbers[0];
		for(int i=1; i<numbers.length; i++) {
			result-=numbers[i];
		}
		return result;
	}
	
	public double multiplication(double... numbers) {
		double result=1;
		for(double number:numbers) {
			result*=number;
		}
		return result;
	}
	
	public double divided(double number1, double number2) {
		return number1/number2;
	}
}
