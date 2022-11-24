/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Please Enter the 3 Digit Number : ");
		String Num = input.nextLine();
		
		char Hundreds = Num.charAt(0);
		System.out.println("\n" + Hundreds + " : Hundreds");
		char Tens = Num.charAt(1);
		System.out.println(Tens + " : Tens");
		char Ones = Num.charAt(2);
		System.out.println(Ones + " : Ones");
	}
}
