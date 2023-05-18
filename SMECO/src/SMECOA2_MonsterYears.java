//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA2_MonsterYears 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Enter start year: ");
		int a =kbReader.nextInt();
		System.out.print("Enter end year: ");
		int b =kbReader.nextInt();
		
		int c=0;
		int c2=0;
		int c3=0;
		int c4=0;
		int c5=0;
		
		while(a<=b)
		{
			c=a%100;
			c2=(int)(Math.floor(a/100));
			c4=c+c2;
			c5=(int)(Math.floor(a%1000));
			c3=(int)(Math.floor(c5/10));
			if(c3==c4)
			{
				System.out.print(a+" ");
			}
			a++;
		}
	}

}
