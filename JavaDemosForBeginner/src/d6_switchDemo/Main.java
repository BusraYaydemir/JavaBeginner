package d6_switchDemo;

public class Main {

	public static void main(String[] args) {
		
		//Problem: Find the number grade depend on letter grade.

        String grade = "BB";

        switch (grade) {
            case "AA":
                System.out.println("Your grade is between 91 and 100");
                break;
            case "BA":
                System.out.println("Your grade is between 82 and 90");
                break;
            case "BB":
                System.out.println("Your grade is between 73 and 81");
                break;
            case "CB":
                System.out.println("Your grade is between 64 and 72");
                break;
            case "CC":
                System.out.println("Your grade is between 55 and 63");
                break;
            case "DC":
                System.out.println("Your grade is between 50 and 54");
                break;
            case "DD":
                System.out.println("Your grade is between 45 and 49");
                break;
            case "FF":
                System.out.println("Your grade is between 00 and 44");
                break;
            default:
                System.out.println("You enter an invalid grade, change it with a valid grade.");
        }
        
	}

}
