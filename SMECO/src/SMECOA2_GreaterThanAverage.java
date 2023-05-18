//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA2_GreaterThanAverage 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.println("Imput: ");
		int x[]=new int[100];
		int c=0;
		int d=0;
		int output=0;
		double av=0;
		for(int n=0;n<100;n++)
		{
			x[n]=kbReader.nextInt();
			d++;
			if(x[n]==0)
			{
				break;
			}
		}
		for(int k=0;k<d;k++)
		{
			if(x[k]!=0)
				c++;
		}
		for(int l=0;l<100;l++)
		{
			av=av+x[l];
		}
		av=av/c;
		for(int o=0;o<d;o++)
		{
			if(x[o]>av)
				output++;
		}
		if (output<1)
			System.out.println("There are no numbers greater than the average.");
		if (output==1)
			System.out.println("The "+output+" number greater than the average is: ");
		if (output>1)
			System.out.println("The "+output+" numbers greater than the average are: ");
		for(int p=0;p<d;p++)
		{
			if(x[p]>av)
				System.out.println(x[p]);
		}
	}

}
