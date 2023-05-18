//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOB3_ArmstrongNumbers 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		int q =kbReader.nextInt();
		int o[]=new int[q];
		for(int i=0;i<q;i++)
		{
			o[i] =kbReader.nextInt();
			if(o[i]<0||o[i]>200000000)
			{
				System.out.println("Please enter a valid number");
				break;
			}
		}
		
		for(int i=0;i<q;i++)
		{
			int z=0;
			z=o[i];
			int a= String.valueOf(o[i]).length();
			int p[]=new int[a];
			int sum=0;
		
			for(int j=0;j<a;j++)
			{
				p[j]=o[i]%10;
				o[i]=o[i]/10;
				p[j]=(int) Math.pow(p[j], a);
			}
			for(int b=0;b<(p.length);b++)
			{
				sum=sum+p[b];
			}
			if(z==sum)
			{
				System.out.println("ARMSTRONG");
			}
			if(z!=sum)
			{
				System.out.println("NOT AN ARMSTRONG");
			}
			z=0;
			sum=0;
		}
	}

}
