//Author: Ethan Hunt
//Period 1
public class MethodTester 
{
	double temp;
	String month;
	boolean tf;
	
	public void multiName(int x)
	{
		for(int a=0;a<x;a++)
		{
			System.out.println("Ethan Hunt");
		}
	}
	public double cel2Fahr(double y)
	{
		temp = y * 9 / 5 + 32;
		return temp;
	}
	public String month(int z)
	{
		switch (z)
		{
		case 1:
			month="January";
			break;
		case 2:
			month="February";
			break;
		case 3:
			month="March";
			break;
		case 4:
			month="April";
			break;
		case 5:
			month="May";
			break;
		case 6:
			month="June";
			break;
		case 7:
			month="July";
			break;
		case 8:
			month="August";
			break;
		case 9:
			month="September";
			break;
		case 10:
			month="November";
			break;
		case 11:
			month="December";
			break;
		case 12:
			month="January";
			break;
		default:
			month="Not A Valid Month";
		}
		return month;
	}
	public boolean close(int p,int q)
	{
			tf=(q-q)>5;
			return tf;
	}
	
}
