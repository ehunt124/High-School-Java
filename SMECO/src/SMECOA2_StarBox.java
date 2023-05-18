//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA2_StarBox 
{

	public static void main(String[] args) 
	{
		
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Please input a word consisting of 1 to 15 characters: ");
		String x=kbReader.nextLine();
		String z="****";
		String l="* ";
		if (x.length()<=15)
		{
			for(int y=0;y<x.length();y++)
			{
				z=z+"*";
			}
			for(int c=0;c<x.length();c++)
			{
				l=l+" ";
			}
			l=l+" *";
			System.out.println(z);
			System.out.println(l);
			System.out.println("* "+x+" *");
			System.out.println(l);
			System.out.println(z);
		}
		else
		{
			System.out.println("Please enter a valid word (A word consisting of 1 to 15 letters)");
		}
	}

}
