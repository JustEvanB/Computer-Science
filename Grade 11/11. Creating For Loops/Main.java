/******************************************************************************

Creating For Loops!
This is a program that can count and uses Loops
Evan Brundritt
03/03/22

*******************************************************************************/
import java.util.Scanner; // Import

public class Main
{
	public static void main(String[] args) {
	    String Answer;
	    
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Choose the one you would like to see :");  // Choices
		System.out.println("A - Count from 0 to 10 by 1");
		System.out.println("B - Count from 100 to 0 by 10");
		System.out.println("C - Count from 50 to 500 by 50");
		System.out.println("D - Count from 6000 to 1000 by 1000");
		System.out.print("Your Choice : ");
		Answer = input.next();
		
		if (Answer.equals("A") || Answer.equals("a"))  // Choice A
		{
		    for (int Num = 0; Num <11; Num = Num + 1)
		    System.out.println("Number : " + Num);
		}
		else if (Answer.equals("B") || Answer.equals("b"))  // Choice B
		{
		    for (int Num = 100; Num >= 0; Num = Num - 10)
		    System.out.println("Number : " + Num);
		}
		else if (Answer.equals("C") || Answer.equals("c"))  // Choice C
		{
		    for (int Num = 50; Num <= 500; Num = Num + 50)
		    System.out.println("Number : " + Num);
		}
		else if (Answer.equals("D") || Answer.equals("d"))  // Choice D
		{
		    for (int Num = 6000; Num >= 1000; Num = Num - 1000)
		    System.out.println("Number : " + Num);
		}
	}
}
