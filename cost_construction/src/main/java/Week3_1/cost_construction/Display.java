package Week3_1.cost_construction;

import java.io.IOException;
import java.io.PrintWriter;

public class Display {

public static void main(String args[]) throws IOException
{
	ConstructionCost ob= new ConstructionCost();
	PrintWriter pw =new PrintWriter(System.out,true);
	pw.println(ob.Construction(50,"HIGH STANDARD MATERIAL","YES"));
	
}

}
