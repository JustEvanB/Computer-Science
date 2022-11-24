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
        double Radius;
        double Circumference;
        double Area ;
        final double PI = 3.141592653;
        final int CIRCUMFERENCEMULT = 2;
        clr();

        Scanner input = new Scanner (System.in);
        System.out.println("{ CONSTANTS }");
        System.out.print("\nPlease Input Radius : ");
        Radius = input.nextDouble();
        
        clr();
        
        System.out.println("{ CONSTANTS }");
        Circumference = Radius * CIRCUMFERENCEMULT;
        System.out.println("\nThe Circumference Is : " + Circumference);
        Area = Radius * Radius * PI;
        System.out.println("The Area Is : " + Area);
    }
}