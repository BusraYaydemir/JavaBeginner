package d28_interfaces;

public class Main {

	public static void main(String[] args) {
		ICustomerDal customerDal = new SqlServerCustomerDal();
		customerDal.Add();
	}

}
