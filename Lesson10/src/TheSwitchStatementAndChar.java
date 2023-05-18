//Author: Ethan Hunt
//Period 1
import java.util.*;
public class TheSwitchStatementAndChar 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		int speed=kbReader.nextInt();
		switch(speed)
		{
		case 75:
		System.out.println("Exceding speed limit");
		break;
		case 69:
		case 70:
		System.out.println("Getting close");
		break;
		case 65:
		System.out.println("Cruising");	
		break;
		default:
		System.out.println("Very slow");
		
		String s= "X";
		char chr=s.charAt(0);
		}
	}

}
