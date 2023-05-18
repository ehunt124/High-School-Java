//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOB1_MarchMadness 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.println("How many points were scored?");
		int n=kbReader.nextInt();
		int a=3;//3 pointer
		int b=2;//field goal
		int c=1;//foul shot
		int output=0;
		for(int x=0;x<=n;x++)
		{
			for(int y=0;y<=n;y++)
			{
				for(int z=0;z<=n;z++)
				{
					if(n==(x*a)+(b*y)+(c*z))
					{
						System.out.println(x+" three pointer(s), "+y+" field goal(s), "+z+" foul shot(s)");
						output++;
					}
				}
			}
		}
		System.out.println("There are "+output+" different ways to score "+n+" points");
	}

}
