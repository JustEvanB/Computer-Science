/******************************************************************************

The EPRA And OES
This program will give a GUI and show each question asked on D2L
Evan Brundritt
05/30/22

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    
    public static void clr() { // set method for clearing screen
        System.out.print("\033[H\033[2J");
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int Loop = 0;
		int Answer;
		
		while(Loop == 0) {
		    clr();
		    System.out.println("{ The ERPA And OES }");
		    System.out.println("\n{1}-- The Problem Of E-Waste");
		    System.out.println("{2}-- Why E-Waste Is Getting Worse");
		    System.out.println("{3}-- What Is The EPRA");
		    System.out.println("{4}-- What Is The OES");
		    System.out.println("{5}-- What Is The Electronic Handling Fee In Ontario");
		    System.out.println("{6}-- What Is The Electronic Drop-Off Location");
		    System.out.println("\n{99}-- Exit Program");
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
		    if (Answer == 4) {
		        Loop = 4;
		    }
		    if (Answer == 5) {
		        Loop = 5;
		    }
		    if (Answer == 6) {
		        Loop = 6;
		    }
		    if (Answer == 99) {
		        Loop = 99;
		    }
		    
		    while (Loop == 1) {
		        clr();
		        System.out.println("{ The Problem Of E-Waste }");
		        System.out.println("\n What the problem of E-waste is when people discard electronices into the ground, \nand then this leaks out all the toxic chemicals inside of them, which can poison \nthe dirt, and leak into the water. This is super harmful to the wildlife and even \nus people; the U.S. discards 10 million tons per year, all of which are harmful to us.");
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end loop 1
		    while (Loop == 2) {
		        clr();
		        System.out.println("{ Why E-Waste Is Getting Worse }");
		        System.out.println("\n E-waste has been constantly getting worse, with there already being 53.6 million tons \nin 2019, and expected to hit around 74 million tons in 2030. We are also not \nhelping by making and buying new technologies every year. A solution could be to \nwait a few years when the developed tech is really advanced, and then release it, to cut \ndown on unused products.");
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 2
		    while (Loop == 3) {
		        clr();
		        System.out.println("{ What Is The ERPA }");
		        System.out.println("\n The EPRA is a non-profit organization that recycles, and contains old electronics. \nThey have successfully removed over 1 million tons from Canada, but as known \nis no where near enough to keep up with the amount thrown out. They cover 9 provinces \nin Canada and plan to try to make a change to the world.");
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 3
		    while (Loop == 4) {
		        clr();
		        System.out.println("{ What Is The OES }");
		        System.out.println("\n The OES was a non-profit organization that planned on recycling as many electronics \nas possible. They submitted a wind up plan, called Plan, but in the end shut \ndown the business, in 2021, which ended their progress, but ended the business as \na liquidity.");
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 4
		    while (Loop == 5) {
		        clr();
		        System.out.println("{ Electronic Handling Fee For Ontario }");
		        System.out.println("\n The Electronic Handling Fee is a fee put on by the provincial government to help fund \nprograms like the OES or EPRA. Each device varies on fees, from $1 for computers \nup to $28 for large displays. This program could be useful to help the EPRA \nstay in business.");
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 5
		    while (Loop == 6) {
		        clr();
		        System.out.println("{ Electronic Drop-Off Locations }");
		        System.out.println("\n The Electronic Drop-Off (EDO) is another non-profit company that has 2,500 locations \nacross Ontario that allows people to come by and drop off their electronics. \nThey estimate to have drop off locations about 30 minutes from most canadians. \nThey ensure practical and safe ways of recycling electronics too.");
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 6
		} // end loop 0
		
		if (Loop == 99) {
		    clr();
		    System.out.println("{ GoodBye! }");
		    System.out.println("\nThank you for reading! I hope you enjoyed it!");
		}
	}
}
