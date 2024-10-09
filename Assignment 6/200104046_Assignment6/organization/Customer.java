package organization;

public class Customer extends Person implements infoCustomer {
	
	Customer (String name, String phoneNumber, String emailAddress) {
		super(name, phoneNumber, emailAddress);
	}
	
	@Override
	void print() {
		super.print();
	}
	
	@Override
	public void setCountry(String country) {
		System.out.println("Country : " +country);
	}
	
	@Override
    public void totalMoneySpend(double spendMoney) {
		System.out.println("Total Money Spend : " +spendMoney);
	}
    
}