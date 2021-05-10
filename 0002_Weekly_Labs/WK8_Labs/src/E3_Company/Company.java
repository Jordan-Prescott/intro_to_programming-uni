package E3_Company;

import E2_Employee.Employee;

public class Company {
	// a string variable representing the name of the company
	private String companyName;

	// an array of employee objects
	private Employee[] employees;

	// the main constructor. Takes name of company and an array of employees.
	public Company(String companyName, Employee[] employees) {
		this.companyName = companyName;
		this.employees = employees;
	}// constructor

	public String toString() {
		// first build a string containing information of all the employees stored
		// in the array
		String employeesString = "";
		for (Employee employee : employees)
			employeesString += employee + ". ";

		// then return the name and the info on the employees
		return "Company Name: " + companyName + ". Employees: " + employeesString;
	}// toString

	public void annualPayRise() {
		// implement this method
		for (Employee employee : employees)
		{
			// gets the variable from Employee salary
			double employeeSalary = employee.getSalary();
			
			// times employee salary by 10% for the yearly increase
			employeeSalary = employeeSalary * 1.1;
			
			// set the new variable in the class Employee
			employee.setSalary(employeeSalary);
			
			// gets the variable from Employee numYears
			int employeeNumYears = employee.getNumYears();
			
			// increments the variable by 1 for 1 years 
			employeeNumYears = employeeNumYears + 1;
			
			// sets the new variable value in the class Employee
			employee.setNumYears(employeeNumYears);
		}
		// method should add one year to each employees 'years worked' and increase
		// their pay by a percentage of your choosing

	}// annualPayRise
}// Company