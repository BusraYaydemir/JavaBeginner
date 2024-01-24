package d20_encapsulationGetterSetter;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.setId(2);
		System.out.println("Get Id: " + product.getId());
		
		product.setName("Laptop");
		System.out.println("Get Name: " + product.getName());
		
		product.setPrice(15000.99);
		System.out.println("Get Price: " + product.getPrice());
		
		System.out.println("Get Code: " + product.getCode());
	}

}
