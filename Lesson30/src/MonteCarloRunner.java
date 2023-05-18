//Author: Ethan Hunt
//Period 1
import java.util.*;
public class MonteCarloRunner 
{

	public static void main(String[] args) 
	{
		int cirCount=0,sqrCount=0;
		MonteCarlo mcObj=new MonteCarlo(5,3,2);
		for(int i=0;i<10000000;i++)
		{
			if(mcObj.insideCircle(mcObj.nextRainDrop_x(),mcObj.nextRainDrop_y()))
				cirCount++;
			sqrCount++;
		}
		System.out.println((cirCount*(Math.pow((2*mcObj.r),2)))/(sqrCount*(Math.pow(mcObj.r,2))));
	}

}
