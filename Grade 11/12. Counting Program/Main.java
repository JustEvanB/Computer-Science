/******************************************************************************

Counting Program
This program lets you input a number and choose what number to go up or down to.
Evan Brundritt
03/03/22

*******************************************************************************/
import java.util.Scanner;  // Import

public class Main
{
	public static void main(String[] args) {
		
		int Choice;  // Establishing Ints
		int Selection;
		int ToNum;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Counting Program!");  // Choose Choice
		System.out.println("\n1 - Count up");
		System.out.println("2 - Count down");
		System.out.print("Your Choice : ");
		Choice = input.nextInt();
		
		if (Choice <= 1){  // Choice 1
		    System.out.print("Please make a selection :");
		    Selection = input.nextInt();
		    System.out.print("To what number : ");
		    ToNum = input.nextInt();
		    
		    while (Selection <= ToNum){  // Choice 1 While statement
		        System.out.println(Selection);
		        Selection = Selection + 1;
		    }
		}
		else if (Choice >= 2){  // Choice 2
		    System.out.print("Please make a selection : ");
		    Selection = input.nextInt();
		    System.out.print("To what number : ");
		    ToNum = input.nextInt();
		    
		    while (Selection >= ToNum){  // Choice 2 While Statement
		        System.out.println(Selection);
		        Selection = Selection - 1;
		    }
		}
		
	}
}
