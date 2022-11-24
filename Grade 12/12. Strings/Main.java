/******************************************************************************

STRINGS
This program shows you the middle character of your string
Evan Brundritt
10/04/22

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		String phrase;
		String twoLetters;
		int phraseLength;
		int mid;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Phrase : " );
		phrase = input.nextLine();
		input.close();
		
		phraseLength = phrase.length();
		mid = phraseLength / 2;
		
		if (phraseLength %2==1) {
		    char Middle = phrase.charAt(mid);
		    System.out.println("The Mid Is : " + Middle);
		} else {
		    twoLetters = phrase.substring(mid-1, mid+1);
		    System.out.println("The Mid Is : " + twoLetters);
		}
	}
}
