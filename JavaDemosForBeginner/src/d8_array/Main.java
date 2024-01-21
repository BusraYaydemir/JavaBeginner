package d8_array;

public class Main {

	public static void main(String[] args) {
		
		String[] students = new String[4];

        students[0] = "Ali";
        students[1] = "Berke";
        students[2] = "Kadir";
        students[3] = "Hasan";

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("******************************");

        for(String student: students) {
            System.out.println(student);
        }
        
	}

}
