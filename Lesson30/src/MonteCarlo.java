//Author: Ethan Hunt
//Period 1
import java.util.*;
public class MonteCarlo 
{
	public double h,k,r;
	Random rndm= new Random();
	public MonteCarlo(double a,double b,double c)
	{
		h=a;
		k=b;
		r=c;
	}
	public double nextRainDrop_x()
	{
		double l=((h+r)-(2*r))+((h+r)-((h+r)-(2*r)))*rndm.nextDouble();
		return l;
	}
	public double nextRainDrop_y()
	{
		double l= ((k+r)-(2*r))+((k+r)-((k+r)-(2*r)))*rndm.nextDouble();
		return l;
	}
	public boolean insideCircle(double x,double y)
	{
		if(((Math.pow((x-h),2))+(Math.pow((y-k),2)))<=Math.pow(r,2))
			return true;
		else
			return false;
	}
}
