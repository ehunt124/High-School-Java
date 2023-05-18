//Author: Ethan Hunt
//Period 1
public class Rectangle
{
	double length;
	double width;
	double area;
	double diagnol;
	double perimeter;
	
	public Rectangle()
	{
		length=0;
		width=0;
		area=0;
		diagnol=0;
		perimeter=0;
	}
	public Rectangle(double a,double b)
	{
		length=a;
		width=b;
	}
	
	public double getWidth()
	{
		return width;
	}
	public double getLength()
	{
		return length;
	}
	public void setWidth(double wide)
	{
		width=wide;
	}
	public void setLength(double len)
	{
		length=len;
	}
	public double area()
	{
		area=length*width;
		return area;
	}
	public void rotate()
	{
		double swap = length;
	    length = width;
	    width = swap;
	}
	public double diagnol()
	{
		diagnol=Math.sqrt(Math.pow(length, 2)+Math.pow(width, 2));
		return diagnol;
	}
	public void print()
	{
		System.out.println("Length = "+Math.round(length*100)/100.0+" and Width = "+Math.round(width*100)/100);
	}
	public double perimeter()
	{
		perimeter=(2*length)+(2*width);
		return perimeter;
	}
}
