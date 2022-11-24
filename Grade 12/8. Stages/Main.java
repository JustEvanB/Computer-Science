/******************************************************************************

STAGES
This program gets the age and tells them whether theyre a toddler, child, preteen, teen, or adult
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
        int Age;
        clr();

        Scanner input = new Scanner (System.in);
        System.out.println("{ STAGES }");
        System.out.print("\nPlease Input Age : ");
        Age = input.nextInt();
        clr();
        
        if (Age <= 0) {
            System.out.println("{ STAGES }");
            System.out.println("\nNot Born Yet");
        }
        
        else if (Age <= 5) {
            System.out.println("{ STAGES }");
            System.out.println("\nToddler");
        }
        
        else if (Age <= 10) {
            System.out.println("{ STAGES }");
            System.out.println("\nChild");
        }
        
        else if (Age <= 12) {
            System.out.println("{ STAGES }");
            System.out.println("\nPreteen");
        }
        
        else if (Age < 18) {
            System.out.println("{ STAGES }");
            System.out.println("\nTeen");
        }
        
        else if (Age >= 18) {
            System.out.println("{ STAGES }");
            System.out.println("\nAdult");
        }
    }
}