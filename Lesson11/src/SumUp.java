//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SumUp 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Imput an interger less than 100: ");
		int number=kbReader.nextInt();
		int sumup=0;
		for(int x=0;x<=number;x++)
		{
			sumup=sumup+x;
		}
		System.out.println("The sum is "+sumup);
	}

}
