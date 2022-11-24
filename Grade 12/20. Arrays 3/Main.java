/******************************************************************************

Arrays 3
This program uses a 2d array to store grades for students and gives the average
Evan Brundritt
11/01/22

*******************************************************************************/
import java.util.Scanner; // Imports
import java.util.concurrent.TimeUnit;
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

    static public void displayarray(int Array[][]) {
        System.out.println("STUDENT 1 | Student 2 | Student 3 | Student 4 | Student 5");
        System.out.println(Array[0][0] + "         | " + Array[1][0] + "         | " + Array[2][0] + "         | " + Array[3][0] + "         | "+ Array[4][0]);
        System.out.println(Array[0][1] + "         | " + Array[1][1] + "         | " + Array[2][1] + "         | " + Array[3][1] + "         | "+ Array[4][1]);
        System.out.println(Array[0][2] + "         | " + Array[1][2] + "         | " + Array[2][2] + "         | " + Array[3][2] + "         | "+ Array[4][2]);
        
        int S1Sum = Array[0][0] + Array[0][1] + Array[0][2];
        S1Sum = S1Sum / 3;
        int S2Sum = Array[1][0] + Array[1][1] + Array[1][2];
        S2Sum = S2Sum / 3;
        int S3Sum = Array[2][0] + Array[2][1] + Array[2][2];
        S3Sum = S3Sum / 3;
        int S4Sum = Array[3][0] + Array[3][1] + Array[3][2];
        S4Sum = S4Sum / 3;
        int S5Sum = Array[4][0] + Array[4][1] + Array[4][2];
        S5Sum = S5Sum / 3;

        System.out.println("----------------------------------------------------------");
        System.out.println(S1Sum + "         | " + S2Sum + "         | " + S3Sum + "         | " + S4Sum + "         | "+ S5Sum);
    }
    public static void main(String[] args) {
        int Loop = 0;
        int[][] Array = new int[8][3];
        int Answer;
        int Row;
        int Col;

        Scanner input = new Scanner(System.in); // Establish Imports

        while(Loop == 0) {
            clr();
            System.out.println("{ ARRAYS III }\n");
            displayarray(Array);

            System.out.println("\n\n{1}-- Input New Score");
            System.out.println("{99}-- Exit");
            System.out.print("\ninput~# ");
            Answer = input.nextInt();
            clr();

            if (Answer == 1) {
                Loop = 1;
            }
            if (Answer == 99) {
                Loop = 99;
            }

            while (Loop == 1) {
                clr();
                System.out.println("{ ARRAYS III }\n");
                displayarray(Array);
                System.out.print("\n\nInput Row (1 - 5): ");
                Row = input.nextInt();
                Row--;

                clr();
                System.out.println("{ ARRAYS III }\n");
                displayarray(Array);
                System.out.print("\n\nInput Column (1 - 3): ");
                Col = input.nextInt();
                Col--;

                clr();
                System.out.println("{ ARRAYS III }\n");
                displayarray(Array);
                System.out.print("\n\nInput Score (0 - 100): ");
                Array[Row][Col] = input.nextInt();
            }

        }
    }
}