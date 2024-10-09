package organization;

public class Employee extends Person implements infoEmployee {

	private double salary;
	private String department;
	
	public Employee(String name, String phoneNumber, String emailAddress, double salary, String department) {
		super(name, phoneNumber, emailAddress);
		
		this.salary = salary;
		this.department = department;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	void print() {
		super.print();
		printSalary();
		printDepartment();
	}
	
	void printSalary() {
		System.out.println("Salary : " +salary);
	}
	void printDepartment() {
		System.out.println("DepartMent : " +department);
	}
	
	@Override
    public void isManager(String name1, String name2) {
    	
		if (this.getName().equals(name1) || this.getName().equals(name2)) {
			System.out.println("He is a Manager.");
		}
		else {
			System.out.println("He is not a Manager.");
		}
	}
    
	@Override
	public void setCountry(String country) {
		System.out.println("Country : " +country);
	}

}