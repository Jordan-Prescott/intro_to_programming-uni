
public class Seats 
{
	private int numSeats;
	private boolean heated;
	
	public Seats(int numSeats, boolean heated)
	{
		this.numSeats = numSeats;
		this.heated= heated;
	}
	
	public int getNumSeats()
	{
		return numSeats;
	}
	
	public boolean getHeated()
	{
		return heated;
	}
	
	public void setNumSeats(int numSeats)
	{
		this.numSeats = numSeats;
	}
	
	public void setHeated(boolean heated)
	{
		this.heated = heated;
	}
	
	public String toString()
	{
		return numSeats + " Seats " + ", heated = " + heated;
	}
}
