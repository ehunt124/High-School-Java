//Author: Ethan Hunt
//Period 1
public class BankAccount 
{
	public double balance;
	public String name;
	public BankAccount(double r, String s)
	{
		balance=r;
		name=s;
	}
	public double deposit(double a)
	{
		balance= balance+a;
		return balance;
	}
	public double withdraw(double b)
	{
		balance= balance-b;
		return balance;
	}
}
