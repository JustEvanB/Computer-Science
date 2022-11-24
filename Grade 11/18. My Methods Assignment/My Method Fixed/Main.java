/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.lang.Math;
import java.util.Scanner;

public class Main
{
	
	public static void FactandOut (int n1) {
	    Scanner input = new Scanner (System.in);
	    int fact = 1;
		System.out.print("\nWhat number would you like to use : ");
		n1 = input.nextInt();
		        
		for (int i = 1; i <= n1; i++) {
		  fact = fact * i;
		 }
		        
		 clr();
		 System.out.println("{ Determine If A Number Is Factorial }");
		 System.out.println("\nThe factorial of " + n1 + " is : " + fact);
	}
	
	public static void PrimeandOut (int n1) {
	    Scanner input = new Scanner (System.in);
	    boolean check;
		check = false;
		for (int i = 2; i <= n1 / 2; ++i) {
		  if (n1 % i == 0) {
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
	}
	
	public static void AccandOut (double n1, double n2) { // n1 is Change, n2 is Time
		n1 = n1 / n2;
		System.out.println("The Acceleration is : " + n1 + " Meters per second");
	}
	
	public static void SpeedandOut (double n1, double n2) { // n1 Distance, n2 Time
	Scanner input = new Scanner (System.in);
		
		clr();
		System.out.println("{ Finding Speed }\n");
		n1 = n1 / n2;
		System.out.println("The speed is : " + n1 + " Meters per second");
		
	}
	
	public static void AvandOut (int n1, double AvNum) {
	    
	    Scanner input = new Scanner (System.in);
	    int [ ] Numbers = new int [100];
	    for (int i = 1; i <= n1; i++) {
		clr();
		System.out.println("{ Finding Averages Of A Number }");
		System.out.print("\nNumber " + i + " to average : ");
		Numbers[i] = input.nextInt();
		AvNum = AvNum + Numbers[i];
		clr();
		System.out.println("{ Finding Averages Of A Number }");
		System.out.println("\nThe Average is : " + AvNum);
		}
		        
		        
	    AvNum = AvNum / n1;
	}
	
	public static void AreaandOut (int n1) {
	    int Product = n1 * n1 * 6;
	    System.out.print("The product is : " + Product);
	} // Cubed
	
	public static void PeriandOut (int n1) {
	    int Product = n1 * 12;
	    System.out.print("The perimeter is : " + Product);
	} // Cubed
	
	public static void CubeandOut (int n1) {
	    int Product = n1 * n1 * n1;
	    System.out.print("The product is : " + Product);
	} // Cubed
	
	public static void clr() {
	    System.out.print("\033[H\033[2J");
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int Loop = 0;
		int Answer;
		int [ ] Value = new int [4];
		
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
		            System.out.print("\nInput a side of the cube (cm) : ");
		            Value[1] = input.nextInt();
		            
		            clr();
		            System.out.println("{ Perimeter Of A Cube }\n");
		            PeriandOut(Value[1]);
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
		            System.out.print("\nInput a side of the cube (cm) : ");
		            Value[1] = input.nextInt();
		            
		            clr();
		            System.out.println("{ Area Of A Cube }\n");
		            AreaandOut(Value[1]);
		            System.out.println("\n\n{99}-- Go Back");
		            System.out.print("\ninput~# ");
		            Answer = input.nextInt();
		            
		            if (Answer == 99) {
		                Loop = 1;
		            }
		        }
		        while (Loop == 8) {
		            clr();
		            System.out.println("{ Area Of A Cube }");
		            System.out.print("\nInput a side of the cube (cm) : ");
		            Value[1] = input.nextInt();
		            
		            clr();
		            System.out.println("{ Area Of A Cube }\n");
		            CubeandOut(Value[1]);
		            System.out.println("\n\n{99}-- Go Back");
		            System.out.print("\ninput~# ");
		            Answer = input.nextInt();
		            
		            if (Answer == 99) {
		                Loop = 1;
		            }
		        }
		    } // end Loop 1
		    
		    while (Loop == 2) {
		        clr();
		        double AvNum = 0;
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
		            System.out.println("{ Finding Speed }");
		            System.out.print("\nInput Distance (M) : ");
		            double Distance = input.nextDouble();
		            
		            clr();
		            System.out.println("{ Finding Speed }");
		            System.out.print("\nInput Time (S) : ");
		            double Time = input.nextDouble();
		            
		            clr();
		            System.out.println("{ Finding Speed }");
		            System.out.println("\n");
		            SpeedandOut(Distance, Time);
		            System.out.println("\n\n{99}-- Go Back");
		            System.out.print("\ninput~# ");
		            Answer = input.nextInt();
		            
		            if (Answer == 99) {
		                Loop = 0;
		        }
		        
		        } // end Loop 9
		        
		        while (Loop == 10) {
		            clr();
		            System.out.println("{ Finding Acceleration }");
		            System.out.print("\nInput Change In Velocity (M/S) : ");
		            double Change = input.nextDouble();
		            
		            clr();
		            System.out.println("{ Finding Acceleration }");
		            System.out.print("\nInput Time To Accelerate (S) : ");
		            Double Time = input.nextDouble();
		            
		            clr();
		            System.out.println("{ Finding Acceleration }\n");
		            AccandOut(Change, Time);
		            
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
		        System.out.println("{ Determining Prime }");
		        System.out.print("\nWhat Number Would You Like To Find Prime : ");
		        Answer = input.nextInt();
		        
		        PrimeandOut(Answer);
		        System.out.println("\n\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		        
		        
		    } // end Loop 4
		    
		    while (Loop == 5) {
		        clr();
		        System.out.println("{ Determining Factorial }");
		        FactandOut(Answer);
		        
		        System.out.println("\n{99}-- Go Back");
		        System.out.print("\ninput~# ");
		        Answer = input.nextInt();
		        
		        if (Answer == 99) {
		            Loop = 0;
		        }
		        
		    }
		    
		    if (Loop == 99) {
		        clr();
		        System.out.println("{ Goodbye! }");
		        System.out.println("\nThank you for using my program! \nSee you later!");
		    }
		    
		} // end loop 0
		
	}
}
