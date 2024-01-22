package d11_stringMethods;

public class Main {

	public static void main(String[] args) {
		
		String message = "The weather is very nice today.";

		System.out.println("Message: " + message); // shows the message
		
		System.out.println("Message Length: " + message.length()); // how many characters are there
		
		System.out.println("5. element of the message" +message.charAt(4)); // which character is in that index
	
		System.out.println(message.concat(" Fantastic!")); // collects two string
		
		System.out.println(message.startsWith("A")); // does the message start with "A"
		
		System.out.println(message.endsWith(".")); // does the message end with "."
		
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		
		System.out.println(message.indexOf("er"));
		
		System.out.println(message.lastIndexOf("er"));
		
		System.out.println(message.replace(" ", "-"));
		
		System.out.println(message.substring(4));
		
		System.out.println(message.substring(4, 7));
		
		System.out.println(message.toUpperCase());
		
		System.out.println(message.toLowerCase());
	}

}
