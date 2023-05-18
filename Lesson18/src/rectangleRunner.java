//Author: Ethan Hunt
//Period 1
public class rectangleRunner 
{

	public static void main(String[] args) 
	{
		Rectangle myRectangle= new Rectangle(13,14);
		System.out.println("The width is "+myRectangle.getWidth());
		System.out.println("The length is "+myRectangle.getLength());
		System.out.println("The area is "+myRectangle.area());
		System.out.println("The diagnol is "+myRectangle.diagnol());
		System.out.println("The perimiter is "+myRectangle.perimeter());
		myRectangle.print();
		System.out.println("Rotation (swap length & width)");
		myRectangle.rotate();
		myRectangle.print();
	}

}
