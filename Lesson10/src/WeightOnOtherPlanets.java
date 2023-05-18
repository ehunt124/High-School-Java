//Author: Ethan Hunt
//Period 1
import java.util.*;
public class WeightOnOtherPlanets 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.print("What is your weight on Earth? (#) ");
		double weight=kbReader.nextDouble();
		System.out.println();
		System.out.println("1. Voltar");
		System.out.println("2. Krypton");
		System.out.println("3. Fertos");
		System.out.println("4. Servontos");
		System.out.println();
		System.out.print("   Selection? (1-4) ");
		int selection=kbReader.nextInt();
		System.out.println();
		switch(selection)
		{
		case 1:
			weight=weight*0.091;
			System.out.println("Your weight on Voltar would be "+weight+".");
			break;
		case 2:
			weight=weight*0.72;
			System.out.println("Your weight on Krypton would be "+weight+".");
			break;
		case 3:
			weight=weight*0.865;
			System.out.println("Your weight on Fertos would be "+weight+".");
			break;
		case 4:
			weight=weight*4.612;
			System.out.println("Your weight on Servontos would be "+weight+".");
			break;
		default:
			System.out.println("Please enter a number 1-4.");
		}
	}

}
