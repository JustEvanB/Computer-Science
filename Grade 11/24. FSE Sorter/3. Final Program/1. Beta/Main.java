/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main
{

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
	
	public static void main(String[] args) {
		int Loop = 0;
		int Answer;
		
		Scanner input = new Scanner (System.in);
		
		while (Loop == 0) {
		    clr();
		    System.out.println("{1}-- 10 Random BubbleSort");
		    System.out.println("{2}-- 10 Random Insertion");
		    System.out.println("\n{99}-- Exit");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    if (Answer == 1) {
		        Loop = 1;
		    }
		    if (Answer == 2) {
		        Loop = 2;
		    }
		    if (Answer == 3) {
		        Loop = 3;
		    }
		
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
		    System.out.println("\n{99}-- Back");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    if (Answer == 99) {
		        Loop = 0;
		    }
		}
		
		while (Loop == 2) {
		    
		    clr();
		    
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
		    
		    insertionSort(array);
		    
		    System.out.println("\nSorting Complete!"); // Show complete & options
		    System.out.println("\n{99}-- Back");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    if (Answer == 99) {
		        Loop = 0;
		    }
		}
		
		}
	}
}
