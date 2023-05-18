//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA1_AfterTax 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.println("Enter 3 items: ");
		double n[]=new double[3];
		for(int x=0;x<3;x++)
				n[x]=kbReader.nextDouble();
		System.out.println("Output: ");
		for(int y=0;y<3;y++)
		{
			System.out.print(n[y]+" ");
			System.out.print(Math.floor((n[y]*.06)*100)/100+" ");
			System.out.println(Math.floor((n[y]*1.06)*100)/100);
		}
	}

}
