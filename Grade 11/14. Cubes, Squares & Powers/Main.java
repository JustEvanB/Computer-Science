/******************************************************************************

Cubes, Squares, And Powers
This app will let you input whether you would like to square, cube, or power any number
Evan Brundritt
03/28/22

*******************************************************************************/
import java.util.Scanner; // Imports

public class Main
{
	public static void main(String[] args) {
		int Answer; // Establish Ints
		int Num;
		int Power;
		int loop = 0;
		
		Scanner input = new Scanner(System.in); // Establish Imports
		
		while (loop == 0) {
		    System.out.print("\033[H\033[2J"); // Main Menu
		    System.out.println(" { Cubes, Squares, And Powers }");
		    System.out.println("\n{1}-- Find a value of a number squared Ex:2^2");
		    System.out.println("{2}-- Find the value of a number cubed Ex:2^3");
		    System.out.println("{3}-- Find a value of a number to any power");
		    System.out.println("{4}-- Exit App");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    if (Answer == 1) {  // Go To Loops
		        loop = 1;
		    }
		    if (Answer == 2) {
		        loop = 2;
		    }
		    if (Answer == 3) {
		        loop = 3;
		    }
		    if (Answer == 4) {
		        loop = 4;
		    }
		while (loop == 1) {
		    System.out.print("\033[H\033[2J"); // Enter Number
		    System.out.println(" { SQUARED }");
		    System.out.println("\nEnter number to square :");
		    System.out.print("\ninput~# ");
		    Num = input.nextInt();
		    
		    Num = Num*Num; // Square
		    
		    System.out.print("\033[H\033[2J"); // Give Answer
		    System.out.println(" { SQUARED }");
		    System.out.println("\nYour number squared is : " +Num);
		    System.out.println("{4}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    if (Answer == 4) { // Go Back
		        loop = 0;
		    }
		} // end loop 1
		
		while (loop == 2) {
		    System.out.print("\033[H\033[2J"); // Enter Number
		    System.out.println(" { CUBED }");
		    System.out.println("\nEnter number to cube :");
		    System.out.print("\ninput~# ");
		    Num = input.nextInt();
		    
		    Num = Num*Num*Num; // Cube
		    
		    System.out.print("\033[H\033[2J"); // Give Answer
		    System.out.println(" { CUBED }");
		    System.out.println("\nYour number squared is : " +Num);
		    System.out.println("{4}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    
		    if (Answer == 4) { // Go Back
		        loop = 0;
		    }
		} // end loop 2
		
		while (loop == 3) {
		    System.out.print("\033[H\033[2J"); // Enter Number
		    System.out.println(" { POWER OF }");
		    System.out.println("\nEnter number to square :");
		    System.out.print("\ninput~# ");
		    Num = input.nextInt();
		    
		    System.out.print("\033[H\033[2J"); // Enter Power Of
		    System.out.println(" { POWER OF }");
		    System.out.println("\nEnter power :");
		    System.out.print("\ninput~# ");
		    Power = input.nextInt();
		    
		    long result = 1; // Multiply Num with Power
		    while (Power != 0) {
		         result *= Num;
		         --Power;
		    }
		    System.out.print("\033[H\033[2J"); // Give Answer For Power Of
		    System.out.println(" { POWER OF }");
		    System.out.println("\nYour Answer is : " + result);
		    System.out.println("{4}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    if (Answer == 4) { // go back
		        loop = 0;
		    }
		} // end loop 3
		
		while (loop == 4) {
		    System.out.print("\033[H\033[2J"); // Exit Message
		    System.out.println(" { EXIT }");
		    System.out.println("\nThank you for using my program :)");
		    System.exit(0);
		} // end loop 4
		} // end loop 0
	}
}
