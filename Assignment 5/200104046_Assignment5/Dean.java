package university;

public class Dean extends Teacher {

	private String School;

	Dean(String Name, String PhoneNumber, String EmailAddress, String Department, double Salary, String ResearchInterest, String School) {
		super(Name, PhoneNumber, EmailAddress, Department, Salary, ResearchInterest);
		this.School = School;
	}

	public String getSchool() {
		return School;
	}

	public void setSchool(String school) {
		School = school;
	}
	
	@Override
	void printAll() {
		printSchool();
		super.printAll();
	}
	
	void printSchool() {
		System.out.println("School : "+School);
	}
	
}