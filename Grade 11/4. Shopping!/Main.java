/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int USBs;  // Establishing each item
		int Keyboards;
		int Mice;
		Double USBsPrice = 19.99;
		Double KeyboardsPrice = 49.99;
		Double MicePrice = 25.99;
		Double Tax = 1.13;
		Scanner input = new Scanner(System.in);
		
		System.out.print("USBs you would like to purchase : ");  // How much of each you would like to buy
		USBs = input.nextInt();
		System.out.print("Keyboards you would like to purchase : ");
		Keyboards = input.nextInt();
		System.out.print("Mice you would like to purchase : ");
		Mice = input.nextInt();
		
		
		System.out.print("\nSubtotal : \n");  // Subtotal for Each
		System.out.print("USBs : " + USBs );
		USBsPrice = USBsPrice*USBs;
		System.out.println(" - USB price : " + USBsPrice);
		
		System.out.print("Keyboards : " + Keyboards );
		KeyboardsPrice = KeyboardsPrice*Keyboards;
		System.out.println(" - Keyboards price : " + KeyboardsPrice);
		
		System.out.print("Mice : " + Mice );
		MicePrice = MicePrice*Mice;
		System.out.println(" - Mice price : " + MicePrice );
		
		Tax = USBsPrice+KeyboardsPrice+MicePrice;  // Taxes
		Tax = 1.13*Tax;
		Double TaxTotal = Tax-USBsPrice-KeyboardsPrice-MicePrice;
		System.out.println("\nTax : " + TaxTotal);
		
		System.out.println("\nGrand total : " + Tax );  // Grand Total
	}
}
