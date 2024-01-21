package d5_recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		// Problem: Find the biggest number between 3 numbers.

        int number1 = 15;
        int number2 = 16;
        int number3 = 17;

        int biggestNumber = number1;

        if (biggestNumber < number2) {
            biggestNumber = number2;
        }

        if (biggestNumber < number3) {
            biggestNumber = number3;
        }



        System.out.println("The Biggest number is " + biggestNumber);
        
	}

}
