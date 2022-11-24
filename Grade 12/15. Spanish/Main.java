/******************************************************************************

Spanish
This program converts numbers to spanish
Evan Brundritt
10/26/22

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

    public static void convert(int n1) {
        if (n1 == 1) {
            System.out.print("uno");
        }
        if (n1 == 2) {
            System.out.print("dos");
        }
        if (n1 == 3) {
            System.out.print("tres");
        }
        if (n1 == 4) {
            System.out.print("cuatro");
        }
        if (n1 == 5) {
            System.out.print("cinco");
        }
        if (n1 == 6) {
            System.out.print("seis");
        }
        if (n1 == 7) {
            System.out.print("siete");
        }
        if (n1 == 8) {
            System.out.print("ocho");
        }
        if (n1 == 9) {
            System.out.print("nueve");
        }
        if (n1 == 10) {
            System.out.print("diez");
        }
    }

    public static void main(String[] args) {
        int Answer;
        int Loop = 0;
        clr();

        Scanner input = new Scanner (System.in);
        while (Loop == 0){
        System.out.println("{ Spanish Converter }");
        System.out.println("\n{1}-- Start Conversion");
        System.out.print("input~# ");
        Answer = input.nextInt();

        if (Answer == 1) {
        clr();
        System.out.println("{ Spanish Converter }\n");

        for (int i=1; i<11; i++){
            System.out.print(i + " ");
            convert(i);
            System.out.println("");
            wait(1);
        }
        clr();
        Loop = 0;
    }
        } // end loop 0
    }
}