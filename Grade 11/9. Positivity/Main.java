/******************************************************************************

Positivity
This program will generate a random number and give a positive snetence
Evan Brundritt
02/25/22

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	 
	 int Random = (int) (Math.random () * (8)+1);   // Set Number as random # between 1 - 8
	 
	 System.out.print("Your positive message is : "); 
	 
	 switch (Random) {
	     case 8:
	         System.out.print("It always seems impossible until it's done!");
	         break;
	     
	     case 7:
	         System.out.print("You always pass failure on the way to success!");
	         break;
	     
	     case 6:
	         System.out.print("Nobody's perfect!");
	         break;
	     
	     case 5:
	         System.out.print("Always try your hardest!");
	         break;
	     
	     case 4:
	         System.out.print("Dont give up!");
	         break;
	     
	     case 3:
	         System.out.print("You are loved!");
	         break;
	     
	     case 2:
	         System.out.print("You are amazing!");
	         break;
	         
	     case 1:
	         System.out.print("Believe in yourself!");
	         break;
	     
	 }
	}
}