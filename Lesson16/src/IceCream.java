//Author: Ethan Hunt
//Period 1
public class IceCream 
{
	int toppings=0;
	String size="";
	
	public IceCream() 
	{
		toppings=0;
		size="Small";
	}
	public IceCream(String s, int t) 
	{
		toppings=t;
		size=s;
	}
	
	public void addTopping()
	{
		toppings= toppings+1;
	}
	public int getToppings()
	{
		return toppings;
	}
	public void	setToppings(int x)
	{
		toppings=x;
	}
	public double cost()
	{
		double y=0;
		if (size.equals("Small"))
		{
			y=y+(.5*toppings)+1.5;
		}
		else if (size.equals("Medium"))
		{
			y=y+(.5*toppings)+2.5;
		}
		else if (size.equals("Large"))
		{
			y=y+(.5*toppings)+4;
		}
		return y;
	}
	public String toString()
	{
		String e="The "+size+" ice cream has "+toppings+" toppings and costs $"+cost()+".";
		return e;
	}
}
