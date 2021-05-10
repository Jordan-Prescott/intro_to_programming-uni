package E3_Company;

import E2_Employee.Employee;

public class testCompany {

	public static void main(String[] args) {
		// create each employee
		Employee employee1 = new Employee("Jane Doe", "Manager", 20, 40000);
		Employee employee2 = new Employee("Joe Bloggs", "Team Leader", 10, 30000);
		Employee employee3 = new Employee("John Smith", "Salesman", 5, 25000);

		// put employees into an array
		Employee[] employees = { employee1, employee2, employee3 };

		// create the company and print it out in it's initial state
		Company company = new Company("Megacorp", employees);
		System.out.println(company);

		// implement pay rise and print out again to observe change
		System.out.println("----------------------------------------");
		System.out.println("Implementing payrise...");
		company.annualPayRise();
		System.out.println(company);
	}// main

}
