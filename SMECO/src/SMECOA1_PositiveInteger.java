//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA1_PositiveInteger 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Enter a number less than 10,000: ");
		int x=kbReader.nextInt();
		int l=String.valueOf(x).length();
		int a[]=new int[l];
		if(x<=10000)
		{
			for(int j=0;j<l;j++)
			{
				a[j]=x%10;
				x=x/10;
			}
			Arrays.sort(a);
			for(int k=l-1;k>=0;k--)
			{
				System.out.print(a[k]);
			}
		}
		else
		{
			System.out.println("Please enter a valid number (less then 10,000)");
		}
	}

}
