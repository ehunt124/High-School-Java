//Author: Ethan Hunt
//Period 1
import java.util.*;
public class Scholarship2 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		int money=0;
		
		System.out.print("What is your percent GPA? (#) ");
		int GPA= kbReader.nextInt( );
		if(GPA<=80)
		{
			money= money+0;
		}
		if(GPA>=81&&GPA<=85)
		{
			money= money+100;
		}
		if(GPA>=86&&GPA<=92)
		{
			money= money+300;
		}
		if(GPA>=99&&GPA<=100)
		{
			money= money+1000;
		}
		
		System.out.print("How many Ap classes do you take? (#) ");
		int AP= kbReader.nextInt( );
		money= money+(AP*100);
		
		System.out.print("What was your SAT score? (#) ");
		int SAT= kbReader.nextInt( );
		if(SAT<=1800)
		{
			money=money+0;
		}
		if(SAT>=1801&&SAT<=2000)
		{
			money=money+200;
		}
		if(SAT>=2001&&SAT<=2200)
		{
			money=money+400;
		}
		if(SAT>=2201)
		{
			money=money+700;
		}
		
		System.out.println("Your total scholarship balance is $"+money+".");
	}
}
