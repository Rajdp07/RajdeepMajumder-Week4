package Week3_1.interest;

import java.io.IOException;
import java.io.PrintWriter;

public class Display {

public static void main(String args[]) throws IOException
{
	CalculateInterest ob= new CalculateInterest();
	PrintWriter pw =new PrintWriter(System.out,true);
	pw.print("Simple Interest:");
	pw.println(ob.SimpleInterest(5000,12,4));
	pw.print("Compound Interest:");
	pw.println(ob.CompoundInterest(5000,12,4));
	
}

}
