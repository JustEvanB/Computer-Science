/******************************************************************************

Exponentiation
This program gets 2 numbers and puts the first number to the exponent of the 2nd number
Evan Brundritt
10/31/22

*******************************************************************************/
import java.util.Scanner; // Imports

public class Main
{
    public static void clr() { // set method for clearing screen
        System.out.print("\033[H\033[2J");
    }

    public static void Exponent(int n1, int n2) {
    long result = 1;

    while (n2 != 0) {
      result *= n1;
      --n2;
    }
        System.out.println("The Exponent is : " + result);
    }

    public static void main(String[] args) {
        int Loop = 0;
        int Num;
        int Power;
        int Answer;

        Scanner input = new Scanner(System.in); // Establish Imports

        while(Loop == 0) {
            clr();
            System.out.println("{ EXPONENTS }");
            System.out.print("\nInput Number : ");
            Num = input.nextInt();
            clr();

            System.out.println("{ EXPONENTS }");
            System.out.print("\nInput Exponent : ");
            Power = input.nextInt();
            clr();

            System.out.println("{ EXPONENTS }\n");
            Exponent(Num, Power);
            System.out.println("\n{99}-- Restart");
            System.out.print("\ninput~# ");
            Answer = input.nextInt();
        }
    }
}