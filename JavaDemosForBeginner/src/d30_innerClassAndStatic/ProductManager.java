package d30_innerClassAndStatic;

public class ProductManager {
	
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("The Product is Added!");
		} else {
			System.out.println("Non-Valid Product!");
		}
	}
}
