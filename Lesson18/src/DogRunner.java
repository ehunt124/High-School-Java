//Author: Ethan Hunt
//Period 1
import java.util.*;
public class DogRunner 
{

	public static void main(String[] args) 
	{
		Dog myDog=new Dog();
		Scanner kbReader= new Scanner(System.in);
		System.out.println("What is the name of the dog?");
		String x=kbReader.nextLine();
		myDog.setName(x);
		System.out.println("What is the age of the dog?");
		int y=kbReader.nextInt();
		myDog.setAge(y);
		System.out.println("What is the weight of the dog? (in pounds)");
		double z=kbReader.nextDouble();
		myDog.setWeight(z);
		System.out.println("The dog's name is "+myDog.getName()+", his age is "+myDog.getAge()+" and his weight is "+myDog.getWeight()+" pounds.");
	}

}
