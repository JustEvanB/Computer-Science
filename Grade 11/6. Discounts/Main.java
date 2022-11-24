/******************************************************************************

Discounts!
This program calculates the discounts off your purchase and applies it
Evan Brundritt
Feb 17/22

*******************************************************************************/
import java.util.Scanner;
import java.text.NumberFormat;
public class Main
{
	public static void main(String[] args) {
	    Double Sale = 0.0;  // Declared Variables
	    Double Spent;
	    Double Total;
	    Double TotalSaved;
	    Double GrandTotal;
		Scanner input = new Scanner(System.in); // Started Imports
		NumberFormat Percent = NumberFormat.getPercentInstance();
		NumberFormat Money = NumberFormat.getCurrencyInstance();
		
		System.out.print("How much money did you spend : ");  // Spent
		Spent = input.nextDouble();
		
		if (Spent >= 120){          // Declaring Discount Amount
		    Sale = 0.4;
		} else if (Spent >= 80.01){
		    Sale = 0.3;
		} else if (Spent >= 40.01){
		    Sale = 0.2;
		} else if (Spent >= 0.01){
		    Sale = 0.1;
		}
		
	    System.out.print("Sale : " + Percent.format(Sale));   // Show Sale
	    
	    TotalSaved = Spent * Sale;  // Figure out totals
	    GrandTotal = Spent - TotalSaved;
	    
	    System.out.println("\nTotal Saved : " + Money.format(TotalSaved)); // Show Totals
	    System.out.print("Grand Total : " + Money.format(GrandTotal));
	}
	
}
