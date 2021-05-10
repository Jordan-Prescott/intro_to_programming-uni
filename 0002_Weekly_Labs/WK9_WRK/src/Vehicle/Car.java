package Vehicle;

public class Car extends Vehicle 
{
	
	private int doors;
	private boolean heatedSeats;
	
	public Car(int numberWheels, String make, int doors, boolean heatedSeats) 
	{
		super(numberWheels, make);
		this.doors = doors;
		this.heatedSeats = heatedSeats;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isHeatedSeats() {
		return heatedSeats;
	}

	public void setHeatedSeats(boolean heatedSeats) {
		this.heatedSeats = heatedSeats;
	}

	@Override
	public String toString() {
		return "Car [doors=" + doors + ", heatedSeats=" + heatedSeats + "]";
	}

	@Override
	public int getTopSpeed() {
		// TODO Auto-generated method stub
		return 140;
	}

	@Override
	public int getAverageSpeed() {
		// TODO Auto-generated method stub
		return 30;
	}
	
	

}
