//Author: Ethan Hunt
//Period 1
import java.util.*;
import java.io.*;
public class FileNerd 
{

	public static void main(String[] args) throws IOException
	{
		Scanner sf=new Scanner(new File("E:\\EthanH\\workspace\\Lesson24\\bin\\NerdData.txt"));
		
		int maxIndx=-1;
		String text[]=new String[1000];
		String s[]=new String[1000];
		
		while(sf.hasNext())
		{
			maxIndx++;
			text[maxIndx]=sf.nextLine();
		}
		sf.close();
		
		for(int j=0;j<=maxIndx;j++)
		{
			s=text[j].split("\\s");
			if(s[0].equals("The"))
				System.out.println(text[j]);
		}
	}

}
