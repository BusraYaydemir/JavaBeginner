package d7_loopDemo;

public class Main {

	public static void main(String[] args) {
		
		// Problem: Write numbers between 1 and 10

        // FOR

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("The for loop is over.");

        // WHILE

        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("The while loop is over.");

        // DO WHILE

        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        System.out.println("The do-while loop is over.");
        
	}

}
