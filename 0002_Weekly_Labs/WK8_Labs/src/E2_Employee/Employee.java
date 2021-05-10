package E2_Employee;

public class Employee 
{
	
	// private variables needed to return class value
	private String name;
	private String title;
	private int numYears;
	private double salary;

	public Employee(String name, String title, int numYears, double salary) 
	{
		this.name = name;
		this.title = title;
		this.numYears = numYears;
		this.salary = salary;
	}

	// methods that update private variables on each instance this method is called
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumYears() {
		return numYears;
	}

	public void setNumYears(int numYears) {
		this.numYears = numYears;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// toString method - this is what will be returned when calling this class without specifying method and is used to when called in a print method
	public String toString() {
		return "[Name = " + name + ", Title = " + title + ", Years of Service = " + numYears + ", Salary = " + salary + "]";
	}
	
}
