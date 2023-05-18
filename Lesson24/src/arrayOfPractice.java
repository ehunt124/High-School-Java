//Author: Ethan Hunt
//Period 1
import java.util.*;
public class arrayOfPractice 
{

	public static void main(String[] args) 
	{
		Scanner kbReader=new Scanner(System.in);
		int a[]=new int[20];
		for(int o=0;o<a.length;o++)
		{
			a[o]=kbReader.nextInt();
			if(a[o]%2==0)
				a[o]=(int) Math.pow(a[o],2);
			else
				a[o]=0;
		}
		for(int o=0;o<a.length;o++)
			System.out.println(a[o]);
	}

}
