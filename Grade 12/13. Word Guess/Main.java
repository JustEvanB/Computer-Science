import java.util.concurrent.TimeUnit;
import java.util.*;

public class Main {

    public static void clr() { // set method for clearing screen
        System.out.print("\033[H\033[2J");
    }
    
    public static void wait(int n1) { // set method for waiting
        try {
            TimeUnit.SECONDS.sleep(n1);
        } catch (Exception e) {
            System.out.println("You must've broken something to get here");
        }
    }
    
    public static void main(String [] args){

    String storedword;
    char[] charstring;
    int length;
    char[] censor; 
    int attempts=0;

    StringBuilder pastguesses = new StringBuilder();

    Scanner typedword = new Scanner(System.in);
    System.out.print("Enter your word to guess: "); // input the word to guess
    storedword = typedword.nextLine();  
    storedword = storedword.toUpperCase();
    length = storedword.length(); 
    clr();

    charstring = storedword.toCharArray();
    censor = storedword.toCharArray(); 
    System.out.println("Your secret word is: ");  // censoring word with dashes

    for (int index = 0; index < length; index++){
        censor[index] = '-';
    }

    while (String.valueOf(censor).equals(storedword)== false){ // main loop

        char charguess; // establishing variables
        String tempword;
        String tempstring;
        boolean correct = false; 
        int times = 0; 
        boolean repeated = false;

        for(int a= 0; a < length; a++){ // censoring word completely
             System.out.print(censor[a]);
        }
        System.out.println();

        Scanner guess = new Scanner(System.in);
        System.out.print("Type your guess: "); // taking guess
        tempword = guess.next();
        charguess = tempword.charAt(0); 

        pastguesses.append(charguess); 
        tempstring = pastguesses.toString();

        if (tempstring.lastIndexOf(charguess, tempstring.length() -2 ) != -1){ // already guessed word
            System.out.print("You already guessed this letter! Guess again. Your previous guesses were: ");
            pastguesses.deleteCharAt(tempstring.length()-1); 
            System.out.println(tempstring.substring(0, tempstring.length()-1));
            repeated = true;
            wait(3);
            clr();
        }

        if (repeated == false){ // word
            for (int index = 0; index < length; index++){

                 if(charstring[index] == Character.toUpperCase(charguess)) {

                     censor[index] = Character.toUpperCase(charguess);
                     correct = true; 
                     times++; 
                  }
            }
            if(correct == true){ // guessed correct
                System.out.print("The letter " + charguess + " is in the secret word! There are " + times +" " + charguess + "'s in the word. Revealing the letter(s): ");
                wait(3);
                clr();
            }

            else if (correct == false){ // guessed wrong
                System.out.println("Sorry, the letter is not in the word. Your secret word:  ");
                wait(3);
                clr();
            }
            System.out.println();
        }
        attempts++;
    }
    System.out.println("You guessed the entire word "+ storedword.toUpperCase() + " correctly! It took you " + attempts + " attempts!"); // completed word
    }
}