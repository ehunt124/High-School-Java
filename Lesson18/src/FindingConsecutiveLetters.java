//Author: Ethan Hunt
//Period 1
import java.util.*;
public class FindingConsecutiveLetters 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		String x=kbReader.nextLine();
		x=x.toUpperCase();
		String sp[];
		int j;
		
		sp=x.split("\\s+");
	    for(int i=0;i<sp.length;i++)
	    {
	        for(j=1;j<sp[i].length();j++)
	        {
	            if(sp[i].charAt(j) == sp[i].charAt(j-1))
	            {
	            System.out.println(sp[i]);
	            break; //had to use break no other way out of the loop
	            }
	        }       
	    }
	}
}
