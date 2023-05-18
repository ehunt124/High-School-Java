//Author: Ethan Hunt
//Period 1
public class ModFib 
{
	public ModFib()
	{
		
	}
	public static int modFibonacci(int n)
	{
		if(n==0)
			return 3;
		if(n==1)
			return 5;
		if(n==2)
			return 8;
		else
		{
			n=modFibonacci(n-1)+modFibonacci(n-2)+modFibonacci(n-3);
			return n;
		}
	}
}
