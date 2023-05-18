//Author: Ethan Hunt
//Period 1
import java.util.*;
public class GenerateRandomDoubles 
{

	public static void main(String[] args) 
	{
		double l;
		Random rndm= new Random();
		System.out.println("27 random doubles between 99.78 & 147.22: ");
		for(int j=0;j<33;j++)
		{
			l= 99.78+(147.22-99.78)*rndm.nextDouble();
			System.out.print(l+" ");
		}
	}

}
