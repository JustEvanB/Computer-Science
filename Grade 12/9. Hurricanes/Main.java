/******************************************************************************

HURRICANES
This program gets the category of hurricane and shows the speed it could be
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
        int Category;
        int Loop = 0;
        clr();

        Scanner input = new Scanner (System.in);
        
        while (Loop == 0) {
            clr();
            System.out.println("{ HURRICANES }");
            System.out.println("\n{1}-- Category 1");
            System.out.println("{2}-- Category 2");
            System.out.println("{3}-- Category 3");
            System.out.println("{4}-- Category 4");
            System.out.println("{5}-- Category 5");
            System.out.println("\n{99}-- Exit");
            System.out.print("\nInput~# ");
            Category = input.nextInt();
            
            if (Category == 1) {
                Loop = 1;
            }
            if (Category == 2) {
                Loop = 2;
            }
            if (Category == 3) {
                Loop = 3;
            }
            if (Category == 4) {
                Loop = 4;
            }
            if (Category == 5) {
                Loop = 5;
            }
            if (Category == 99) {
                Loop = 99;
                clr();
            }
            
            while (Loop == 1) {
                clr();
                System.out.println("{ HURRICANES }");
                System.out.println("\nThe Speed is 74-95 mph or 64-82 kt or 119-153 km/h");
                System.out.println("\n{99}-- Back");
                System.out.print("\ninput~# ");
                Category = input.nextInt();
                if (Category == 99) {
                    Loop = 0;
                }
            }
            while (Loop == 2) {
                clr();
                System.out.println("{ HURRICANES }");
                System.out.println("\nThe Speed is 96-110 mph or 83-95 kt or 154-177 km/h");
                System.out.println("\n{99}-- Back");
                System.out.print("\ninput~# ");
                Category = input.nextInt();
                if (Category == 99) {
                    Loop = 0;
                }
            }
            while (Loop == 3) {
                clr();
                System.out.println("{ HURRICANES }");
                System.out.println("\nThe Speed is 111-130 mph or 96-113 kt or 178-209 km/h");
                System.out.println("\n{99}-- Back");
                System.out.print("\ninput~# ");
                Category = input.nextInt();
                if (Category == 99) {
                    Loop = 0;
                }
            }
            while (Loop == 4) {
                clr();
                System.out.println("{ HURRICANES }");
                System.out.println("\nThe Speed is 131-155 mph or 114-135 kt or 178-209 km/h");
                System.out.println("\n{99}-- Back");
                System.out.print("\ninput~# ");
                Category = input.nextInt();
                if (Category == 99) {
                    Loop = 0;
                }
            }
            while (Loop == 5) {
                clr();
                System.out.println("{ HURRICANES }");
                System.out.println("\nThe Speed is greater than 115 mph or 135 kt or 249 km/h");
                System.out.println("\n{99}-- Back");
                System.out.print("\ninput~# ");
                Category = input.nextInt();
                if (Category == 99) {
                    Loop = 0;
                }
            }
        }
    }
}