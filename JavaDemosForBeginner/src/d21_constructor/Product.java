package d21_constructor;

public class Product {
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stock;
	private String code;
	
	// Constructor
	public Product(int id, String name, String description, double price, int stock) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.code = this.name.substring(0,1) + this.id;
	}

	public String getCode() {
		return code;
	}
}
