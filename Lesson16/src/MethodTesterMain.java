//Author: Ethan Hunt
//Period 1
public class MethodTesterMain 
{

	public static void main(String[] args) 
	{
		MethodTester test=new MethodTester();
		
		test.multiName(3);

		System.out.println("30 degrees Celsius = " + test.cel2Fahr(30) + " degrees Fahrenheit");
		System.out.println(test.month(3));
		System.out.println(test.month(47));

		if (test.close(5,11))
			System.out.println("Close");
		else
			System.out.println("Not Close");
	}

}
