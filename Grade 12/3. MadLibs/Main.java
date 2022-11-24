/*
Mad Libs
This program gets a bunch of adjectives and nouns and makes a poem
Evan Brundritt
09/08/22
*/

import java.util.Scanner;         // Imports 
import java.text.NumberFormat;
import java.util.concurrent.TimeUnit;

public class Main
{
    public static void clr() {
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
		
		Scanner input = new Scanner(System.in);
		
        clr();
		System.out.println("{ MadLibs }");
        System.out.print("\nPlease Enter A Person : ");
        String Person = input.nextLine();
        wait(1);
        clr();

        System.out.println("{ MadLibs }");
        System.out.print("\nPlease Enter A Food : ");
        String Food = input.nextLine();
        wait(1);
        clr();

        System.out.println("{ MadLibs }");
        System.out.print("\nPlease Enter A Letter : ");
        String Letter = input.nextLine();
        wait(1);
        clr();

        System.out.println("{ MadLibs }");
        System.out.print("\nPlease Enter A Friends Name : ");
        String Friend = input.nextLine();
        wait(1);
        clr();

        System.out.println("{ MadLibs }");
        System.out.println("Your Poem Is : \n");
        wait(1);
        System.out.println("Pat-a-cake, pat-a-cake, baker's " + Person);
        wait(1);
        System.out.println("Bake me a " + Food + " just as fast as you can");
        wait(1);
        System.out.println("Pat it and roll it and mark it with a " + Letter);
        wait(1);
        System.out.println("Put it in the oven for " + Friend + " and me!");
        wait(1);
    }
}