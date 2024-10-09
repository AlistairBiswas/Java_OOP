package modifiedOrganization;

public class Organization {

	public static void main(String[] args) {
		
        Employee empA = new Employee("Masud", "01712345678", "masud@gmail.com", 20000, "Serving");
		
		System.out.println("\t\tFor Employee 1 ... \n");
		empA.print();
		empA.setCountry("Bangladesh");
		empA.isManager("Masud", "Kamal");
		empA.isCustomer("Rahim", "David", "Safik");
		System.out.println();
		
		Employee empB = new Employee("David", "01yyyyyyyyy", "david@gmail.com", 40000, "Management");
		
		System.out.println("\t\tFor Employee 2 ... \n");
		empB.print();
		empB.setCountry("United States");
		empB.isManager("Masud", "Kamal");
		empB.isCustomer("Rahim", "David", "Safik");
		System.out.println();
		
		Employee empC = new Employee("Kamal", "01688311478", "kamal@gmailcom", 20000, "Serving");
		
		System.out.println("\t\tFor Employee 3 ... \n");
		empC.print();
		empC.setCountry("Bangladesh");
		empC.isManager("Masud", "Kamal");
		empC.isCustomer("Rahim", "David", "Safik");
		System.out.println();
		
		Customer cusA = new Customer("Rahim", "01xxxxxxxxx", "rahim@gmail.com");
		
		System.out.println("\t\tFor Customer 1 ... \n");
		cusA.print();
		cusA.setCountry("Bangladesh");
		cusA.totalMoneySpend(12000);
		System.out.println();
		
		Customer cusB = new Customer("David", "01yyyyyyyyy", "david@gmail.com");
		
		System.out.println("\t\tFor Customer 2 ... \n");
		cusB.print();
		cusB.setCountry("United Kingdom");
		cusB.totalMoneySpend(16000);
		System.out.println();
		
		Customer cusC = new Customer("Safik", "01zzzzzzzzz", "safik@gmail.com");
		
		System.out.println("\t\tFor Customer 3 ... \n");
		cusC.print();
		cusC.setCountry("Bangladesh");
		cusC.totalMoneySpend(8000);
		System.out.println();
		
		empA = new Manager("Masud", "01712345678", "masud@gmail.com", 20000, "Serving");
		
		System.out.println("\t\tFor Manager 1 ... \n");
		empA.print();
		System.out.println();
		
		empB = new Manager("Kamal", "01688311478", "kamal@gmailcom", 20000, "Serving");
		
		System.out.println("\t\tFor Manager 2 ... \n");
		empB.print();
		System.out.println();
	}
	
}