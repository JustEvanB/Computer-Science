/******************************************************************************

My Methods Assignment
This program lets the user choose multiple customized methods
04/19/22
Evan Brundritt

*******************************************************************************/
import java.lang.Math;
import java.util.Scanner;

public class Main
{
	
	public static void clr() {
	    System.out.print("\033[H\033[2J");
	}
	
	public static void MultAndOut (double n1, double n2) {
	    double Product = n1 * n2;
	    System.out.print("The product is : " + Product);
	} // MultAndOut
	
	public static void Cube (int n1) {
	    int Product = n1 * n1 * n1;
	    System.out.print("The product is : " + Product);
	} // Cubed
	
	public static void DivAndOut (double n1, double n2) {
	    double Dividend = n1 / n2;
	    System.out.print("The speed is : " + Dividend);
	}
	
	public static void main(String[] args) {
		
		int Loop = 0;
		int [ ] Value = new int [4];
		int Answer;
		
		Scanner input = new Scanner (System.in);
		
		while (Loop == 0) {
		    clr();
		    System.out.println("{ My Methods Assignment }");
		    System.out.println("\n{1}-- Find Perimeter, Area, Or Volume Of A Cube");
		    System.out.println("{2}-- Finding Averages Of A Number");
		    System.out.println("{3}-- Finding Speed Or Acceleration");
		    System.out.println("{4}-- Determine If A Number Is Prime");
		    System.out.println("{5}-- Determine The Factorial Of A Number");
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
		    if (Answer == 99) {
		        Loop = 99;
		    }
		    
		    while (Loop == 1) {
		        clr();
		        System.out.println("{ Find Perimeter, Area, Or Volume Of A Cube }");
		        System.out.println("\n{1}-- Perimeter Of A Cube");
		        System.out.println("{2}-- Area Of A Cube");
		        System.out.println("{3}-- Volume Of A Cube");
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 1) {
		            Loop = 6;
		        }
		        if (Answer == 2) {
		            Loop = 7;
		        }
		        if (Answer == 3) {
		            Loop = 8;
		        }
		        if (Answer == 99) {
		            Loop = 0;
		        }
		        
		        while (Loop == 6) {
		            clr();
		            System.out.println("{ Perimeter Of A Cube }");
		            System.out.print("\nInput A Side : ");
		            Value[1] = input.nextInt();
		            
		            clr();
		            System.out.println("{ Perimeter Of A Cube }\n");
		            MultAndOut(Value[1], Value[1]);
		            System.out.println("\n\n{99}-- Go Back");
		            System.out.print("\ninput~# ");
		            Answer = input.nextInt();
		            
		            if (Answer == 99) {
		                Loop = 1;
		            }
		            
		        } // end Loop 6
		        
		        while (Loop == 7) {
		            clr();
		            System.out.println("{ Area Of A Cube }");
		            System.out.print("\nInput A Side : ");
		            Value[1] = input.nextInt();
		            
		            clr();
		            System.out.println("{ Area Of A Cube }\n");
		            int Product1 = Value[1] * Value[1] * 6;
		            System.out.print("The product is : " + Product1);
		            System.out.println("\n\n{99}-- Go Back");
		            System.out.print("\ninput~# ");
		            Answer = input.nextInt();
		            
		            if (Answer == 99) {
		                Loop = 1;
		            }
		            
		        } // end Loop 7
		        
		        while (Loop == 8) {
		            clr();
		            System.out.println("{ Volume Of A Cube }");
		            System.out.print("\nInput A Side : ");
		            Value[1] = input.nextInt();
		            
		            clr();
		            System.out.println("{ Volume Of A Cube }\n");
		            Cube(Value[1]);
		            System.out.println("\n\n{99}-- Go Back");
		            System.out.print("\ninput~# ");
		            Answer = input.nextInt();
		            
		            if (Answer == 99) {
		                Loop = 1;
		            }
		        } // end Loop 8
		    } // end Loop 1
		    
		    while (Loop == 2) {
		        
		        double AvNum = 0;
		        
		        clr();
		        System.out.println("{ Finding Averages Of A Number }");
		        System.out.print("\nHow many numbers would you like to average : ");
		        int ForLoop = input.nextInt();
		        int [ ] Numbers = new int [100];
		        
		        for (int i = 1; i <= ForLoop; i++) {
		            clr();
		            System.out.println("{ Finding Averages Of A Number }");
		            System.out.print("\nNumber " + i + " to average : ");
		            Numbers[i] = input.nextInt();
		            AvNum = AvNum + Numbers[i];
		        }
		        
		        
		        AvNum = AvNum / ForLoop;
		        
		        clr();
		        System.out.println("{ Finding Averages Of A Number }");
		        System.out.println("\nThe Average is : " + AvNum);
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		        
		    } // end Loop 2
		    
		    while (Loop == 3) {
		        clr();
		        System.out.println("{ Finding Speed Or Acceleration }");
		        System.out.println("\n{1}-- Finding Speed");
		        System.out.println("{2}-- Finding Acceleration");
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 1) {
		            Loop = 9;
		        }
		        if (Answer == 2) {
		            Loop = 10;
		        }
		        if (Answer == 99) {
		            Loop = 0;
		        }
		        
		        while (Loop == 9) {
		            clr();
		            double Distance;
		            double Time;
		            System.out.println("{ Finding Speed }");
		            System.out.print("\nEnter Distance (m) : ");
		            Distance = input.nextDouble();
		            
		            clr();
		            System.out.println("{ Finding Speed }");
		            System.out.print("\nEnter Time (s) : ");
		            Time = input.nextDouble();
		            
		            clr();
		            System.out.println("{ Finding Speed }\n");
		            DivAndOut(Distance, Time);
		            System.out.println(" Meters per second");
		            System.out.println("\n\n{99}-- Go Back");
		            System.out.print("\ninput~# ");
		            Answer = input.nextInt();
		            
		            if (Answer == 99) {
		                Loop = 3;
		            }
		        } // end Loop 9
		        
		        while (Loop == 10) {
		            clr();
		            System.out.println("{ Finding Acceleration }");
		            double Change;
		            double Time;
		            System.out.print("\nEnter Change In Velocity (m/s) : ");
		            Change = input.nextDouble();
		            
		            clr();
		            System.out.println("{ Finding Acceleration }");
		            System.out.print("\nEnter Time To Accelerate (s) : ");
		            Time = input.nextDouble();
		            
		            clr();
		            System.out.println("{ Finding Acceleration }");
		            DivAndOut(Change, Time);
		            System.out.println(" meters per second");
		            System.out.println("\n{99}-- Go Back");
		            System.out.print("\ninput~# ");
		            Answer = input.nextInt();
		            
		            if (Answer == 99) {
		                Loop = 3;
		        }
		    } // end Loop 10
		    } // end Loop 3
		    
		    while (Loop == 4) {
		        clr();
		        System.out.println("{ Determine If A Number Is Prime }");
		        System.out.print("\nEnter the number to determine : ");
		        Value[1] = input.nextInt();
		        boolean check = false;
		        for (int i = 2; i <= Value[1] / 2; ++i) {
		            if (Value[1] % i == 0) {
		                check = true;
		            }
		        }
		        if (!check) {
		            clr();
		            System.out.println("{ Determine If A Number Is Prime }");
		            System.out.println("\nYour number is a prime number");
		        } else {
		            clr();
		            System.out.println("{ Determine If A Number Is Prime }");
		            System.out.println("\nYour number isn't a prime number");
		        }
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 4
		    
		    while (Loop == 5) {
		        clr();
		        System.out.println("{ Determine If A Number Is Factorial }");
		        int fact = 1;
		        System.out.print("\nWhat number would you like to use : ");
		        Value[1] = input.nextInt();
		        
		        for (int i = 1; i <= Value[1]; i++) {
		            fact = fact * i;
		        }
		        
		        clr();
		        System.out.println("{ Determine If A Number Is Factorial }");
		        System.out.println("\nThe factorial of " + Value[1] + " is : " + fact);
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		    } // end Loop 5
		    
		    if (Loop == 99) {
		        clr();
		        System.out.println("{ Good Bye! }");
		        System.out.println("\nThank you for using my program :)");
		        System.out.println("Come back soon");
		    } // end Loop 99
		    
		    } // end Loop 0
		
	}
}
