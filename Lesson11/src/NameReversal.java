//Author: Ethan Hunt
//Period 1
import java.util.*;
public class NameReversal 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Please enter your name. ");
		String name=kbReader.nextLine();
		
		String reversed="";
		int length=name.length();
		
		for(int x=length-1;x>=0;x--)
		{
			char letter=name.charAt(x);
			reversed=reversed+letter;
		}
		System.out.println(reversed.toLowerCase());
	}

}
