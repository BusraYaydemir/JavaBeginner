package d28_interfaces;

// Business Layer
// We truth that customer info is true or not in here
public class CustomerManager {

	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void Add() {
		// Business Codes
		customerDal.Add();
	}
}
