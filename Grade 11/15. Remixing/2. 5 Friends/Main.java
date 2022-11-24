/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner keyedInput = new Scanner (System.in);
        
        String [ ] friends = new String [5]; // establish 5 integers
        
        System.out.println("Enter the names of five friends:");
        for (int i = 0; i <= 4; i = i + 1) // input 5 friends
        {
            friends[i] = keyedInput.nextLine();
        }
        
        System.out.println("The fourth and seventh names listed were:"); // list friends
        System.out.println("Second: " + friends[2]);
        System.out.println("Third: " + friends[3]);
        System.out.println("Fourth: " + friends[4]);
	}
}
