/******************************************************************************

Math Methods
This method shows 5 options that leads to different methods
04/19/22
Evan Brundritt

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner (System.in);
	    
		int Loop = 0;
		int [ ] Value = new int [4];
		int Answer;
		
		while (Loop == 0) {
		    System.out.print("\033[H\033[2J");
		    System.out.println("{ Math Methods }");
		    System.out.println("\n{1}-- Largest Of 2");
		    System.out.println("{2}-- Smallest Of 2");
		    System.out.println("{3}-- X To The Power Of Y");
		    System.out.println("{4}-- Determine Hypoteneuse");
		    System.out.println("{5}-- Finding Square Root");
		    System.out.println("{6}-- Degrees ---> Radians");
		    System.out.println("\n{99}-- Exit Program");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    if (Answer == 1) {
		        Loop = 1;
		    }
		    if (Answer == 2) {
		        Loop = 2;
		    }
		    if (Answer == 3) {
		        Loop = 3;
		    }
		    if (Answer == 4) {
		        Loop = 4;
		    }
		    if (Answer == 5) {
		        Loop = 5;
		    }
		    if (Answer == 6) {
		        Loop = 6;
		    }
		    if (Answer == 99) {
		        Loop = 7;
		    }
		    
		    while (Loop == 1) {
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Largest Of The 2 }");
		        System.out.print("\nEnter A Value : ");
		        Value[1] = input.nextInt();
		        
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Largest Of The 2 }");
		        System.out.print("\nEnter A Value : ");
		        Value[2] = input.nextInt();
		        
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Largest Of The 2 }");
		        System.out.println("\nYour largest number was : " + Math.max(Value[1], Value[2]));
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 1
		    
		    while (Loop == 2) {
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Smallest Of The 2 }");
		        System.out.print("\nEnter A Value : ");
		        Value[1] = input.nextInt();
		        
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Smallest Of The 2 }");
		        System.out.print("\nEnter A Value : ");
		        Value[2] = input.nextInt();
		        
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Smallest Of The 2 }");
		        System.out.println("\nYour smallest number was : " + Math.min(Value[1], Value[2]));
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 2
		    
		    while (Loop == 3) {
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ X To The Power Of Y }");
		        System.out.print("\nEnter A Base : ");
		        Value[1] = input.nextInt();
		        
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ X To The Power Of Y }");
		        System.out.print("\nEnter An Exponent : ");
		        Value[2] = input.nextInt();
		        
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ X To The Power Of Y }");
		        System.out.println("\nYour smallest number was : " + Math.pow(Value[1], Value[2]));
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 3
		    
		    while (Loop == 4) {
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Determine Hypoteneuse }");
		        System.out.print("\nEnter Side 1 Of Triangle (cm) : ");
		        Value[1] = input.nextInt();
		        
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Determine Hypoteneuse }");
		        System.out.print("\nEnter Side 2 Of Triangle (cm) : ");
		        Value[2] = input.nextInt();
		        
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Determine Hypoteneuse }");
		        System.out.println("\nThe hypoteneuse is : " + Math.hypot(Value[1], Value[2]) + " centimeters");
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 4
		    
		    while (Loop == 5) {
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Finding Square Root }");
		        System.out.print("\nEnter the number to square root : ");
		        Value[1] = input.nextInt();
		        
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Finding Square Root }");
		        System.out.println("\nThe square root is : " + Math.sqrt(Value[1]));
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 5
		    
		    while (Loop == 6) {
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Degrees ---> Radians }");
		        System.out.print("\nEnter the number to convert : ");
		        Value[1] = input.nextInt();
		        
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Finding Square Root }");
		        System.out.println("\nThe amount of radians is : " + Math.toRadians(Value[1]));
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 6
		    
		    if (Loop == 7) {
		        System.out.print("\033[H\033[2J");
		        System.out.println("{ Good Bye! }");
		        System.out.println("\nThank you for using my program!");
		        System.out.println("Made by : Evan B"); // also in 10 mins lol
		    }
		}
		    
	}
}
