package university;

public class University {

	public static void main(String[] args) {
		
		Student studentA = new Student("Alistair", "01712345678", "ab@aust.edu", "CSE", 46, 3.731);
		Student studentB = new Student("Mashruk", "01711111111", "smm@aust.edu", "CSE", 29, 3.713);
		Student studentC = new Student("Rafeed", "01766666666", "rmr@aust.edu", "CSE", 41, 3.731);
		
		System.out.println("\n\t\tStudents Information...\n");
		studentA.printAll();
		studentB.printAll();
		studentC.printAll();
		
		Teacher teacherA = new Teacher("Rajon Bardhan", "01xxxxxxxxx", "rb@aust.edu", "CSE", 100000.00, "Machine Learning.");
		Teacher teacherB = new Teacher("Shoeb Mohammad Shariar", "01yyyyyyyyy", "sms@aust.edu", "CSE", 100000.00, "Data Science.");
		Teacher teacherC = new Teacher("Ayman Uddin Mahin", "01zzzzzzzzz", "rb@aust.edu", "EEE", 100000.00, "Electrical Circuit.");
		
		System.out.println("\n\t\tTeachers Information...\n");
		teacherA.printAll();
		teacherB.printAll();
		teacherC.printAll();
		
		Dean deanA = new Dean("Dr. Al-Mamun", "01ccccccccc", "dam@aust.edu", "CSE", 200000, "Data Science.", "St. Gregory.");
		Dean deanB = new Dean("Dr. A.K.M Baki", "01eeeeeeeee", "dakmb@aust.edu", "EEE", 200000, "Circuit Analysis.", "St. Gregory.");
		
		System.out.println("\n\t\tDeans Information...\n");
		deanA.printAll();
		deanB.printAll();
		
	}

}
