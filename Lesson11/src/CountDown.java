//Author: Ethan Hunt
//Period 1
import java.util.*;
public class CountDown 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Please enter a number less than 100. ");
		int number=kbReader.nextInt();
		
		for(int x=100;x>=number;x=x-5)
		{
			System.out.println(x);
		}
		System.out.println("I stopped");
	}

}
