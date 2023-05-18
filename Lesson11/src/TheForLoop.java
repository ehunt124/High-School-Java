//Author: Ethan Hunt
//Period 1
public class TheForLoop 
{

	public static void main(String[] args) 
	{
		int j,k;
		int count=0;
		for(j=0;j<4;j++)
		{
			System.out.println("A");
			for(k=0;k<10;k++)
			{
				System.out.println("B");
				count++;
			}
		}
		System.out.print(count--);
		System.out.println("C");
		System.out.println(count);
	}

}
