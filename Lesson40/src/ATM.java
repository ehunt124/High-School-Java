//Author: Ethan Hunt
//Period 1
import java.io.*;
import java.util.*;
public class ATM 
{
	int acnum,pin;
	double ch,sav;
	String lstnm;
	char i;
	public ATM(int a,int b,String c,char d,double e,double f)
	{
		acnum=a;
		pin=b;
		lstnm=c;
		i=d;
		ch=e;
		sav=f;
	}
	public void withdrawl(char c,double z)
	{
		if(z>600)
			System.out.println("Ammount invalid. Please withdraw an amount less than $600.");
		if(z<0)
			System.out.println("Ammount invalid. Please withdraw an amount greater than $0.");
		if(c=='C')
		{
			if(z>ch)
				System.out.println("Ammount invalid. Please withdraw an amount less than your balance ($"+ch+").");
			else
			{
				ch=ch-z;
				System.out.println("Withrawl successful.");
			}
		}
		if(c=='S')
		{
			if(z>sav)
				System.out.println("Ammount invalid. Please withdraw an amount less than your balance ($"+sav+").");
			else
			{
				sav=sav-z;
				System.out.println("Withdrawl successful.");
			}
		}
		
	}
	public void deposit(char c,double z)
	{
		if(z<0)
			System.out.println("Ammount invalid. Please deposit an amount greater than $0.");
		if(c=='C')
		{
			ch=ch+z;
			System.out.println("Deposit successful.");
		}
		if(c=='S')
		{
			sav=sav+z;
			System.out.println("Deposit successful.");
		}
	}
	public void transfer(int a,double b)
	{
		switch(a)
		{
			case 1:
				if(b>sav)
					System.out.println("Amount invalid. Please transfer an amount less than your balance ($"+sav+").");
				else
				{
					sav=sav-b;
					ch=ch+b;
					System.out.println("Transfer successful.");
				}
				break;
			case 2:
				if(b>ch)
					System.out.println("Amount invalid. Please transfer an amount less than your balance ($"+ch+").");
				else
				{
					ch=ch-b;
					sav=sav+b;
					System.out.println("Transfer successful.");
				}
				break;
			default:
				System.out.println("Please enter a valid choice.");
		}
	}
	public void checkBalance()
	{
		System.out.println("Checking Balance: $"+ch);
		System.out.println("Savings Balance: $"+sav);
	}
}
