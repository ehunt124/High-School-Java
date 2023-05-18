//Author: Ethan Hunt
//Period 1
import java.util.*;
public class BaseConversion 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.println("Imput a number: ");
		String y=kbReader.nextLine();
		System.out.println("Imput the base of that number: ");
		int x=kbReader.nextInt();
		System.out.println("Imput a base to convert to: ");
		int z=kbReader.nextInt();
		if(z>=36)
			System.out.println("Please enter a base less than 36");
		int g=Integer.parseInt(y,x);
		if(z<=36)
			System.out.println(Integer.toString(g,z));
	}

}
