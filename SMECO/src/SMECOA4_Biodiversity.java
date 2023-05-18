//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA4_Biodiversity 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Imput: ");
		String x=kbReader.nextLine();
		int output=0;
		String sp[];
		sp=x.split("D");
		int o[]=new int[30];
		int r[]=new int[100];
		
		for(int y=0;y<sp.length;y++)
		{
			if(sp[y].equals(""))
				continue;
			o[y]=sp[y].length();
		}
		for(int j=0;j<o.length;j++)
		{
			if(o[j]!=0)
			{
				for(int k=1;k<100;k++)
				{
					if(r[k]!=k)
					{
						if(o[j]==k)
						{
							output++;
							r[k]=k;
						}	
					}
				}
			}
		}
	    System.out.println("Output: "+(output));
	}

}