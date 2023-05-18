//Author: Ethan Hunt
//Period 1
import java.util.*;
public class CrabFeast 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		double cost=10;
		
		System.out.print("How many hard crabs did you eat? (#) ");
		double crab= kbReader.nextDouble( );
		if (crab>=1&&crab<=5)
		{
			cost=cost+crab;
		}
		if (crab>=6&&crab<=10)
		{
			cost=cost+(crab*.75);
		}
		if (crab>=11)
		{
			cost=cost+(crab*.65);
		}
		
		System.out.print("How many corn on the cobs did you eat? (#) ");
		double corn= kbReader.nextDouble( );
		if (corn>=3)
		{
			cost=cost+((corn-2)*.5);
		}
		
		System.out.print("How many ice teas did you drink? (#) ");
		double tea= kbReader.nextDouble( );
		if(tea==3)
		{
			cost=cost+.75;
		}
		if(tea==4)
		{
			cost=cost+.75;
		}
		
		System.out.println("The cost of the feast is $"+cost+".");
	}

}
