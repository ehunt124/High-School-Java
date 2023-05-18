//Author: Ethan Hunt
//Period 1
import java.util.*;
public class ModFibRunner 
{

	public static void main(String[] args) 
	{
		Scanner kbReader=new Scanner(System.in);
		System.out.print("Generate which term? ");
		int k=kbReader.nextInt();
		System.out.println("Term #"+k+" is "+ModFib.modFibonacci(k));
	}

}
