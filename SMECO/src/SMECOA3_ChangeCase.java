//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA3_ChangeCase 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Input: ");
		String x=kbReader.nextLine();
		String y[]=new String[x.length()];
		for(int j=0;j<x.length();j++)
		{
			y[j]="";
			y[j]=y[j]+x.charAt(j);
			if(Character.isUpperCase(x.charAt(j))==true)
			{
				System.out.print(y[j].toLowerCase());
			}
			if(Character.isLowerCase(x.charAt(j))==true)
			{
				System.out.print(y[j].toUpperCase());
			}
		}
		
	}
}
