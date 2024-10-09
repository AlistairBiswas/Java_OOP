package university;

public class Student extends Person {

	private int ID;
	private double CGPA;
	
	Student(String Name, String PhoneNumber, String EmailAddress, String Department, int ID, double CGPA) {
		super(Name, PhoneNumber, EmailAddress, Department);
		this.ID = ID;
		this.CGPA = CGPA;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}
	
	@Override
	void printAll() {
		super.printAll();
		printID();
		printCGPA();
		newLine();
	}
	
	void printID() {
		System.out.println("ID : "+ID);
	}
	
	void printCGPA() {
		System.out.println("CGPA : "+CGPA);
	}
	
	void newLine() {
		System.out.println();
	}
	
}
