/******************************************************************************

Odd Sum
This program gets a number and then shows each odd number up to that
Evan Brundritt
10/03/22

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
        int OddNum;
        int Sum = 0;
        clr();

        Scanner input = new Scanner (System.in);
        System.out.println("{ ODD SUM }");
        System.out.print("\nPlease Input How Many Nums To Add : ");
        OddNum = input.nextInt();
        
        clr();
        
        for (int i=1; i<=OddNum; i++) {
            if (i%2!=0) {
                Sum = Sum + i;
            }
        }
        clr();
        System.out.println("{ ODD SUM }");
        System.out.println("\nThe Total Of Only Odd Is : " + Sum);
    }
}