package organization;

public abstract class Person {

	private String name;
	private String phoneNumber;
	private String emailAddress;
	final private String organizationName = "ABC";
	
	Person(String name, String phoneNumber, String emailAddress) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getOrganizationName() {
		return organizationName;
	}

	void print() {
		printOrganizationName();
		printName();
		printPhoneNumber();
		printEmailAddress();
	}
	
	void printOrganizationName() {
		System.out.println("Organization Name : " +organizationName);
	}
	void printName() {
		System.out.println("Name : " +name);
	}
	void printPhoneNumber() {
		System.out.println("Phone Number : " +phoneNumber);
	}
	void printEmailAddress() {
		System.out.println("Email Address : " +emailAddress);
	}

}
