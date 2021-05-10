package Vehicle;

public class testVehicle 
{
	
	public static void main(String[] args)
	{
		Vehicle [] vehicles = new Vehicle[3];
		
		vehicles[0] = new Car (4, "Ford", 5, true);
		vehicles[1] = new Lorry (16, "Mercedes", "Baked Goods", "France");
		vehicles[2] = new Car (4, "Nissan", 3, false);
	
		for(Vehicle vehicle : vehicles)
		{
			System.out.println(vehicle); // Missed out details here look in the lecture 
		}
		
		speedReport(vehicles[0]);
	}
	
	public static void speedReport(hasSpeed item)
	{
		System.out.println("Top Speed: " + item.getTopSpeed());
		System.out.println("Average Speed: " + item.getAverageSpeed());
	}

}
