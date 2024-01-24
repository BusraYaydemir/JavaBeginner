package d20_encapsulationGetterSetter;

public class Product {

	// The Best Practice: give the names of private fields like "_fieldName"
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stock;
	private String _code;
	
	public int getId() {
		return _id;
	}
	
	public void setId(int id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		if(price > 0) {
			_price = price;
		}
	}

	public int getStock() {
		return _stock;
	}

	public void setStock(int stock) {
		_stock = stock;
	}

	public String getCode() {
		_code = _name.substring(0,1) + _id;
		return _code;
	}
	
	
}
