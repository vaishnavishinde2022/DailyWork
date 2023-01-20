package pets;

import java.awt.Desktop;
import java.awt.desktop.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.*;
import java.lang.Thread;
import java.util.*;

public class FlavorliciousPets_Center 
{
	static double dog_factor;
	static double MER;

	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException 
	{
		Scanner object=new Scanner(System.in);
		Scanner object2=new Scanner(System.in);
		Scanner object3=new Scanner(System.in);
		Scanner number=new Scanner(System.in);
		
		System.out.println("Would you like to initialize the system(Yes or Not)?");
        String vet_response=object.nextLine();
        
        while(vet_response.equalsIgnoreCase("Yes"))
        {
        	System.out.println(Consol_Colors.RED_UNDERLINED+"Welcome to the flavorlicious pet center");
        
           Thread.sleep(1000);
        
           System.out.println(Consol_Colors.BLUE_BRIGHT+"Please play the voki message!");
           Thread.sleep(2000);
           
           Desktop voki=Desktop.getDesktop();
           voki.browse(new URI("https://www.voki.com/site/pickup?scid=19360951&chsm=383bb4a0b1ae383504011305a2d22f91"));
       
           Thread.sleep(3000);
           System.out.println(Consol_Colors.CYAN_BOLD);
           
           System.out.println("________$$$$$$$$$");
           System.out.println("______$$_________$$");
           System.out.println("_____$_____________$");
           System.out.println("____$_______________$");
           System.out.println("___$$_______________$$");
           System.out.println("__$$_________________$$");
           System.out.println("__$_$_$$_________$$_$_$");
           System.out.println("_$__$$$$$_______$$$$$__$");
           System.out.println("_$__$$o$$_______$o$$$__$");
           System.out.println("_$__$_$$_________$$_$__$");
           System.out.println("_$__$_______________$__$");
           System.out.println("$___$_____$$$$$_____$___$");
           System.out.println("$___$_____$$$$$_____$___$");
           System.out.println("$___$$_____$$$_____$$___$");
           System.out.println("_$__$$______$______$$__$");
           System.out.println("_$__$_$__$__$__$__$_$__$");
           System.out.println("__$_$_$___$$_$$___$_$_$");
           System.out.println("___$$__$_________$__$$");
           System.out.println("______$_$$_____$$_$");
           System.out.println(Consol_Colors.GREEN_BOLD_BRIGHT);
           System.out.println("______$___$$$$$___$");
           System.out.println("______$___________$");
           System.out.println("_____$_____________$");
           System.out.println("_____$_____________$");
           System.out.println("____$$____$___$____$$");
           System.out.println("___$_$____$___$____$_$");
           System.out.println("___$_$____$___$____$_$");
           System.out.println("___$__$___$___$___$__$");
           System.out.println("___$__$___$___$___$__$");
           System.out.println(" __$___$___$___$___$___$");
           System.out.println("__$___$____$_$____$___$");
           System.out.println("___$$$$____$$$____$$$$");
           System.out.println("_______$$$$___$$$$");

           Thread.sleep(2000);
           System.out.println(Consol_Colors.RESET);
         
           System.out.println("***************************************************************************************************************************************");
           
           System.out.println(Consol_Colors.MAGENTA+" Enter the dog's name");
           String dog_name=object.nextLine();
           
           System.out.println(Consol_Colors.BLUE+" Enter the dog's breed");
           String dog_breed=object.nextLine();
        
           System.out.println(Consol_Colors.YELLOW+ "Enter the dog's age");
           int dog_age=number.nextInt();
       
           
           System.out.println(Consol_Colors.CYAN+ "Enter the dog's weight in kilogram(g)");
           double dog_weight=number.nextDouble();
        
            System.out.println("***************************************************************************************************************************************");
        
            System.out.println(Consol_Colors.RESET);
            System.out.println("***************************************************************************************************************************************");
        
            System.out.println("Resting Energy Requirement calculations(RER)");
            
            System.out.println("***************************************************************************************************************************************");
        
           System.out.println(Consol_Colors.PURPLE);
        
           System.out.println("please have a look at the factor table below and select the dog type");
           
           System.out.printf("%30s %35s %25s", "Options","Dog Type","Factore");
           System.out.println();
       
           System.out.printf("%30s %35s %25s", "A","Puppy(0-4 years)","3.0");
          
           System.out.println();
           
           System.out.printf("%30s %35s %25s", "B","Puppy(4 years adult)","2.0");
      
            System.out.println();
           
           System.out.printf("%30s %35s %25s", "C","Adult(Inactive/obese)","1.2");
                   
          System.out.println();
           
           System.out.printf("%30s %35s %25s", "D","Adult(neutered/spayed)","1.6");
        
           System.out.println();
       
           System.out.println("What is the dog's size(small,medium,large)");
           String dog_size=object2.nextLine();
           
           dog_size=dog_size.toLowerCase();
           
           if(dog_size.equals("small")|| dog_size.equals("large"))
           {
        	   double RER=Math.round(70*Math.pow(dog_weight,0.75));
               System.out.println(Consol_Colors.RED_BOLD+" Resting energy Requirements(cal/day)"+ RER);
               System.out.println("***************************************************************************************************************************************");
           
               System.out.println("Maintenance Energy Requirements Calculation(MER)"); 
               System.out.println("***************************************************************************************************************************************");
               
               System.out.println(Consol_Colors.RESET);
           
               System.out.println("What is the dog's type(enter option A to D)");
               String dog_type=object2.nextLine();
               
               if(dog_type.equals("A"))
               {
            	 dog_factor=3.0;  
               }//if
               
               else if(dog_type.equals("B"))
               {
            	 dog_factor=2.0;  
               }
               
               else if(dog_type.equals("C"))
               {
            	 dog_factor=1.2;  
               }
               
               else if(dog_type.equals("D"))
               {
            	 dog_factor=1.6;  
               }
               
               else
               {
            	   System.out.println("Sorry you have entered an incorrect option");
               }
               
               MER=RER*dog_factor;
               System.out.println(Consol_Colors.RED_BOLD+" Maintenance energy Requirements(cal/day)"+ MER);
               
           }//if
           
           else if(dog_size.equals("medium"))
           {
        	   double RER=Math.round(30* dog_weight+70);
               System.out.println(Consol_Colors.RED_BOLD+" Resting energy Requirements(cal/day)"+ RER);
               System.out.println("***************************************************************************************************************************************");
           
               System.out.println("Maintenance Energy Requirements Calculation(MER)"); 
               System.out.println("***************************************************************************************************************************************");
               
               System.out.println(Consol_Colors.RESET);
           
               System.out.println("What is the dog's type(enter option A to D)");
               String dog_type=object2.nextLine();
               
               if(dog_type.equals("A"))
               {
            	 dog_factor=3.0;  
               }//if
               
               else if(dog_type.equals("B"))
               {
            	 dog_factor=2.0;  
               }
               
               else if(dog_type.equals("C"))
               {
            	 dog_factor=1.2;  
               }
               
               else if(dog_type.equals("D"))
               {
            	 dog_factor=1.6;  
               }
               
               else
               {
            	   System.out.println("Sorry you have entered an incorrect option");
               }
               
               MER=RER*dog_factor;
               System.out.println(Consol_Colors.RED_BOLD+" Maintenance energy Requirements(cal/day)"+ MER);
               
           }//if
           
           else
           {
        	 System.out.println(Consol_Colors.RED_BRIGHT+ "Sorry you only need to enter options(small,medium,large)");  
           }
           
           System.out.println("Would you like to initialize the system(Yes or Not)?");
            vet_response=object3.nextLine();
           
            if(vet_response.equalsIgnoreCase("No"))
            {
            	System.out.println(Consol_Colors.PURPLE_BOLD+"Okay,have a nice day!");
            }
           
        }//while
	}//main

}//class
