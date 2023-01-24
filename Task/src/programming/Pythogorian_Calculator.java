package programming;

import java.util.*;
import java.lang.Math;

public class Pythogorian_Calculator {

	public static void main(String[] args)
	{
		Scanner number=new Scanner(System.in);
		Scanner text=new Scanner(System.in);   
	
		 System.out.println(ANSI_Colors.RED_BRIGHT);
		
		 System.out.println("|\"");
		System.out.println("| \"");
		System.out.println("|  \"");
		System.out.println("|   \"");
		System.out.println("|    \"");
		System.out.println("|     \"");
		System.out.println("|      \"");
		System.out.println("|       \"");
		System.out.println("|        \"");
		System.out.println("|         \"");
		System.out.println("|          \"");
		System.out.println("|           \"");
		System.out.println("|            \"");
		System.out.println("|             \"");
		System.out.println("|              \"");
		System.out.println("|               \"");
		System.out.println("|________________\"");
		System.out.println("************");
	
	
	 System.out.println(ANSI_Colors.RESET+"Are you ready to begin(Yes or No)?");
	 String response=text.nextLine();
	 
	 while(response.equalsIgnoreCase("Yes"))
	 {
		 System.out.println(ANSI_Colors.BLUE_BOLD_BRIGHT+"Which side of the rigth angle triangle would you like to find?\nA.Hypotenuse\nB.Perpendicular\nC.Opposite\n"); 
	     String side_choice=text.nextLine();
	     
	     switch(side_choice)
	     {
	     case "A":
	    	 System.out.println(ANSI_Colors.RESET+"Enter the length of the perpendicular side of the rigth angle");
	         double perpen_len=number.nextDouble();
	     
	         System.out.println("Enter the length of opposite side of the rigth angle");
	         double opp_len=number.nextDouble();
	         
	         double hypot=Math.hypot(perpen_len, opp_len);
	         System.out.println(ANSI_Colors.GREEN_BOLD+"The length of hypotenuse is "+hypot); 
	         
	         break;
	         
	     case "B":
	    	 System.out.println(ANSI_Colors.RESET+"Enter the length of the hypotenuse of the rigth angle triangle");
	         double hypo_len=number.nextDouble();
	         
	         System.out.println("Enter the length of opposite side of the rigth angle triangle");
	         double opp_len2=number.nextDouble();
	         
	         double perpen_len2=Math.sqrt(Math.pow(hypo_len, 2)-Math.pow(opp_len2,2));
	        
	         System.out.println("length of perpendicular side is "+perpen_len2);
	         
	         break;
	         
	     case "C":
	    	 System.out.println(ANSI_Colors.RESET+"Enter the length of the hypotenuse of the rigth angle triangle");
	         double hypo_len2=number.nextDouble();
	         
	         System.out.println("Enter the length of the perpendicular side of the rigth angle triangle");
	         double perpen_len3=number.nextDouble();
	         
	         double calculate_opplen =Math.sqrt(Math.pow(hypo_len2, 2)-Math.pow(perpen_len3,2));
		        
	         System.out.println("length of perpendicular side is "+calculate_opplen);
	         
	         break;
	       
	         default:
	        	 System.out.println(ANSI_Colors.RED_BOLD+"Sorry,you have entered en incorrect option!"); 
	     }//switch
	 
	     System.out.println(ANSI_Colors.RESET+"Are you ready to begin(Yes or No)?");
		  response=text.nextLine();
	 }//while
	 
	 if(response.equalsIgnoreCase("No"))
	 {
		 System.out.println("Okay,have a great day!"); 
	 }
	
	}

}
