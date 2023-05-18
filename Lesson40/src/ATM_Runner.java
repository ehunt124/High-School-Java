import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Author: Ethan Hunt
//Period 1
public class ATM_Runner 
{

	public static void main(String[] args) throws IOException
	{
		Scanner sf=new Scanner(new File("D:\\EthanH\\workspace\\Lesson40\\bin\\ATMtxt.txt"));
		Scanner kbReader=new Scanner(System.in);
		String text[]=new String[1000];
		int maxIndx=-1;
		int a,b,o;
		double e,f,g;
		String c;
		char d,z;
		String s[]=new String[6];
		String h;
		
		while(sf.hasNext())
		{
			maxIndx++;
			text[maxIndx]=sf.nextLine();
		}
		sf.close();
		ATM[] arr=new ATM[maxIndx];
		for(int j=0;j<maxIndx;j++)
		{
			s=text[j].split("\\s");
			a=Integer.parseInt(s[0]);
			b=Integer.parseInt(s[1]);
			c=s[2];
			d=s[3].charAt(0);
			e=Double.parseDouble(s[4]);
			f=Double.parseDouble(s[5]);
			arr[j]=new ATM(a,b,c,d,e,f);
		}
		System.out.println("Welcome to Currier Bank and Trust.");
		boolean pass=true;
		int select=-1;
		int aa=0;
		while(pass)
		{
			System.out.print("Enter Account#: ");
			int anum=kbReader.nextInt();
			System.out.print("Enter PIN: ");
			int pnum=kbReader.nextInt();
			for(int j=0;j<maxIndx;j++)
			{
				if(arr[j].acnum==anum)
				{
					if(arr[j].pin==pnum)
					{
						pass=false;
						select=j;
						aa++;
					}
				}
			}
			if(aa==0)
				System.out.println("* Invalid PIN – please re-enter *");
		}
		
		System.out.println("Welcome "+arr[select].i+" "+arr[select].lstnm);
		System.out.println("1) Withdraw");
		System.out.println("2) Deposit");
		System.out.println("3) Transfer");
		System.out.println("4) Check Balance(s)");
		System.out.println("5) Quit");
		
		pass=true;
		while(pass)
		{
			System.out.println();
			System.out.print("Please select transaction: ");
			int choice=kbReader.nextInt();
			switch(choice)
			{
				case 1:
						System.out.print("Which account would you like to withdraw from (C/S)? ");
						h=kbReader.nextLine();
						h=kbReader.nextLine();
						z=h.charAt(0);
						System.out.print("Withdraw ammount? ");
						g=kbReader.nextDouble();
						arr[select].withdrawl(z,g);
					break;
				case 2:
					System.out.print("Which account would you like to deposit into (C/S)? ");
					h=kbReader.nextLine();
					h=kbReader.nextLine();
					z=h.charAt(0);
					System.out.print("Deposit ammount? ");
					g=kbReader.nextDouble();
					arr[select].deposit(z,g);
					break;
				case 3:
					System.out.println("Do you want to transfer from: ");
					System.out.println("1: Savings to Checking");
					System.out.println("2: Checking to Savings");
					o=kbReader.nextInt();
					System.out.print("How much do you want to transfer? ");
					g=kbReader.nextDouble();
					arr[select].transfer(o,g);
					break;
				case 4:
					arr[select].checkBalance();
					break;
				case 5:
					System.out.println("Thank you for using Currier Bank and Trust.");
					System.out.println("Have a great day.");
					pass=false;
					break;
				default:
					System.out.println("Please choose a valid transaction.");
					break;
			}
		}
	}

}
