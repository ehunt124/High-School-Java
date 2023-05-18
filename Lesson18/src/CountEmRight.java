//Author: Ethan Hunt
//Period 1
import java.util.*;
public class CountEmRight 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		
		String x="";
		
		while(!x.equals("EXITXXX"))
		{
		System.out.print("Type in a sentence and press enter. ");
		x=kbReader.nextLine();
		x=x+"XXX";
		x=x.toUpperCase();
		if (x.equals("EXITXXX"))
		{
			continue;
		}
		x = x.replaceAll("\\s","");
		String sp[]=x.split("SA");
		int d =sp.length-1;
		System.out.println("There are "+d+" occurrences.");
		}
	}

}
