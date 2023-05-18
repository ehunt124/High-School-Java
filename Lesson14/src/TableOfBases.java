//Author: Ethan Hunt
//Period 1
public class TableOfBases 
{

	public static void main(String[] args) 
	{
		System.out.println("Decimal   Bianary    Octal   Hex   Character");
		for(int a=65;a<=90;a++)
		{
			System.out.println(a+"        "+Integer.toBinaryString(a)+"    "+Integer.toOctalString(a)+"     "+Integer.toHexString(a)+"    "+(char)a);
		}
	}

}
