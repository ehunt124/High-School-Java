//Author: Ethan Hunt
//Period 1
import java.util.*;
public class SMECOA3_NumberSequence 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("Enter start number: ");
		int a =kbReader.nextInt();
		System.out.print("Output: ");
		while(a>0)
		{
			int n=a;
			a=(int)(Math.floor(Math.sqrt(a)));
			int b=(int)a;
			a=(int)(n-(Math.pow(b, 2)));
			System.out.print(a+" ");
		}
	}

}
