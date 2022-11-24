/******************************************************************************

CONSTANTS
This program gets Circumference and Area with 2 constants
Evan Brundritt
09/29/22

*******************************************************************************/
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Formatter;

public class Main 
{
    public static void clr() { // set method for clearing screen
        System.out.print("\033[H\033[2J");
    }
    
    public static void wait(int n1) { // set method for waiting
        try {
            TimeUnit.SECONDS.sleep(n1);
        } catch (Exception e) {
            System.out.println("You must've broken something to get here");
        }
    }
    public static void main(String[] args) {
        int I;
        double Sum = 0;
        clr();

        Scanner input = new Scanner (System.in);
        System.out.println("{ CONSTANTS }");
        System.out.print("\nPlease Input How Many Nums To Add : ");
        I = input.nextInt();
        
        clr();
        
        double [ ] marks = new double [10]; // establish doubles
        
		for (int i = 0; i < I; i++)
		{
		    System.out.println("{ CONSTANTS }");
		    System.out.println("\nEnter Your Number To Add : ");
		    marks[i] = input.nextDouble(); 
		    clr();
		}
		for (int i=0; i<I;i++)
		{
		    Sum = Sum + marks[i];
		}
		Sum = Sum/I;
		
		System.out.println("{ CONSTANTS }");
		System.out.println("\nYour sum is : " + Sum);
    }
}