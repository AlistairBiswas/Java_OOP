package university;

public class Person {

	private String Name;
	private String PhoneNumber;
	private String EmailAddress;
	private String Department;
	static private String UniversityAddress = "AUST, Tejgaon Industrial Area.";
	
	Person(String Name, String PhoneNumber, String EmailAddress, String Department) {
		this.Name = Name;
		this.PhoneNumber = PhoneNumber;
		this.EmailAddress = EmailAddress;
		this.Department = Department;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public static String getUniversityAddress() {
		return UniversityAddress;
	}

	public static void setUniversityAddress(String universityAddress) {
		UniversityAddress = universityAddress;
	}
	
	void printAll() {	
		printName();
		printPhoneNumber();
		printEmailAddress();
		printDepartment();
		printUniversityAddress();
	}
	
	void printName() {
		System.out.println("Name : "+Name);
	}
	
	void printPhoneNumber() {
		System.out.println("Phone Number : "+PhoneNumber);
	}
	
	void printEmailAddress() {
		System.out.println("Email Address : "+EmailAddress);
	}
	
	void printDepartment() {
		System.out.println("Department : "+Department);
	}
	
	void printUniversityAddress() {
		System.out.println("University Address : "+UniversityAddress);
	}
	
}
