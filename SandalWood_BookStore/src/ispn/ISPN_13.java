package ispn;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ISPN_13
{
    static int multiply;
    static int sum_odd=0;
    static int sum_even=0;
    static int track=0;
    static int sum_odd1=0;
    static int sum_even1=0;
    static int track1=0;
    static int multiply1;
    
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException 
	{
		Scanner object=new Scanner(System.in);
		
		System.out.println("Are you ready to begin(Yes or No)?");
		String user_response=object.nextLine();
		
		if(user_response.equals("No"))
		{
			System.out.println("Thank you,Good bye");
			System.exit(0);
		}
		
		do
		{
		   File file=new File("study_music.wav");
		   AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
		   
		   Clip clip=AudioSystem.getClip();
		   clip.open(audioStream);
		   clip.start();
		   
		   System.out.println(Consol_Colors.YELLOW_BOLD);
		   
		   System.out.println("        .--.           .---.        .-.");
		   System.out.println("    .---|--|   .-.     | A |  .---. |~|    .--.");
		   System.out.println(" .--|===|Ch|---|_|--.__| S |--|:::| |~|-==-|==|---.");
		   System.out.println(" |%%|NT2|oc|===| |~~|%%| C |--|   |_|~|CATS|  |___|-.");
		   System.out.println(" |  |   |ah|===| |==|  | I |  |:::|=| |    |GB|---|=|");
		   System.out.println(" |  |   |ol|   |_|__|  | I |__|   | | |    |  |___| |");
		   System.out.println(" |~~|===|--|===|~|~~|%%|~~~|--|:::|=|~|----|==|---|=|");
		   System.out.println(" ^--^---'--^---^-^--^--^---'--^---^-^-^-==-^--^---^-'");
		
		   System.out.println(Consol_Colors.RESET);
		   
		   System.out.println("Enter the 12 digit ISBN number");
		   String ISBN=object.nextLine();
		   
		   if(ISBN.length()>12 || ISBN.length()<12)
		   {
			   System.out.println("You have entered an incorrect ISBN number");
		        System.exit(0);
		   }
		    //Re-calculating ISBN 13 check digit
		   else
		   {
			   for(int i=0;i<ISBN.length();i++)
			   {
				  char s=ISBN.charAt(i);
				  track=track+1;
				  
				  if(track%2!=0)
				  {
					  sum_odd = sum_odd+Character.getNumericValue(s);
				  }
				  else if(track%2==0)
				  {
					  multiply = 3*(sum_even=sum_even+Character.getNumericValue(s));
				  }
			   }//for
			   int remainder=(sum_odd+multiply)%10;
			   
			   int check_digit=10-remainder;
			   
			  System.out.println(Consol_Colors.BLUE_BOLD_BRIGHT+"The check digit is:"+check_digit);
			   
		   }
		
		   //verifying the ISBN 13 check digit
		   
		   System.out.println("Enter the ISBN number with the 13th check digit");
		   String ISBN_13=object.nextLine();
		   
		   if(ISBN_13.length()>13 || ISBN_13.length()<13)
				   
		   {
			   System.out.println("You have entered an incorrect ISBN number");
		        System.exit(0);
		   }
		   
		   for(int i=0;i<ISBN_13.length();i++)
		   {
			  char s=ISBN_13.charAt(i);
			  track1=track1+1;
			  
			  if(track1%2!=0)
			  {
				  sum_odd1=sum_odd1+Character.getNumericValue(s);
			  }
			  else if(track%2==0)
			  {
				  multiply1=3*(sum_even1=sum_even1+Character.getNumericValue(s));
			  }
		   }//for
		   int remainder1=(sum_odd1+multiply1)%10;
		   
		  if(remainder1==0)
		  {
			System.out.println(Consol_Colors.BLUE_BOLD_BRIGHT+"The ISBN number is valid");  
		  }
		  
		  else
		  {
			  System.out.println(Consol_Colors.BLUE_BOLD_BRIGHT+"The ISBN number is invalid");   
		  }
		   
		 System.out.println("Are you ready to begin(Yes or No)");
		  user_response=object.nextLine();
		  System.out.println(Consol_Colors.GREEN_BOLD_BRIGHT+"The music will stop from here!");
		   clip.stop();
		   
		   sum_odd=0;
		   sum_even=0;
		   sum_odd1=0;
		   sum_even1=0;
		   
		}while(user_response.equals("Yes"));
		if(user_response.equals("No"))
		{
			System.out.println("Okay, thank you!");
			System.exit(0);
		}

	}

}
