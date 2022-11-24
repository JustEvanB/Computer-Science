/******************************************************************************

Choose Your Own Adventure!
This program will be a story about trying to escape a haunted house!
Evan Brundritt
02/28/22

*******************************************************************************/
import java.util.Scanner;  // Imports

public class Main
{
	public static void main(String[] args) {
	    
	    String Response1;  // Establish Strings
	    String Response2;
	    String Response3;
	    String Response4;
	    String Response5;
	    String Response6;
	    
	    Scanner input = new Scanner(System.in);  // Establish Scanner
	    
	    System.out.println("You wake up in a torn up master bedroom, everything is covered in old rotten wood.");  // Beggining of Response 1
	    System.out.println("Theres 2 old doors, one looks to to lead to a washroom, the other is too dark to see through.");
	    System.out.println("You wonder what your next move will be?");
	    System.out.println("\nA - Washroom Door");
	    System.out.println("B - Dark Door");
	    System.out.print("Your Choice : ");
	    Response1 = input.next();
	    
	    if (Response1.equals("A") || Response1.equals("a")){  // Response 1A - 2
	        
	        System.out.print("\033[H\033[2J");
	        System.out.println("You open the door but quickly notice it's not a washroom- its a dark staircase that leads down");
	        System.out.println("you start going down, the creaky stairs, and it just keeps going what feels like forever");
	        System.out.println("You walk into a moldy door, but you hear cries behind it");
	        System.out.println("Do you go through?");
	        System.out.println("\nA - Go through the door towards the cries");
	        System.out.println("B - Turn away");
	        System.out.print("Your Choice : ");
	        Response2 = input.next();
	        
	        if (Response2.equals("A") || Response2.equals("a")){ // Response 2A going to 3
	            
	            System.out.print("\033[H\033[2J");
	            System.out.println("You slowly turn the door knob, but the door creaks so loudly");  // Beggining of Response3
	            System.out.println("You hear the crying stop, but are greeted by a tall blond figure");
	            System.out.println("She - or it, screams to leave it alone.");
	            System.out.println("\nA - Shove past it");
	            System.out.println("B - LISTEN!");
	            System.out.print("Your Choice : ");
	            Response3 = input.next();
	            
	            if (Response3.equals("A") || Response3.equals("a")){ // Response 3A going to death
	                
	                System.out.print("\033[H\033[2J");
	                System.out.println("The figure grabs you as you run past, slamming you into the wall"); // Death
	                System.out.println("It reaches its thick hand through you, and tears your lungs out of your body");
	                System.out.println("You die a slow painful death");
	                
	            } else if (Response3.equals("B") || Response3.equals("b")){  // Response 3B going to death
	                
	                System.out.print("\033[H\033[2J");
	                System.out.println("You slowly creep away, but you see a tall slim creature on the stairs");  // Death
	                System.out.println("It stole my face, it cried- it's voice seemingly coming from inside your head");
	                System.out.println("The creature is on all 4's but starts climbing on the wall towards you");
	                System.out.println("It jumps at you, much like a spider, impaling you, and leaving you dead");
	                
	            } // End of Answer Response 3
	            
	        } else if (Response2.equals("B") || Response2.equals("b")){ // Response 2B going to Death
	            
	            System.out.print("\033[H\033[2J");
	            System.out.println("You go back to the master bedroom, and finally decide to go through the dark door");  // Death
	            System.out.println("You open the door, to see a short figure with blonde curly hair");
	            System.out.println("It screams 'IT STOLE MY FACE' it's voice inside your mind");
	            System.out.println("It runs at you and renders you unconscious.");
	            System.out.println("You wont be waking up...");
	            
	        } // End of Response 2
	        
	    } else if (Response1.equals("B") || Response1.equals("b")){ // Response 1B going to 4
	        
	        System.out.print("\033[H\033[2J");
	        System.out.println("You open the dark door, it appears to be a living room");
	        System.out.println("The door locks behind you, and out of the corner of your eye-");
	        System.out.println("you see a short ghost with curly hair walk around the room then through a door you almost missed");
	        System.out.println("\nA - Follow the ghost");
	        System.out.println("B - try to escape through a window (large fall)");
	        System.out.print("Your Choice : ");
	        Response4 = input.next();
	        
	        if (Response4.equals("A") || Response4.equals("a")){  // Response 4A going to Death
	            
	            System.out.print("\033[H\033[2J");
	            System.out.println("you walk through the creaky door, to see the ghost freaking out");
	            System.out.println("You wonder why, as you see a creature on 4 legs chasing it");
	            System.out.println("You try to hide but it saw you, and goes after you instead");
	            System.out.println("It pins you to the ground and it tears the flesh off your face until you're unconscious");
	            System.out.println("You are dead.");
	            
	        }  else if (Response4.equals("B") || Response4.equals("b")){ // Response 4B going to Response 5
	            
	            System.out.print("\033[H\033[2J");
	            System.out.println("You grab whatever you think is good enough to break a window off the ground");
	            System.out.println("Although the small chunk of wood isnt enough, you decide to just punch through it");
	            System.out.println("Although it cuts your hand greatly.");
	            System.out.println("You can feel a monster watching you : ");
	            System.out.println("\nA - JUMP!");
	            System.out.println("B - HIDE!");
	            System.out.println("Your Choice : ");
	            Response5 = input.next();
	            
	            if (Response5.equals("A") || Response5.equals("a")){ // Response 5A going to death
	                
	                System.out.print("\033[H\033[2J");
	                System.out.println("You leap out the window, you make it about 5 feet");
	                System.out.println("Then you feel a tentacle on your leg, it pulls you back up");
	                System.out.println("Then changes form to hang you by your neck");
	                System.out.println("You suffocated");
	                
	            } else if (Response5.equals("B") || Response5.equals("b")){ // Response 5B going to Response 6
	                
	                System.out.print("\033[H\033[2J");
	                System.out.println("You duck into a hole in the wall");
	                System.out.println("you see a quick monster with a large tentacle coming out it's mouth");
	                System.out.println("It looks out for a minute then turns away and leaves");
	                System.out.println("Do you go for it?");
	                System.out.println("\nA - JUMP!");
	                System.out.println("B - KEEP HIDING!");
	                System.out.println("Your Choice : ");
	                Response6 = input.next();
	                
	                if (Response6.equals("A") || Response6.equals("a")){ // Response 6A going to Victory!
	                 
	                 System.out.print("\033[H\033[2J");
	                 System.out.println("You feel it's finally safe to leave, and you sprint and jump out the window");
	                 System.out.println("You leap into the void and you wake up in your bedroom, safe at last");
	                 System.out.println("But something feels off...");
	                    
	                } else if (Response6.equals("B") || Response6.equals("b")){ // Response 6B going to death
	                    
	                    System.out.print("\033[H\033[2J");
	                    System.out.println("You continue hiding, you feel as if you can still hear it dragging along the floor");
	                    System.out.println("It suddenly starts coming closer until it pops into your view");
	                    System.out.println("It grabs you and tears off your skin with it's extremely powerful tentacle");
	                    System.out.println("You are dead.");
	                    
	                } // End of Response 6
	                
	            } // End of Response 5
	            
	        } // End of Response 4
	        
	    } // End of Response 1
	    
	}
}
