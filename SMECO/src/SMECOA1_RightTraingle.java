//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA1_RightTraingle 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.println("Imput base & height of right triangle: ");
		int x=kbReader.nextInt();
		int y=kbReader.nextInt();
		double area=(x/2)*x;
		String g="*";
		if(x!=y)
			System.out.println("Not a right triangle.");
		else if(x==y)
		{
			for(int l=0;l<x;l++)
			{
				System.out.println(g);
				g=g+"*";
			}
			System.out.println(area);
		}
	}

}
