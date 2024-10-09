package modifiedOrganization;

public class Manager extends Employee {

	Manager(String name, String phoneNumber, String emailAddress, double salary, String department) {
		super(name, phoneNumber, emailAddress, salary, department);
	}
	
	@Override
	void print() {
		super.print();
	}
	
}