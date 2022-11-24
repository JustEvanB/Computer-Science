/******************************************************************************

Sorting Algorithm
This program lets you choose 4 different options to sort, using 2 algorithms: bubble, and insertion
Evan Brundritt
05/16/22

*******************************************************************************/
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main
{

public static void BubbleSort(int array[]) {
    for(int i = 0; i < array.length; i++){ // Bubble Sort
		  for(int j = i + 1; j < array.length; j++) {
		      int temp = 0;
		      if (array[j] < array[i]) {
		          temp = array[i];
		          array[i] = array[j];
		          array[j] = temp;
		          clr();
		          System.out.println("{ Sorting Algorithm }"); // Show while sorting
		          System.out.print("\nSorted Numbers : " + Arrays.toString(array));
		          wait(1);
		            }
		        }
		    }
}

public static void insertionSort(int array[]) {
    for (int j = 1; j < array.length; j++) {
        clr();
        System.out.println("{ Sorting Algorithm }");
        System.out.print("\nSorted Array : " + Arrays.toString(array));
        int current = array[j];
        wait(1);
        int i = j-1;
        while ((i > -1) && (array[i] > current)) {
            array[i+1] = array[i];
            i--;
        }
        array[i+1] = current;
    }
}

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
    
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int Loop = 0;
		int Answer;
		
		while (Loop == 0) {
		    
		clr();
		System.out.println("{ Sorting Algorithm }");
		System.out.println("\n{1}-- 10 Random Numbers (Bubble)");
		System.out.println("{2}-- 10 Chosen Numbers (Bubble)");
		System.out.println("{3}-- 10 Random Numbers (Insertion)");
		System.out.println("{4}-- 10 Chosen Numbers (Insertion)");
		System.out.println("\n{99}-- Exit Program");
		System.out.print("\ninput~# ");
		Answer = input.nextInt();
		
		switch(Answer) {
		    case 4:
		        Loop = 4;
		        break;
		    case 3:
		        Loop = 3;
		        break;
		    case 1:
		        Loop = 1;
		        break;
		    case 2:
		        Loop = 2;
		        break;
		    case 99:
		        Loop = 99;
		        break;
		} // end switch
		
		while (Loop == 1) {
		    int [ ] Number = new int[10];
		    
		    Number[0] = (int) (Math.random () * (99)+1); // Set random Numbers
		    Number[1] = (int) (Math.random () * (99)+1);
		    Number[2] = (int) (Math.random () * (99)+1);
		    Number[3] = (int) (Math.random () * (99)+1);
		    Number[4] = (int) (Math.random () * (99)+1);
		    Number[5] = (int) (Math.random () * (99)+1);
		    Number[6] = (int) (Math.random () * (99)+1);
		    Number[7] = (int) (Math.random () * (99)+1);
		    Number[8] = (int) (Math.random () * (99)+1);
		    Number[9] = (int) (Math.random () * (99)+1);
		    
		    int[] array = new int[]{Number[0], Number[1], Number[2], Number[3], Number[4], Number[5], Number[6], Number[7], Number[8], Number[9]};
		    
		    clr();
		    System.out.println("{ Sorting Algorithm }");
		    System.out.println("\nRandom Numbers : " + Arrays.toString(array));
		    
		    wait(5);
		    
		    BubbleSort(array);
		    
		    System.out.println("\nSorting Complete!"); // Show complete & options
		    System.out.println("\n{1}-- Retry");
		    System.out.println("{99}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    switch(Answer) {
		        case 99:
		            Loop = 0;
		            break;
		    }
		    
		} // end loop 1
		
		while (Loop == 2) {
		    clr();
		     int [ ] Number = new int[10];
		        
		     for (int i = 0; i <= 9; i++) { // enter numbers
		            clr();
		            System.out.println("{ Sorting Algorithm }");
		            System.out.print("\nInput a number to sort : ");
		            Number[i] = input.nextInt();
		     }
		     
		     int[] array = new int[]{Number[0], Number[1], Number[2], Number[3], Number[4], Number[5], Number[6], Number[7], Number[8], Number[9]};
		     
		     clr();
		     System.out.println("{ Sorting Algorithm }");
		     System.out.print("\nChosen Numbers : " + Arrays.toString(array));
		     
		     wait(5);
		     
		     
		     BubbleSort(array);
		        
		        
		        System.out.println("\nSorting Complete!"); // Show complete & options
		        System.out.println("\n{1}-- Retry");
		        System.out.println("{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        switch(Answer) {
		            case 99:
		                Loop = 0;
		                break;
		        }
		} // End Loop 2
		
		while (Loop == 3) {
		    clr();
		    int [ ] Number = new int[10];
		    
		    System.out.println("{ Sorting Algorithm }");
		    
		    Number[0] = (int) (Math.random () * (99)+1); // Set random Numbers
		    Number[1] = (int) (Math.random () * (99)+1);
		    Number[2] = (int) (Math.random () * (99)+1);
		    Number[3] = (int) (Math.random () * (99)+1);
		    Number[4] = (int) (Math.random () * (99)+1);
		    Number[5] = (int) (Math.random () * (99)+1);
		    Number[6] = (int) (Math.random () * (99)+1);
		    Number[7] = (int) (Math.random () * (99)+1);
		    Number[8] = (int) (Math.random () * (99)+1);
		    Number[9] = (int) (Math.random () * (99)+1);
		    
		    int[] array = new int[]{Number[0], Number[1], Number[2], Number[3], Number[4], Number[5], Number[6], Number[7], Number[8], Number[9]};
		    
		    System.out.println("\nRandom Numbers : " + Arrays.toString(array));
		    
		    wait(5);
		    
		    insertionSort(array);
		    System.out.println("\nSorting Complete!");
		    
		    System.out.println("\n\n{1}-- Try Again");
		    System.out.println("{99}-- Go Back");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    switch(Answer) {
		        case 99:
		            Loop = 0;
		            break;
		    }
		} // end Loop 3
		
		while (Loop == 4) {
		    clr();
		    int [ ] Number = new int[15];
		    
		    for (int i = 0; i <= 9; i++) { // enter numbers
		            clr();
		            System.out.println("{ Sorting Algorithm }");
		            System.out.print("\nInput a number to sort : ");
		            Number[i] = input.nextInt();
		    }
		    
		    System.out.println("{ Sorting Algorithm }");
		    System.out.print("\nChosen Numbers : [" + Number[0]);
		    System.out.print(" " + Number[1]);
		    System.out.print(" " + Number[2]);
		    System.out.print(" " + Number[3]);
		    System.out.print(" " + Number[4]);
		    System.out.print(" " + Number[5]);
		    System.out.print(" " + Number[6]);
		    System.out.print(" " + Number[7]);
		    System.out.print(" " + Number[8]);
		    System.out.println(" " + Number[9] + "]");
		    
		    wait(5);
		     
		     int[] array = new int[]{Number[0], Number[1], Number[2], Number[3], Number[4], Number[5], Number[6], Number[7], Number[8], Number[9]};
		     
		     insertionSort(array);
		     
		     System.out.println("\nSorting Complete!"); // Show complete & options
		     System.out.println("\n{1}-- Retry");
		     System.out.println("{99}-- Go Back");
		     System.out.print("\ninput~# ");
		     Answer = input.nextInt();
		        
		     switch(Answer) {
		         case 99:
		             Loop = 0;
		             break;
		     }
		} // End Loop 4
		
		} // End Loop 0
	} // End main
} // End class Main
