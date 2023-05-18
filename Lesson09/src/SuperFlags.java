//Author: Ethan Hunt
//Period 1
/*
Chad Belgium 
Cameroon Andorra
Argentina Azerbaijan 
Armenia Austria 
*/
import java.util.*;
public class SuperFlags 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Does the flag have vertical stripes? (Y/N) ");
		String Stripes= kbReader.next( );
		
		
		if (Stripes.equalsIgnoreCase("Y"))
		{
			System.out.print("Does the flag have a symbol? (Y/N) ");
			String Symbol1= kbReader.next( );
			if (Symbol1.equalsIgnoreCase("Y"))
			{
				System.out.print("Is the symbol a star? (Y/N) ");
				String Star= kbReader.next( );
				if (Star.equalsIgnoreCase("Y"))
					System.out.println("Cameroon");
				else if (Star.equalsIgnoreCase("N"))
					System.out.println("Andorra");
			}
			else if(Symbol1.equalsIgnoreCase("N"))
			{
				System.out.print("Does the flag have a black stripe? (Y/N) ");
				String Stripe1= kbReader.next( );
				if (Stripe1.equalsIgnoreCase("Y"))
					System.out.println("Belgium");
				else if (Stripe1.equalsIgnoreCase("N"))
					System.out.println("Chad");
			}
		}
		else if (Stripes.equalsIgnoreCase("N"))
		{
			System.out.print("Does the flag have a symbol? (Y/N) ");
			String Symbol2= kbReader.next( );
			if (Symbol2.equalsIgnoreCase("Y"))
			{
				System.out.print("Does the flag have a moon shaped symbol? (Y/N) ");
				String Moon= kbReader.next( );
				if(Moon.equalsIgnoreCase("Y"))
					System.out.println("Azerbaijan");
				else if(Moon.equalsIgnoreCase("N"))
					System.out.println("Argentina");
			}
			else if (Symbol2.equalsIgnoreCase("N"))
			{
				System.out.print("Does th flag have a white stripe? (Y/N) ");
				String Stripe2= kbReader.next( );
				if(Stripe2.equalsIgnoreCase("Y"))
					System.out.println("Austria");
				else if(Stripe2.equalsIgnoreCase("N"))
					System.out.println("Armenia");
			}
		}
	}

}
