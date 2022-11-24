/******************************************************************************

Arrays 2
This program stores and displays a list of integers which can be added or removed
Evan Brundritt
11/01/22

*******************************************************************************/
import java.util.Scanner; // Imports
import java.util.concurrent.TimeUnit;
import java.awt.List;
import java.util.Arrays;

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
        int[] Array = new int[8];
        int Answer;

        Scanner input = new Scanner(System.in); // Establish Imports

        while(Loop == 0) {
            clr();
            System.out.println("{ ARRAYS II }\n");

            for (int i = 0; i < Array.length; i++) {
                for (int j = i + 1; j < Array.length; j++) { // math to find to sort
                     int temp = 0;
                     if (Array[j] < Array[i]) {
                         temp = Array[i];
                         Array[i] = Array[j];
                         Array[j] = temp;
                     }
                }
                if (i == 0) {
                    System.out.print("LIST : ");
                }
                System.out.print(Array[i] + " ");
            }
            System.out.println("\n\n{1}-- Add New Int");
            System.out.println("{2}-- Delete Int");
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

            while (Loop == 1) {
                clr();
                System.out.println("{ ARRAYS II }\n");
                System.out.println("Choose Int To Add (1 - " + Array.length +")");
                System.out.print("\ninput~# ");
                Answer = input.nextInt();
                int Add = Answer - 1;
                clr();

                System.out.println("{ ARRAYS II }\n");
                System.out.print("Choose New Int : ");
                Array[Add] = input.nextInt();

                Loop = 0;
            }

            while (Loop == 2) {
                clr();
                System.out.println("{ ARRAYS II }\n");
                System.out.println("Choose Int To Remove (1 - " + Array.length + ")");
                System.out.print("\ninput~# ");
                Answer = input.nextInt();
                int Remove = Answer - 1;
                
                Array[Remove] = 0;

                Loop = 0;
            }
        }
    }
}