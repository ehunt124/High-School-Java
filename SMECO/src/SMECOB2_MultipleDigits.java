//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOB2_MultipleDigits 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		int k=kbReader.nextInt();
		String d=kbReader.nextLine();//to get rid of the glitch where java skips a line
		String b[]=new String[2];
		int x[]=new int[k];
		String z[]=new String[k];
		char[] s;
		int e=0;
		int f=0;
		for(int m=0;m<k;m++)
		{
			String a=kbReader.nextLine();
			b=a.split("\\s");
			x[m]=Integer.parseInt(b[0]);
			z[m]=b[1];
		}
		for(int i=0;i<k;i++)
		{
			s=z[i].toCharArray();
			for(int v=2;v<100;v++)
			{
				for(int g=0;g<s.length;g++)
				{
					if(f==0)
					{
						if(String.valueOf(x[i]*v).contains(Character.toString(s[g])))
						{
							e++;
						}
						if(g==s.length-1)
						{
							if(e==0)
							{
								System.out.println(x[i]*v);
								f++;
							}	
						}	
					}
				}
				e=0;
			}
			f=0;
		}
	}

}
