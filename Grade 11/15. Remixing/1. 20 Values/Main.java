/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner; // import scanner

public class Main
{
	public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        int [ ] numbers = new int [20]; // establish ints
        int total = 0;
        
        System.out.println("Enter twenty integers and they will be added together:");
        for (int i = 0; i <= 19; i = i + 1) // loop for 20 ints
        {
           numbers[i] = keyedInput.nextInt();
        }
        

        for (int i = 0; i <= 19; i = i + 1) // combine the numbers
        {
             total = total + numbers[i];
        }
        
        System.out.print("The sum of those numbers is: "); // give sum
        System.out.println(total);
	}
}
