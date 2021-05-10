
public class Lecturer extends Person 
{

	private int salary;
	private String subject;
	
	public Lecturer(String name, int idNumber, int salary, String subject) 
	{
		super(name, idNumber);
		this.salary = salary;
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() 
	{
		return super.toString() + ", salary=" + salary + ", subject=" + subject;
	}
	
	
}
