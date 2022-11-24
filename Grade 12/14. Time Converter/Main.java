/******************************************************************************

Time Converter
This program converts time
Evan Brundritt
10/06/22

*******************************************************************************/
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Formatter;

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
    public static void HoursMinutes(double n1) {
        double CTime = n1 * 60;
        clr();
        System.out.println("{ TIME CONVERTER }");
        System.out.println("\nThat Would Be " + CTime + " Minutes.");
    }
    public static void DaysHours(double n1) {
        double CTime = n1 * 24;
        clr();
        System.out.println("{ TIME CONVERTER }");
        System.out.println("\nThat Would Be " + CTime + " Hours.");
    }
    public static void MinutesHours(double n1) {
        double CTime = n1 / 60;
        clr();
        System.out.println("{ TIME CONVERTER }");
        System.out.println("\nThat Would Be " + CTime + " Hours.");
    }
    public static void HoursDay(double n1) {
        double CTime = n1 / 24;
        clr();
        System.out.println("{ TIME CONVERTER }");
        System.out.println("\nThat Would Be " + CTime + " Days.");
    }
    
    public static void main(String[] args) {
        int Answer;
        double Time;
        double CTime;
        int Loop = 0;
        clr();

        Scanner input = new Scanner (System.in);
        while (Loop == 0){
        System.out.println("{ TIME CONVERTER }");
        System.out.println("\n{1}-- Hours To Minutes ");
        System.out.println("{2}-- Days To Hours ");
        System.out.println("{3}-- Minutes To Hours ");
        System.out.println("{4}-- Hours To Days ");
        System.out.println("{99}-- Exit ");
        System.out.print("\ninput~# ");
        Answer = input.nextInt();
        
        clr();
        
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
        if (Answer == 99) {
            Loop = 99;
        }
        
        while (Loop == 1) {
            clr();
            System.out.println("{ TIME CONVERTER }");
            System.out.print("\nInput The Hours : ");
            Time = input.nextDouble();
            
            HoursMinutes(Time);
            
            wait(3);
            clr();
            try {
                Loop = 0;
            } catch (Exception e) {
                System.out.println("You must've broken something to get here");
            }
        } // end loop 1
        
        while (Loop == 2) {
            clr();
            System.out.println("{ TIME CONVERTER }");
            System.out.print("\nInput The Days : ");
            Time = input.nextDouble();
            
            DaysHours(Time);
            
            wait(3);
            clr();
            try {
                Loop = 0;
            } catch (Exception e) {
                System.out.println("You must've broken something to get here");
            }
        }
        
        while (Loop == 3) {
            clr();
            System.out.println("{ TIME CONVERTER }");
            System.out.print("\nInput The Minutes : ");
            Time = input.nextDouble();
            
            MinutesHours(Time);
            
            wait(3);
            clr();
            try {
                Loop = 0;
            } catch (Exception e) {
                System.out.println("You must've broken something to get here");
            }
        }
        
        while (Loop == 4) {
            clr();
            System.out.println("{ TIME CONVERTER }");
            System.out.print("\nInput The Hours : ");
            Time = input.nextDouble();
            
            HoursDay(Time);
            
            wait(3);
            clr();
            try {
                Loop = 0;
            } catch (Exception e) {
                System.out.println("You must've broken something to get here");
            }
        }
        } // end loop 0
    }
}