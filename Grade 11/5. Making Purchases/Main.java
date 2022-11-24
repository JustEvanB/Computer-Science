/******************************************************************************

Making Purchases
This program caluclates the price for a bunch of fruits & vegetables
Evan Brundritt
Feb 15/22

*******************************************************************************/

import java.util.Scanner;
import java.text.NumberFormat;
public class Main
{
  public static void main (String[]args)
  {
    int Cucumbers;		// Establishing each item
    int Strawberries;
    int Oranges;
    int Apples;
    int Kiwis;
    int Bananas;
    int Blueberries;
    int Pineapples;
    Double CucumbersPrice = 1.67;    // Prices for each item
    Double StrawberriesPrice = 4.74;
    Double OrangesPrice = 1.78;
    Double ApplesPrice = 2.27;
    Double KiwisPrice = 3.97;
    Double BananasPrice = 0.62;
    Double BlueberriesPrice = 1.40;
    Double PineapplesPrice = 2.75;
    Double Tax = 1.13;
    Scanner input = new Scanner (System.in);                    // Scanner and Formatting
    NumberFormat Money = NumberFormat.getCurrencyInstance();

      System.out.print ("How many Cucumbers would you like to purchase (2.23/lb) : ");	// How much of each you would like to buy
      Cucumbers = input.nextInt ();
      System.out.print("How many Strawberries would you like to purchase ($4.74/lb) : ");
      Strawberries = input.nextInt ();
      System.out.print ("How many Oranges would you like to purchase ($1.78/lb) : ");
      Oranges = input.nextInt ();
      System.out.print ("How many Apples would you like to purchase ($2.27/lb) : ");
      Apples = input.nextInt ();
      System.out.print ("How many Kiwis would you like to purchase (3.97/lb) : ");
      Kiwis = input.nextInt ();
      System.out.print("How many Bananas would you like to purchase (0.62/lb) : ");
      Bananas = input.nextInt ();
      System.out.print("How many Blueberries would you like to purchase (1.40/lb) : ");
      Blueberries = input.nextInt ();
      System.out.print("How many Pineapples would you like to purchase (2.75/lb) : ");
      Pineapples = input.nextInt ();

      System.out.println ("\n__________________________________________");	// Formatting into Items

      System.out.print ("\nSubtotal : \n");	// Subtotal
      System.out.print ("Cucumbers : " + Cucumbers); // Subtotal for Cucumbers
      CucumbersPrice = CucumbersPrice * Cucumbers;
      System.out.print (" - Cucumbers price : ");
      System.out.println (Money.format(CucumbersPrice));

      System.out.print ("Strawberries : " + Strawberries); // Subtotal for Strawberries
      StrawberriesPrice = StrawberriesPrice * Strawberries;
      System.out.print (" - Strawberries price : ");
      System.out.println (Money.format(StrawberriesPrice));

      System.out.print ("Oranges : " + Oranges); // Subtotal for Oranges
      OrangesPrice = OrangesPrice * Oranges;
      System.out.print (" - Oranges price : ");
      System.out.println (Money.format(OrangesPrice));

      System.out.print ("Apples : " + Apples); // Subtotal for Apples
      ApplesPrice = ApplesPrice * Apples;
      System.out.print (" - Apples price : ");
      System.out.println (Money.format(ApplesPrice));

      System.out.print ("Kiwis : " + Kiwis); // Subtotal for Kiwis
      KiwisPrice = KiwisPrice * KiwisPrice;
      System.out.print (" - Kiwis price : ");
      System.out.println (Money.format(KiwisPrice));
      
      System.out.print("Bananas : " + Bananas); // Subtotal for Bananas
      BananasPrice = BananasPrice * Bananas;
      System.out.print(" - Bananas price : ");
      System.out.println(Money.format(BananasPrice));
      
      System.out.print("Blueberries : " + Blueberries); // Subtotal for Blueberries
      BlueberriesPrice = BlueberriesPrice * Blueberries;
      System.out.print(" - Blueberries price : ");
      System.out.println(Money.format(BlueberriesPrice));
      
      System.out.print("Pineapples : " + Pineapples); // Subtotal for Pineapples
      PineapplesPrice = PineapplesPrice * Pineapples;
      System.out.print(" - Pineapples price : ");
      System.out.println(Money.format(PineapplesPrice));

      System.out.println ("___________________________________________\n");

    Double Subtotal =   // Shows Subtotal
      CucumbersPrice + StrawberriesPrice + OrangesPrice + ApplesPrice +
      KiwisPrice + BananasPrice + BlueberriesPrice + PineapplesPrice;
      System.out.print ("Subtotal : ");
      System.out.println(Money.format(Subtotal));

      System.out.println ("__________________________________________");	// Formatting into Tax

      Tax = CucumbersPrice + StrawberriesPrice + OrangesPrice +  // Taxes
      ApplesPrice + KiwisPrice + BananasPrice + BlueberriesPrice + PineapplesPrice;
      Tax = 1.13 * Tax;
      Double TaxTotal = Tax - CucumbersPrice - StrawberriesPrice - OrangesPrice - 
      ApplesPrice - KiwisPrice - BananasPrice - BlueberriesPrice - PineapplesPrice;
      System.out.print ("\nTax : ");
      System.out.println (Money.format(TaxTotal));

      System.out.println ("__________________________________________");	// Formatting into Grand Total

      System.out.print ("\nGrand total : ");        // Grand Total
      System.out.println (Money.format(Tax));       

      System.out.print ("__________________________________________");	// Formatting to underline Grand Total
  }
}