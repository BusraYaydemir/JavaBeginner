package d28_interfaces;

public class OracleCustomerDal implements ICustomerDal{

	@Override
	public void Add() {
		System.out.println("Oracle Added!");
	}

}
