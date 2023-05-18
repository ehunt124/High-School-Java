//Author: Ethan Hunt
//Period 1
import java.util.*;
public class PirateRanking 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		int score=0;
		
		System.out.print("Are you male or female? (M/F) ");
		String gender= kbReader.next( );
		if (gender.equalsIgnoreCase("M"))
		{
			score= score+30;
		}
		else if(gender.equalsIgnoreCase("F"))
		{
			score= score+35;
		}
		
		System.out.print("What is your nationality? (French,Dutch,Spanish or English) ");
		String nationality= kbReader.next( );
		if(nationality.equalsIgnoreCase("French"))
		{
			score=score-10;
		}
		else if(nationality.equalsIgnoreCase("Dutch"))
		{
			score=score+0;
		}
		else if(nationality.equalsIgnoreCase("Spanish"))
		{
			score=score+25;
		}
		else if(nationality.equalsIgnoreCase("English"))
		{
			score=score+15;
		}
		
		System.out.print("What is your crew size? ");
		int crewsize= kbReader.nextInt( );
		if(crewsize<10)
		{
			score=score-5;
		}
		else if(crewsize>=10 && crewsize<=50)
		{
			score=score+10;
		}
		else if(crewsize>50)
		{
			score=score+20;
		}
		
		System.out.print("Do you have a parrot or a monkey? (Y/N) ");
		String YN1= kbReader.next( );
		if(YN1.equalsIgnoreCase("Y"))
		{
			score=score+5;
		}
		if(YN1.equalsIgnoreCase("N"))
		{
			score=score+0;
		}
		
		System.out.print("Do you have an eyepatch or a peg leg? (Y/N) ");
		String YN2= kbReader.next( );
		if(YN2.equalsIgnoreCase("Y"))
		{
			score=score+15;
		}
		if(YN2.equalsIgnoreCase("N"))
		{
			score=score+0;
		}
		
		System.out.print("Do you have two or more gold teeth? (Y/N) ");
		String YN3= kbReader.next( );
		if(YN3.equalsIgnoreCase("Y"))
		{
			score=score+10;
		}
		if(YN3.equalsIgnoreCase("N"))
		{
			score=score+0;
		}
		
		System.out.print("How may sea battles have you won? ");
		int battle= kbReader.nextInt( );
		score= score+(battle*5);
		
		if(score>90)
		{
		System.out.println("Your rank is Pirate Captain.");
		System.out.println("Your pirate score is "+score+".");
		}
		if(score>60&&score<=90)
		{
		System.out.println("Your rank is Swashbuckler.");
		System.out.println("Your pirate score is "+score+".");
		}
		if(score>40&&score<=60)
		{
		System.out.println("Your rank is Deck Hand.");
		System.out.println("Your pirate score is "+score+".");
		}
		if(score<=40)
		{
		System.out.println("Your rank is Barnacle.");
		System.out.println("Your pirate score is "+score+".");
		}
	}

}
