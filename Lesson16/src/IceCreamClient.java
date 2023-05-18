//Author: Ethan Hunt
//Period 1
public class IceCreamClient 
{

	public static void main(String[] args) 
	{
		IceCream yum1 = new IceCream();
        System.out.println(yum1);
        yum1.setToppings(3);
        yum1.addTopping();
        System.out.println(yum1);
        IceCream yum2 = new IceCream("Large", 5);
        System.out.println(yum2);
        System.out.println("yum2 has " + yum2.getToppings() + " toppings");
	}

}
