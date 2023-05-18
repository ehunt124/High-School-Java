//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOB1_LunchTime 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.println("Input: ");
		String n=kbReader.nextLine();
		n=n.toLowerCase();
		if(n.contains("food"))
		{
			System.out.println("Output:");
			System.out.println("full");
		}
		else if(n.contains("eat"))
		{
			System.out.println("Output:");
			System.out.println("full");
		}
		else if(n.contains("lunch"))
		{
			System.out.println("Output:");
			System.out.println("full");
		}
		else
		{
			System.out.println("Output:");
			System.out.println("hungry");
		}
	}

}
