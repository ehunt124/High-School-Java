import java.text.NumberFormat;

//Author: Ethan Hunt
//Period 1
public class CubeRoots 
{

	public static void main(String[] args) 
	{
		
			
		for(int i=1;i<=25;i++)
		{
			double cubeRoot = Math.pow(i, (1.0/3.0));
			System.out.println(i+" "+cubeRoot);
		}
	}

}
