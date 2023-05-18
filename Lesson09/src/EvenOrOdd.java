//Author: Ethan Hunt
//Period 1
import java.util.*;
public class EvenOrOdd 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Enter an interger: ");
		int even_odd= kbReader.nextInt();

		if (even_odd%2==0)
		{
			System.out.println("The interger "+even_odd+" is even.");
		}
		else
		{
			System.out.println("The interger "+even_odd+" is odd.");
		}
	}

}
