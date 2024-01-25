package d21_constructor;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(2, "Laptop", "It is a very good laptop", 15000, 30);
		
		System.out.println("Get Code: " + product.getCode());
	}
}
