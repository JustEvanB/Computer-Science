/******************************************************************************

Arrays!
This program uses arrays, loops, constant, and variables, to list 5 marks and show the average
4/01/22
Evan Brundritt

*******************************************************************************/
import java.util.Scanner;
import java.text.NumberFormat;

public class Main
{
	public static void main(String[] args) {
		Scanner Input = new Scanner (System.in); // establish 
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		double [ ] marks = new double [5]; // establish doubles
		double total = 0;
		double average;
		
		System.out.println("Input your last 5 marks : "); // input 5 marks
		for (int i = 0; i <= 4; i = i + 1)
		{
		    marks[i] = Input.nextDouble(); 
		}
		for (int i = 0; i <= 4; i = i + 1)
		{
		    total = total + marks[i];
		}

		average = total / 500; // put average into percent
		
		System.out.print(" Your average mark is : " + percent.format(average)); // show average
	}
}
