/*   EXPRESSIONS
 *   finds total of 3 and mean of them all with 1 Variable  
 *   09/21/22
 *   Evan Brundritt
 */

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
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
        clr();
		Scanner input = new Scanner (System.in);
        int num;
        
        System.out.println("{ EXPRESSIONS }");
        System.out.print("\nEnter Your First Number : ");
        num = input.nextInt();
        
        clr();
        System.out.println("{ EXPRESSIONS }");
        System.out.print("\nEnter Your Second Number : ");
        num += input.nextInt();
        
        clr();
        System.out.println("{ EXPRESSIONS }");
        System.out.print("\nEnter Your Third Number : ");
        num += input.nextInt();
        
        clr();
        System.out.println("{ EXPRESSIONS }");
        System.out.println("\nYour Total Is : " + num);
        num = num/3;
        System.out.println("The Average Is : " + num);
    }

}