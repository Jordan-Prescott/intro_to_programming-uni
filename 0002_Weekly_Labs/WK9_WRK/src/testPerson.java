
public class testPerson 
{

	public static void main(String[] args) 
	{
		
		Person person1 = new Person("John Smoth", 123456);
		Student student1 = new Student("Jane Doe", 253634, "DTS");
		Lecturer lecturer1 = new Lecturer("Matt", 654987, 123455, "Computer Science");
	
		System.out.println(person1);
		System.out.println(student1);
		System.out.println(lecturer1);
		
		Person [] people = new Person[5];
		
		people[0] = person1;
		people[1] = student1;
		people[2] = lecturer1;
		people[3] = new Student("ABC", 123456, "Art");
		people[4] = new Lecturer("XYZ", 987654, 987654, "Biology" );
		
	}

}
