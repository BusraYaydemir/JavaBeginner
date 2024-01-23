package d17_classes;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		 * For using a class method, we should create an object of that class.
		 * 
		 * Object is a reference type
		 * 
		 * Stack stores CustomerManager customerManager2
		 * Stack is for value types - int, char, double, float ...
		 * 
		 * Head stores new CustomerManager()
		 * Head is for reference types - array, object ...
		 */
		
		
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		
		customerManager = customerManager2;
		
		customerManager.add();
		customerManager.update();
		customerManager2.remove();
		
		
	}

}
