//Author: Ethan Hunt
//Period 1
import java.util.*;
public class Wavelength 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("What is the wavelength of the light in nanometers? (#) ");
		int nm= kbReader.nextInt( );
		
		if(nm>=400&&nm<450)
		{
			System.out.println("The color is violet.");
		}
		if(nm>=450&&nm<490)
		{
			System.out.println("The color is blue.");
		}
		if(nm>=490&&nm<560)
		{
			System.out.println("The color is green.");
		}
		if(nm>=560&&nm<590)
		{
			System.out.println("The color is yellow.");
		}
		if(nm>=590&&nm<630)
		{
			System.out.println("The color is orange.");
		}
		if(nm>=630&&nm<700)
		{
			System.out.println("The color is red.");
		}
		
		if(nm<400)
		{
			System.out.println("The light is Ultra Violet");
		}
		if(nm>700)
		{
			System.out.println("The light is Infrared");
		}
		
	}

}
