import java.util.Scanner;

//Author: Ethan Hunt
//Period 1
public class EquationofaLineRunner 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.println("Please enter the slope value. Please enter whole number or decimal form: ");
		double M=kbReader.nextDouble();
		EquationofaLine.M=M;
		System.out.println("Please enter the x value: ");
		double x=kbReader.nextDouble();
		System.out.println("Please enter the y value: ");
		double y=kbReader.nextDouble();
		System.out.println("The linear equation is: y = "+EquationofaLine.M+"x + "+ EquationofaLine.getYIntercept(x,y));
	}

}
