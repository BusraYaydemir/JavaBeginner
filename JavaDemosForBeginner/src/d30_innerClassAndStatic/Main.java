package d30_innerClassAndStatic;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 2;
		product.name = "book";
		product.price = 55.90;
		product.stock = 100;
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}

}
