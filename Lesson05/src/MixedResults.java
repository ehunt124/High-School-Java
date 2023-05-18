//Author: Ethan Hunt
//Period 1
public class MixedResults 
{

	public static void main(String[] args) 
	{
		double d1 = 37.9;
		double d2 = 1004.128;
		int i1 = 12;
		int i2 = 18;
		
		double a= (57.2*(i1/i2)+1);
		double b= (57.2*((double)i1 / i2)+1);
		double c= (15-i1*(d1*3)+4);
		int d= (15-i1*(int)(d1*3)+4);
		int e= (15-i1*((int)d1*3)+4);
		
		System.out.println("Problem 1: " + a);
		System.out.println("Problem 2: " + b);
		System.out.println("Problem 3: " + c);
		System.out.println("Problem 4: " + d);
		System.out.println("Problem 5: " + e);
	}

}
