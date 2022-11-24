/******************************************************************************

Multiple Choice Quiz!
This program will run a multiple choice quiz about computer science
Evan Brundritt
02/23/22

*******************************************************************************/
import java.util.Scanner;  // Imports
import java.text.NumberFormat;

public class Main
{
	public static void main(String[] args) {
		int Answer = 0;           // Establish integers and strings
		String CorrectAnswer;
		int Answer2 = 0;
		String CorrectAnswer2;
		int Answer3 = 0;
		String CorrectAnswer3;
		int Answer4 = 0;
		String CorrectAnswer4;
		int Answer5 = 0;
		String CorrectAnswer5;
		int Answer6 = 0;
		String CorrectAnswer6;
		int Answer7 = 0;
		String CorrectAnswer7;
		Double Percentage = 0.0;
		int AmountCorrect;
		
		
		Scanner input = new Scanner(System.in);  // Establish Imports
		NumberFormat Percent = NumberFormat.getPercentInstance();
		
		System.out.println("What is a double used for : ");  // Question 1
		System.out.println("A : The same as int");  // Solutions A-D
		System.out.println("B : A whole number");
		System.out.println("C : A number with a decimal");
		System.out.println("D : Make you feel smarter");
		System.out.print("Your Answer : ");
		CorrectAnswer = input.next();
		
		if (CorrectAnswer.equals("c") || CorrectAnswer.equals("C")){  // Show if correct or wrong
		    Answer = 1;
		    Percentage = Percentage + 0.1428;
		    System.out.println("\nTHAT ANSWER WAS CORRECT!");
		} else {
		    System.out.println("\nThat answer was incorrect");
		    Percentage = Percentage + 0.0;
		}
		
		AmountCorrect = Answer + Answer2 + Answer3 + Answer4 + Answer5 + Answer6 + Answer7; // Figure out Percentage
		System.out.print("How many correct : " + AmountCorrect);  // show how many correct and Percentage
		System.out.println("/7");
		System.out.println("Percentage : " + Percent.format(Percentage));
		
		System.out.println("\nWhat is the correct line to print out a sentence : ");  // Question 2
		System.out.println("A : System.print()");       // Solutions A-D
		System.out.println("B : System.out.println()");
		System.out.println("C : System.output()");
		System.out.println("D : Console.println()");
		System.out.print("Your Answer : ");
		CorrectAnswer2 = input.next();
		
		if (CorrectAnswer2.equals("b") || CorrectAnswer2.equals("B")){  // Show if correct or wrong
		    Answer2 = 1;
		    Percentage = Percentage + 0.1428;
		    System.out.println("\nTHAT ANSWER WAS CORRECT!");
		} else {
		    System.out.println("\nThat answer was incorrect.");
		    Percentage = Percentage + 0.0;
		}
		
		AmountCorrect = Answer + Answer2 + Answer3 + Answer4 + Answer5 + Answer6 + Answer7; // Figure out Percentage
		System.out.print("How many correct : " + AmountCorrect);  // show how many correct and Percentage
		System.out.println("/7");
		System.out.println("Percentage : " + Percent.format(Percentage));
		
		System.out.println("\nHow do you import the Scanner tool : ");  // Question 3
		System.out.println("A - import java.util.Scanner");  // Solutions A-D
		System.out.println("B - import java.Scanner");
		System.out.println("C - import util.Scanner");
		System.out.println("D - import utility.Scanner");
		System.out.print("Your Answer : ");
		CorrectAnswer3 = input.next();
		
		if (CorrectAnswer3.equals("a") || CorrectAnswer3.equals("A")){  // Show if correct or wrong
		    Answer3 = 1;
		    Percentage = Percentage + 0.1428;
		    System.out.println("\nTHAT ANSWER WAS CORRECT!");
		} else {
		    System.out.println("\nThat answer was incorrect.");
		    Percentage = Percentage + 0.0;
		}
		
		AmountCorrect = Answer + Answer2 + Answer3 + Answer4 + Answer5 + Answer6 + Answer7; // Figure out Percentage
		System.out.print("How many correct : " + AmountCorrect);  // show how many correct and Percentage
		System.out.println("/7");
		System.out.println("Percentage : " + Percent.format(Percentage));
		
		System.out.println("\nWhat is a flowchart used for : ");  // Question 4
		System.out.println("A - For aesthetics");               // Solutions A-D
		System.out.println("B - Its more fun then coding");
		System.out.println("C - Shows what you want your program to do");
		System.out.println("D - It looks cool");
		System.out.print("Your Answer : ");
		CorrectAnswer4 = input.next();
		
		if (CorrectAnswer4.equals("c") || CorrectAnswer4.equals("C")){ // Show if correct or wrong
		    Answer4 = 1;
		    System.out.println("\nTHAT ANSWER WAS CORRECT!");
		    Percentage = Percentage + 0.1428;
		} else {
		    System.out.println("\nThat answer was incorrect.");
		    Percentage = Percentage + 0.0;
		}
		
		AmountCorrect = Answer + Answer2 + Answer3 + Answer4 + Answer5 + Answer6 + Answer7; // Figure out Percentage
		System.out.print("How many correct : " + AmountCorrect);  // show how many correct and Percentage
		System.out.println("/7");
		System.out.println("Percentage : " + Percent.format(Percentage));
		
		System.out.println("\nWhich class is best : ");  // Question 5
		System.out.println("A - Computer Science");   // Solutions A-D
		System.out.println("B - Math");
		System.out.println("C - Communications Technology");
		System.out.println("D - Gym");
		System.out.print("Your Answer : ");
		CorrectAnswer5 = input.next();
		
		if (CorrectAnswer5.equals("a") || CorrectAnswer5.equals("A")){  // Show if correct or wrong
		    Answer5 = 1;
		    System.out.println("\nTHAT ANSWER WAS CORRECT!");
		    Percentage = Percentage + 0.1428;
		} else {
		    System.out.println("\nThat answer was incorrect.");
		    Percentage = Percentage + 0.0;
		}
		
		AmountCorrect = Answer + Answer2 + Answer3 + Answer4 + Answer5 + Answer6 + Answer7; // Figure out Percentage
		System.out.print("How many correct : " + AmountCorrect);  // show how many correct and Percentage
		System.out.println("/7");
		System.out.println("Percentage : " + Percent.format(Percentage));
		
		System.out.println("\nWhich of the following is not correct : ");  // Question 6
		System.out.println("A - int Answer = 5");  // Solutions A-D
		System.out.println("B - Scanner input = new Scanner(System.in)");
		System.out.println("C - import java.text.NumberFormat");
		System.out.println("D - System.out.printIn()");
		System.out.print("Your Answer : ");
		CorrectAnswer6 = input.next();
		
		if (CorrectAnswer6.equals("d") || CorrectAnswer6.equals("D")){
		    Answer6 = 1;
		    System.out.println("\nTHAT ANSWER WAS CORRECT!");
		    Percentage = Percentage + 0.1428;
		} else {
		    System.out.println("\nThat answer was incorrect.");
		    Percentage = Percentage + 0.0;
		}
		
		AmountCorrect = Answer + Answer2 + Answer3 + Answer4 + Answer5 + Answer6 + Answer7;  // Figure out Percentage
		System.out.print("How many correct : " + AmountCorrect);  // Show how many correct and Percentage
		System.out.println("/7");
		System.out.println("Percentage : " + Percent.format(Percentage));
		
		System.out.println("\nWhich of the following is correct : ");  // Question 7
		System.out.println("A - Double Account = 50;");   // Solutions A-D
		System.out.println("B - import java.Scanner;");
		System.out.println("C - import java.text.NumberFormat;");
		System.out.println("D - Int Accounts;");
		System.out.print("Your Answer : ");
		CorrectAnswer7 = input.next();
		
		if (CorrectAnswer7.equals("c") || CorrectAnswer7.equals("C")){ // show if correct or wrong
		    Answer7 = 1;
		    System.out.println("\nTHAT ANSWER WAS CORRECT!");
		    Percentage = Percentage + 0.1428;
		} else {
		    System.out.println("\nThat answer was incorrect.");
		    Percentage = Percentage + 0.0;
		}
		
		AmountCorrect = Answer + Answer2 + Answer3 + Answer4 + Answer5 + Answer6 + Answer7; // Figure out Percentage
		System.out.print("How many correct : " + AmountCorrect); // Show how many correct and Percentage
		System.out.println("/7");
		System.out.println("Percentage : " + Percent.format(Percentage));
	    
	    if (AmountCorrect >= 7){  // Show final grade
		    System.out.println("\nYOU GOT AN A+! PERFECT!");
		} else if (AmountCorrect >= 6){
		    System.out.println("\nYOU GOT AN A! GOOD JOB!");
		} else if (AmountCorrect >= 5){
		    System.out.println("\nYou got a B.");
		} else if (AmountCorrect >= 4){
		    System.out.println("\nYou got a D!");
		} else if (AmountCorrect >= 0){
		    System.out.println("\nYou failed. Better luck next time.");
		}
		
		
	}
}
