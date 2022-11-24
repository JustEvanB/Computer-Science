/******************************************************************************

Making A Pizza!
This program inputs a diameter and tells you the total, subtotal, and tax
Evan Brundritt
02/22/22

*******************************************************************************/

import java.util.Scanner;         // Imports 
import java.text.NumberFormat;

public class Main
{
	public static void main(String[] args) {
		Double PizzaRent = 0.99;  // Establishing all doubles and integers
		Double PizzaCost = 0.5;
		Double Labour = 0.75;
		Double Tax;
		Double GrandTotal;
		Double Subtotal;
		int Diameter;
		
		NumberFormat Money = NumberFormat.getCurrencyInstance();  // Establishing Imports
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the diameter of the pizza (Centimeters) : ");  // Input Diameter
		Diameter = input.nextInt();
		
		if (Diameter <=20){                                                    //  Outputs for pizza size
		    System.out.println("\nWe are going to make you a cute little pizza!\n");
		} else if (Diameter <=40){
		    System.out.println("\nThis will be delicious!\n");
		} else if (Diameter >=80){
		    System.out.println("\nWhoa, big pizza! You might need a truck to get this home!\n");
		}
		
		PizzaCost = Diameter * 0.5;                 // Math for Taxes and Totals
		Subtotal = PizzaCost + PizzaRent + Labour;
		Tax = Subtotal * 0.13;
		GrandTotal = Subtotal + Tax;
		
		System.out.println("Subtotal : " + Money.format(Subtotal));    // Outputs Taxes and Totals
		System.out.println("Taxes : " + Money.format(Tax));
		System.out.println("Grand Total : " + Money.format(GrandTotal));
	}
}
