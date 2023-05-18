//Author: Ethan Hunt
//Period 1
import java.util.*;
public class DistToLine 
{
	public static double A;
	public static double B;
	public static double C;
	
	
	public static double getDist(double a,double b)
	{
		double num=(Math.abs((A*a)+(B*b)+C))/Math.sqrt(Math.pow(A, 2)+Math.pow(B, 2));
		return num;
	}
}
