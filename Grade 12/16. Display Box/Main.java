/******************************************************************************

Display Box
This program makes a box to the specified width and height
Evan Brundritt
10/26/22

*******************************************************************************/
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main 
{
    public static void clr() { // set method for clearing screen
        System.out.print("\033[H\033[2J");
    }
    public static void wait(int n1) { // set method for waiting
        try {
            TimeUnit.MILLISECONDS.sleep(n1);
        } catch (Exception e) {
            System.out.println("You must've broken something to get here");
        }
    }

    public static void drawBar(int n2, String D) {
        for (int i=0; i<n2; i++){
            System.out.print(D);
        }
    }

    public static void drawBox(int n1, int n2, String D) { // n1 = height n2 = width
        for (int i=0; i<n1; i++) {
            drawBar(n2, D);
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int Answer;
        int Width;
        int Height;
        int Loop = 0;
        String D = "*";
        clr();

        Scanner input = new Scanner (System.in);
        while (Loop == 0){
        System.out.println("{ Display Box }");
        System.out.println("\n{1}-- Make Default Box");
        System.out.println("{2}-- Use Custom Character\n");
        System.out.print("input~# ");
        Answer = input.nextInt();

        if (Answer == 1) {
            Loop = 1;
        }
        if (Answer == 2) {
            Loop = 2;
        }

        while (Loop == 1) {
            clr();
            System.out.println("{ Display Box }");
            System.out.print("\nInput Width Of Box : ");
            Width = input.nextInt();
            clr();

            System.out.println("{ Display Box }");
            System.out.print("\nInput Height Of Box : ");
            Height = input.nextInt();
            clr();

            System.out.println("{ Display Box }\n");
            drawBox(Height, Width, D);
            System.out.println("\n{99}-- Go Back");
            System.out.print("input~# ");
            Answer = input.nextInt();

            if (Answer == 99) {
                clr();
                Loop = 0;
            }
            
        }

        while (Loop == 2) {
            clr();
            System.out.println("{ Display Box }");
            System.out.print("\nInput Width Of Box : ");
            Width = input.nextInt();
            clr();

            System.out.println("{ Display Box }");
            System.out.print("\nInput Height Of Box : ");
            Height = input.nextInt();
            clr();

            System.out.println("{ Display Box }");
            System.out.print("\nInput A Custom Letter : ");
            D = input.next();
            clr();

            System.out.println("{ Display Box }\n");
            drawBox(Height, Width, D);
            System.out.println("\n{99}-- Go Back");
            System.out.print("input~# ");
            Answer = input.nextInt();

            if (Answer == 99) {
                clr();
                Loop = 0;
            }
        }

        } // end loop 0
    }
}