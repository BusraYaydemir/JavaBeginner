package d4_ifElseCondition;

public class Main {

	public static void main(String[] args) {
		
		// if else condition

        int age = 19;

        /*
         * Defensive Programming: Defensive programming is a coding practice that involves anticipating and guarding against potential errors or unexpected inputs to ensure a software system remains robust and resilient.
         * For this example, while age is an integer if else statement is a defensive programming.
         */
        
        if(age > 20) {
            System.out.println("age is bigger than 20");
        } else if (age == 20) {
            System.out.println("age is equal to 20");
        } else {
            System.out.println("age is less than 20");
        }
        
	}

}
