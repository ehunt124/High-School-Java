//Author: Ethan Hunt
//Period 1
import java.util.*;
public class ArrayOfHope 
{

	public static void main(String[] args) 
	{
		char ch[]= new char[26];
		int y=65;
		for(int x=0;x<26;x++)
		{
			ch[x]=(char)y;
			y++;
		}
		for(int j=0;j<26;j++)
		{
			System.out.print(ch[j]+", ");
		}
	}

}
