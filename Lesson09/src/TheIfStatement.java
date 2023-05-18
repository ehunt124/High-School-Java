//Author: Ethan Hunt
//Period 1
import java.util.*;
public class TheIfStatement 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("What is the password?");
		String password= kbReader.next( );
		
		if(password.equals("XRay"))
		{
			System.out.println("Password entered succesfully.");
		}
		else
		{
			System.out.println("Incorrect password.");
		}
	}

}
