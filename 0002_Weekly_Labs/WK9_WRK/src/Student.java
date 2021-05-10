
public class Student extends Person 
{
	
	private String theme;
	
	
	public Student(String name, int idNumber, String theme) 
	{
		super(name, idNumber);
		this.theme = theme;
	}


	public String getTheme() 
	{
		return theme;
	}


	public void setTheme(String theme) 
	{
		this.theme = theme;
	}
	
	public String toString()
	{
		return super.toString() + ", theme = " + theme;
 	}

}
