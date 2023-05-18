//Author: Ethan Hunt
//Period 1
public class Automobile 
{
	public double mpg;
	public double gallons;
	public Automobile(int x)
	{
		mpg=x;
	}
	public void fillUp(int y)
	{
		gallons=gallons+y;
	}
	public void takeTrip(double z)
	{
		gallons=gallons-(z/mpg);
	}
	public double reportFuel()
	{
		return gallons;
	}
}
