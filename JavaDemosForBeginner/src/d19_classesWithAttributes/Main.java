package d19_classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.id = 1;
		product.name = "Laptop";
		product.description = "it is a very good laptop";
		product.stock = 300;
		product.price = 25000;
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product);
		
	}

}
