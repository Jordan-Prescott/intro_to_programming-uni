package Snowboards;

public class Snowboards 
{
	int length;
	String camber;
	boolean canDoSickJumps;
	
	public Snowboards(int length, String camber, boolean canDoSickJumps)
	{
		this.length = length;
		this.camber = camber;
		this.canDoSickJumps = canDoSickJumps;
	}
	
	public String toString()
	{
		return length+","+camber+","+canDoSickJumps+",";
	}
}
