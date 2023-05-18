//Author: Ethan Hunt
//Period 1
import java.util.*;
public class GenerateRandomIntergers 
{

	public static void main(String[] args) 
	{
		int r=0;
		Random rndm= new Random();
		System.out.println("33 random intergers between 71 & 99: ");
		for(int j=0;j<33;j++)
		{
			r=71+rndm.nextInt(28);
			System.out.print(r+" ");
		}
	}

}
