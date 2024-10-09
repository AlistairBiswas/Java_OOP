package modifiedOrganization;

public class Customer extends Person implements infoCustomer {
	
	Customer (String name, String phoneNumber, String emailAddress) {
		super(name, phoneNumber, emailAddress);
	}
	
	@Override
	void print() {
		super.print();
	}
	
	public void setCountry(String country) {
		System.out.println("Country : " +country);
	}
	
	public void totalMoneySpend(double spendMoney) {
		System.out.println("Total Money Spend : " +spendMoney);
	}

}