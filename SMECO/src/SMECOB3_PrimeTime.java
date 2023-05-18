//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOB3_PrimeTime 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		int q =kbReader.nextInt();
		int o[]=new int[q];
		int h[]=new int[1000];
		int v[]=new int[1000];
		int j=0,flag=0;
		for(int l=0;l<q;l++)
		{
			o[l] =kbReader.nextInt();
			if(o[l]<=0||o[l]>=1000)
			{
				System.out.println("Please enter a valid number");
				break;
			}
		}
		for(int p=0;p<q;p++)
		{
			//finding the numbers factors
			for(int i1=1;i1<=o[p];i1++)
			{
				if(o[p]%i1==0)
				{
					h[i1]=i1;
				}
			}
			//finding if numbers are prime delete non prime numbers from h array
			for(int k=0;k<h.length;k++)
			{
				if(h[k]==2)
					v[k]=h[k];
				else if(h[k]>2)
				{
					for(j=2;j<h[k];j++)
					{
						if(h[k]%j==0)
						{
							flag=0;
							break;
						}
						else
						{
							flag=1;
						}
					}
					if(flag==1)
					{
						v[k]=h[k];
					}
				}
				
			}
			Arrays.sort(v);
			System.out.println(v[v.length-1]);//printing highest factor that is a prime
			for(int q1=0;q1<v.length;q1++)
			{
				v[q1]=0;
				h[q1]=0;
			}
		}
	}

}
