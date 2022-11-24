/******************************************************************************

Arrays 1
This program gets an array of 5 and then lists it from end to start
Evan Brundritt
11/01/22

*******************************************************************************/
import java.util.Scanner; // Imports
import java.util.concurrent.TimeUnit;

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
        int Loop = 0;
        String[] Array = new String[5];
        int Answer;

        Scanner input = new Scanner(System.in); // Establish Imports

        while(Loop == 0) {
            clr();
            System.out.println("{ ARRAYS I }");
            System.out.println("\n{1}-- List Defaults");
            System.out.println("{2}-- Choose 5 Words");
            System.out.println("{99}-- Exit");
            System.out.print("\ninput~# ");
            Answer = input.nextInt();
            clr();

            if (Answer == 1) {
                Loop = 1;
            }
            if (Answer == 2) {
                Loop = 2;
            }
            if (Answer == 99) {
                Loop = 99;
            }

            while (Loop == 1){
                System.out.println("{ ARRAYS I }");
                Array[0] = "Pineapple";
                Array[1] = "Mango";
                Array[2] = "Strawberries";
                Array[3] = "Blueberries";
                Array[4] = "Bawls";

                for (int i=4; i>=0; i--) {
                    System.out.println("Array " + i + ": " + Array[i]);
                    wait(1);
                }

                System.out.println("\n{99}-- Go Back");
                System.out.print("input~# ");
                Answer = input.nextInt();
                if (Answer == 99) {
                    Loop = 0;
                }
            }

            while (Loop == 2){
                System.out.println("{ ARRAYS I }");
                for (int i=0; i<=4; i++) {
                    System.out.print("Array " + i + ": ");
                    Array[i] = input.next();
                }

                clr();
                System.out.println("{ ARRAYS I }");

                for (int i=4; i>=0; i--) {
                    System.out.println("Array " + i + ": " + Array[i]);
                    wait(1);
                }

                System.out.println("\n{99}-- Go Back");
                System.out.print("input~# ");
                Answer = input.nextInt();
                if (Answer == 99) {
                    Loop = 0;
                }
            }
        }
    }
}