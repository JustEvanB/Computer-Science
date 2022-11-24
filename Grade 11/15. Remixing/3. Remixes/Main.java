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
		Scanner keyedInput = new Scanner (System.in);
        
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6}; // establish doubles
        double total=0;
        double average;
        
        System.out.println("These are the marks:");
        for (int i = 0; i<=8; i= i + 1) // input marks
        {
           System.out.println(marks[i]);
        }
        
        for (int i = 0; i<=8; i= i + 1) // add total marks
        {
            total = total + marks[i];
        }
        
        average = total/9;
        
        average = average * 10; // round average
        average = Math.round(average);
        average = average/10;
        
        System.out.println("The average mark is:"); // show average
        System.out.println(average);
	}
}
