//Author: Ethan Hunt
//Period 1
import java.util.*;
public class Flags 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Does the flag have vertical stripes? (Y/N) ");
		String Y_N= kbReader.next( );
		
		
		if (Y_N.equalsIgnoreCase("Y"))
		{
			System.out.print("Does the flag have a black stripe? (Y/N) ");
			String Black_Blue= kbReader.next( );
			if (Black_Blue.equalsIgnoreCase("Y"))
				System.out.println("Belgium");
			else if (Black_Blue.equalsIgnoreCase("N"))
				System.out.println("Chad");
		}
		else if (Y_N.equalsIgnoreCase("N"))
		{
			System.out.print("Does the flag have blue stripes? (Y/N) ");
			String Red_Blue= kbReader.next( );
			if (Red_Blue.equalsIgnoreCase("Y"))
				System.out.println("Argentina");
			else if (Red_Blue.equalsIgnoreCase("N"))
				System.out.println("Austria");
		}
	}

}
