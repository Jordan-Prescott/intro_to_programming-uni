import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class writefile {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		PrintWriter out = new PrintWriter("data/output.txt");
		out.close();

	}

}
