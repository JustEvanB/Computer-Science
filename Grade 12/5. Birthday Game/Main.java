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
        double BirthdayGuess;
        double BirthdayAnswer;
        double BirthdayGuess2;

        clr();

        Scanner input = new Scanner (System.in);
        System.out.println("{ THE BIRTHDAY CALCULATOR }");
        System.out.println("{Step 1 - Calculate Your Birth Month}");
        System.out.println("{EX: January is 1, February is 2, etc}");

        wait(5);
        clr();

        System.out.println("{ THE BIRTHDAY CALCULATOR }");
        System.out.println("{Step 2 - Calculate The following;}");
        System.out.println("{Multiply month by 5, add 6, multiply by 4}");
        System.out.println("{Add 9, and then multiply by 5, finally add your birthday to the number}");

        System.out.print("\nEnter Your Calculation : ");
        BirthdayAnswer = input.nextDouble();

        clr();

        BirthdayGuess = BirthdayAnswer - 165;
        BirthdayGuess = BirthdayGuess / 100;

        String Birthday = String.valueOf(BirthdayGuess);

        char M1 = Birthday.charAt(0);
        char M2 = Birthday.charAt(1);
        char M3 = Birthday.charAt(2);
        char M4 = Birthday.charAt(3);

        System.out.println("{ THE BIRTHDAY CALCULATOR }");
        System.out.println("\nYour Birthday Is : " + M3 + M4 + "/" + M1 + M2);
        wait(5);
    }
}
