//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOB2_Perfection 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		int d[]=new int[100];
		int n[]=new int[100];
		int sum=0;
		
		int o =kbReader.nextInt();
		for(int a=0;a<o;a++)
		{
			n[a] =kbReader.nextInt();
		}
		for(int k=0;k<o;k++)
		{
			for(int l=1;l<n[k];l++)
			{
				if((n[k]%l)==0)
				{
					d[l]=l;
				}
			}
			for(int m=0;m<d.length;m++)
			{
				sum=sum+d[m];	
			}
			if(n[k]==sum)
			{
				System.out.println("PERFECT");
			}
			else if(n[k]<sum)
			{
				System.out.println("ABUNDANT");
			}
			else if(n[k]>sum)
			{
				System.out.println("DEFICIENT");
			}
			for(int l=1;l<n[k];l++)
			{
				d[l]=0;
			}
			sum=0;
		}
		
	}

}
