//Author: Ethan Hunt
//Period 1
public class SimpleStringOperations 
{

	public static void main(String[] args) 
	{
		int argh = 129;
		String s = "The number of rabbits is";
		String report=  s+ " " + argh+".";
		System.out.println(report);
		String g = "Computer Science is for nerds";
		System.out.println(g.toLowerCase() );
		String m= "\"Look Here!\"";
		int count;
		count= m.length();
		System.out.println(m + " has " + count + " characters.");
		System.out.println("A backslash looks like this \\,  ...right?");
	}

}
