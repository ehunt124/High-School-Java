//Author: Ethan Hunt
//Period 1
import java.util.*;
public class BankAccountRunner 
{

	public static void main(String[] args) 
	{
		Scanner kbReader= new Scanner(System.in);
		System.out.println("Please enter your name");
		String h= kbReader.nextLine();
		System.out.println("Please enter the amount in your account");
		double g= kbReader.nextDouble();
		BankAccount myAccount= new BankAccount(g,h);
		double a= myAccount.deposit(505.22);
		System.out.println(myAccount.balance);
		double b= myAccount.withdraw(100);
		System.out.println("The "+myAccount.name+" account balance is, "+myAccount.balance);
	}

}
