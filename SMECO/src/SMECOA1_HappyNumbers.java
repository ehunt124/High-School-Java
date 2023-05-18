//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA1_HappyNumbers 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		int n =kbReader.nextInt();
	
		int t=n;
		int v=0;
		int v2=0;
		
		while(t!=4)
		{
			v=0;
			while(t!=0)
			{
				v2=t%10;
				t=t/10;
				v+=(Math.pow(v2, 2));
			}
			t=v;
			if(t==1)
				break;
		}
		if(t==1)
			System.out.println(n+" is a happy number.");
		else
			System.out.println(n+" is not a happy number.");
	}
}
