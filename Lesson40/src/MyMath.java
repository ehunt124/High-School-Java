//Author: Ethan Hunt
//Period 1
import java.util.*;
public class MyMath 
{
	public static int myMath(int n)
	{
		if(n<0)
		{
			System.out.println("Please enter a positive interger.");
			return n;
		}
		if(n==0)
			return 0;
		else
			return n*n+myMath(n-1);
	}
	public static void main(String[] args)
	{
		Scanner kbReader=new Scanner(System.in);
		System.out.print("Enter an interger: ");
		int n=kbReader.nextInt();
		System.out.println(myMath(n));
	}
}

