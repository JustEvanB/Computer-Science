/******************************************************************************

Sorting Algorithm
This program gets 10 random numbers and then sorts them one at a time
04/22/22
Evan Brundritt

*******************************************************************************/
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main
{
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
		    System.out.println("{ Sorting Algorithm }"); // main menu
		    System.out.println("\n{1}-- 10 Random Numbers");
		    System.out.println("{2}-- 10 Chosen Numbers");
		    System.out.println("\n{99}-- Exit Program");
		    System.out.print("\ninput~# ");
		    Answer = input.nextInt();
		    
		    switch (Answer) {
		        case 99:
		            Loop = 99;
		            break;
		            
		        case 2:
		            Loop = 2;
		            break;
		            
		        case 1:
		            Loop = 1;
		            break;
		    } // end switch
		    
		    while (Loop == 1) {
		        clr();
		        System.out.println("{ Sorting Algorithm }");
		        
		        int [ ] Number = new int[10];
		        
		        Number[0] = (int) (Math.random () * (99)+1); // set random numbers
		        Number[1] = (int) (Math.random () * (99)+1);
		        Number[2] = (int) (Math.random () * (99)+1);
		        Number[3] = (int) (Math.random () * (99)+1);
		        Number[4] = (int) (Math.random () * (99)+1);
		        Number[5] = (int) (Math.random () * (99)+1);
		        Number[6] = (int) (Math.random () * (99)+1);
		        Number[7] = (int) (Math.random () * (99)+1);
		        Number[8] = (int) (Math.random () * (99)+1);
		        Number[9] = (int) (Math.random () * (99)+1);
		        
		        System.out.print("\nRandom Numbers : " + Number[0]); // show random numbers
		        System.out.print(" " + Number[1]);
		        System.out.print(" " + Number[2]);
		        System.out.print(" " + Number[3]);
		        System.out.print(" " + Number[4]);
		        System.out.print(" " + Number[5]);
		        System.out.print(" " + Number[6]);
		        System.out.print(" " + Number[7]);
		        System.out.print(" " + Number[8]);
		        System.out.println(" " + Number[9]);
		        
		        wait(5);
		        
		        for (int i = 0; i < Number.length; i++) {
		            for (int j = i + 1; j < Number.length; j++) { // math to find to sort
		                 int temp = 0;
		                 if (Number[j] < Number[i]) {
		                     temp = Number[i];
		                     Number[i] = Number[j];
		                     Number[j] = temp;
		                 }
		            }
		            
		            wait(1);
		            if (i == 0) {
		                System.out.print("\nSorted Numbers : ");
		            }
		            System.out.print(Number[i] + " ");
		            
		        } // end number sorter
		        System.out.println("\n\n{1}-- Try Again");
		        System.out.println("{99}-- Go Back");
		        System.out.println("{100}-- Exit Program");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        switch (Answer) {
		            case 1:
		                Loop = 1;
		                break;
		                
		            case 100:
		                Loop = 99;
		                break;
		                
		            case 99:
		                Loop = 0;
		                break;
		        } // end switch
		    } // end Loop 1
		    
		    while (Loop == 2) {
		        clr();
		        
		        int [ ] Number = new int[10];
		        
		        for (int i = 0; i <= 9; i++) { // enter numbers
		            clr();
		            System.out.println("{ Sorting Algorithm }");
		            System.out.print("\nInput a number to sort : ");
		            Number[i] = input.nextInt();
		        }
		        
		        clr();
		        System.out.println("{ Sorting Algorithm }");
		        System.out.print("\nChosen Numbers : " + Number[0]); // show chosen numbers
		        System.out.print(" " + Number[1]);
		        System.out.print(" " + Number[2]);
		        System.out.print(" " + Number[3]);
		        System.out.print(" " + Number[4]);
		        System.out.print(" " + Number[5]);
		        System.out.print(" " + Number[6]);
		        System.out.print(" " + Number[7]);
		        System.out.print(" " + Number[8]);
		        System.out.println(" " + Number[9]); 
		        
		        wait(1);
		        
		        for (int i = 0; i < Number.length; i++) {
		            for (int j = i + 1; j < Number.length; j++) { // math to find to sort
		                 int temp = 0;
		                 if (Number[j] < Number[i]) {
		                     temp = Number[i];
		                     Number[i] = Number[j];
		                     Number[j] = temp;
		                 }
		            }
		            
		            wait(1);
		            if (i == 0) {
		                System.out.print("\nSorted Numbers : ");
		            }
		            System.out.print(Number[i] + " ");
		            
		        } // end Number Sorter
		        
		        System.out.println("\n\n{1}-- Try Again");
		        System.out.println("{99}-- Go Back");
		        System.out.println("{100}-- Exit Program");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        switch(Answer) {
		            case 100:
		                Loop = 99;
		                break;
		                
		            case 99:
		                Loop = 0;
		                break;
		                
		            case 1:
		                Loop = 2;
		                break;
		        } // end switch
		    } // end Loop 2
		    
		    if (Loop == 99) {
		        
		        clr();
		        System.out.println("{ GoodBye! }");
		        System.out.println("\nThank you for using my program :)");
		        System.out.println("Goodbye");
		        
		    } // end Loop 99
		} // end Loop 0
	}
}
