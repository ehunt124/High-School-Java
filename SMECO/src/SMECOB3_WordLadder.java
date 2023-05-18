import java.util.*;

//Author: Ethan Hunt
//Period 1
public class SMECOB3_WordLadder 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Imput: ");
		String x=kbReader.nextLine();
		String sp[];
		sp=x.split("\\s");
		char y[]=new char[sp[0].length()];
		int output=0;
		String exit="";
		
		for(int z=1;z<sp.length;z++)
		{
			for(int j=0;j<sp[z-1].length();j++)
			{
				y[j]=sp[z-1].charAt(j);
			}
			for(int n=0;n<sp[z].length();n++)
			{
				if(output<=1)
				{
					if(y[n]!=sp[z].charAt(n))
					{
						output++;
					}
					exit="True";
				}
				if(output==2)
				{
						exit="False";
				}
			}
			output=0;
		}
		System.out.println(exit);
	}

}
