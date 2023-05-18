//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA4_PerfectNumbers 
{

	public static void main(String[] args) 
	{
		Scanner kbReader=new Scanner(System.in);
		System.out.print("What is the number? ");
		int a=kbReader.nextInt();
		int q=0;
		
		int y[]=new int[a];
		
		for(int x=1;x<a;x++)
		{
			if(a%x==0)
			{
				y[x]=x;
			}
		}
		for(int z=0;z<a;z++)
		{
			q=q+y[z];
		}
		if(q==a)
			System.out.println("It is a perfect number.");
		else
			System.out.println("Not a perfect number.");
	}

}
