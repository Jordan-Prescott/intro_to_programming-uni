package E2_Employee;

public class testEmployee 
{

	public static void main(String[] args) 
	{
		// variables locally stored with different values to test Employee class
		Employee employee1 = new Employee("Jordan", "Network Engineer", 5, 10000000000000.99);
		Employee employee2= new Employee("Daniel", "Technical Supervisor", 3, 1000000.99);
		Employee employee3 = new Employee("Reece", "Technical Engineer", 3, 10000.99);
		
		// prints the values returned from calling the class
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
	}

}
