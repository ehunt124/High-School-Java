//Author: Ethan Hunt
//Period 1
import java.util.*;
public class EmailProgram 
{

	public static void main(String[] args) 
	{
		int end=0;
		int at=0;
		int g=0;
		int y=0;
		Scanner kbReader= new Scanner(System.in);
		
		System.out.print("Enter email adress: ");
		String email= kbReader.nextLine();
		
		for(int a=0;a<email.length();a++)
		{
			int x=(int)(email.charAt(a));
			if(x<=44)
				end++;
			if(x>=47&&x<64)
				end++;
			if(x>=91&&x<=94)
				end++;
			if(x==96)
				end++;
			if(x>=123)
				end++;
			
			if(x==64)
			{
				at++;
				g=a+1;
			}
			if(at>1)
				end++;
		}
		
		for(int o=g;o<email.length();o++)
		{
			int n=(int)(email.charAt(o));
			if(n==46)
				y++;
		}
		if(y<1)
			end++;
		
		int l=(int)(email.charAt(0));
		if(l<=64)
			end++;
		if(l>=91&&l<=96)
			end++;
		if(l>=123)
			end++;
		
		String e=email.substring(email.length()-3);
		int u=0;
		if(e.equals("com"))
			u++;
		if(e.equals("org"))
			u++;
		if(e.equals("net"))
			u++;
		if(e.equals("gov"))
			u++;
		if(e.equals("biz"))
			u++;
		if(u!=1)
			end++;
		
		if(end==0)
			System.out.println("This is a valid email adress.");
		if(end>0)
			System.out.println("This is not a valid email adress.");
	}

}
