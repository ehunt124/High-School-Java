//Author: Ethan Hunt
//Period 1
import java.util.*;
public class TheWhileAndDoWhileLoops 
{

	public static void main(String[] args) 
	{
		int i = 1, y = 1, x = 1;
        while (y <= 34)
        {
            System.out.print(y + ", ");

            int sum = y + x;
            y = x;
            x = sum;

            i++;
        }
	}

}
