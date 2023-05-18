//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOB4_Emirp 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		String q =kbReader.nextLine();
		String a[]=new String[2];
		int d[]=new int[2];
		a=q.split("\\s");
		int flag = 0, i, j;
		d[0]=Integer.parseInt(a[0]);
		d[1]=Integer.parseInt(a[1]);
		String v="";
		String reversed="";
		int p=0;
		
		for(i=d[0];i<=d[1];i++)
        {
             for(j=2;j<i;j++)//finding if first number is prime
             {
                 if(i%j==0)
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
            	v=String.valueOf(i);
         		int length=v.length();
         		for(int x=length-1;x>=0;x--)//reversing number using NameReversal 
         		{
         			char letter=v.charAt(x);
         			reversed=reversed+letter;
         		}
         		int e=Integer.parseInt(reversed);
         		v="";
         		reversed="";
         		if(e!=i)//excluding palindromic numbers
         		{
         			for(j=2;j<e;j++)//finding if the second number is prime
         			{	
         				if(e%j==0)
         				{
         					flag=0;
         					break;
         				}
         				else
         				{
         					flag = 1;
                    	}
                	}
         			if(flag==1)
                	{
                		System.out.println(i);
                		p++;
                	}
         		}
             }
         }
		 if(p==0)
         {
			 System.out.println("NONE");
         }
	}

}
