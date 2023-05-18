//Author: Ethan Hunt
//Period 1
import java.util.*;
public class CryptoDecipher 
{

	private static final char[] fin = null;
	private static char[] d;

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.println("Would you like to:");
		System.out.println(" 1. Create a cryptic message (String to ASCII).");
		System.out.println(" 2. Decipher a cryptic message (ASCII to String).");

		int choice=kbReader.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Please enter your String message to create a cryptic message in ASCII one letter at a time (Type STOP to stop):");
			int a=0;
			String z="";
			while(a!=10)
			{
				String x=kbReader.next();
				if(x.equals("STOP"))
				{
					a=10;
					continue;
				}
				char letter=x.charAt(0);
				int number=(char)letter;
				z=z+(number+" ");
			}
			System.out.print(z);
			break;
		case 2:
			System.out.println("Please enter your ASCII message to decipher into a string one number at a time (Type 0000 to stop):");
			int a1=0;
			String y="";
			while(a1!=10)
			{
				int x=kbReader.nextInt();
				if(x==0000)
				{
					a1=10;
					continue;
				}
				char letter=(char)x;
				y=y+(letter+" ");
			}
			System.out.println(y);
			break;
		default:
			System.out.println("Please enter a number 1 or 2");
		}
	}

}
