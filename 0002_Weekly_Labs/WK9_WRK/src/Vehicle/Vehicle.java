package Vehicle;

public abstract class Vehicle implements hasSpeed
{
	
	private int numberWheels;
	private String make;
	
	public Vehicle(int numberWheels, String make) 
	{
		super();
		this.numberWheels = numberWheels;
		this.make = make;
	}

	public int getNumberWheels() {
		return numberWheels;
	}

	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Vehicle [numberWheels=" + numberWheels + ", make=" + make + "]";
	}
	
	

}
