package university;

public class Teacher extends Person {

	private double Salary;
	private String ResearchInterest;
	
	Teacher (String Name, String PhoneNumber, String EmailAddress, String Department, double Salary, String ResearchInterest) {
		super(Name, PhoneNumber, EmailAddress, Department);
		this.Salary = Salary;
		this.ResearchInterest = ResearchInterest;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getResearchInterest() {
		return ResearchInterest;
	}

	public void setResearchInterest(String researchInterest) {
		ResearchInterest = researchInterest;
	}
	
	@Override
	void printAll() {
		super.printAll();
		printSalary();
		printResearchInterest();
		newLine();
	}
	
	void printSalary() {
		System.out.println("Salary : "+Salary);
	}
	
	void printResearchInterest() {
		System.out.println("Research Interest : "+ResearchInterest);
	}
	
	void newLine() {
		System.out.println();
	}
		
}
