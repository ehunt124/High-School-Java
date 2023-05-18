//Author: Ethan Hunt
//Period 1
import java.io.*;
import java.util.*;
public class GoingInCircles 
{

	public static void main(String[] args) 
	{
		Scanner kbReader = new Scanner(System.in);
		System.out.print("What is the area? ");
		double d = kbReader.nextDouble( );
		System.out.println("Radius of your circle is "+ Math.sqrt(d/Math.PI)+".");
	}

}
