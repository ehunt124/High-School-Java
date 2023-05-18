import java.util.Scanner;

//Author: Ethan Hunt
//Period 1
public class DistToLineRunner 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.println("Enter an A value for the line: ");
		double A1 =kbReader.nextDouble();
		DistToLine.A=A1;
		System.out.println("Enter a B value for the line: ");
		double B1 =kbReader.nextDouble();
		DistToLine.B=B1;
		System.out.println("Enter a C value for the line: ");
		double C1 =kbReader.nextDouble();
		DistToLine.C=C1;
		System.out.println("Enter an x coordinate of the point: ");
		double x =kbReader.nextDouble();
		System.out.println("Enter an y coordinate of the point: ");
		double y =kbReader.nextDouble();
		System.out.println("Distance from the point to the line is: "+DistToLine.getDist(x, y));
	}

}
