package Vehicle;

public class Lorry extends Vehicle 
{

	private String cargo;
	private String origin;
	
	public Lorry(int numberWheels, String make, String cargo, String origin) 
	{
		super(numberWheels, make);
		this.cargo = cargo;
		this.origin = origin;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Lorry [cargo=" + cargo + ", origin=" + origin + "]";
	}

	@Override
	public int getTopSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int getAverageSpeed() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	
	
	
}
