//Author: Ethan Hunt
//Period 1
import java.io.*;
import java.util.*;
public class FullName 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("What is your first name? ");
		String a= kbReader.next( );
		System.out.print("What is your last name? ");
		String b= kbReader.next( );
		System.out.println("Your full name is "+a+" "+b+".");
	}

}
