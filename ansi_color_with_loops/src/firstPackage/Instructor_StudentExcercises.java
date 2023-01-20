package firstPackage;

import java.util.Scanner;
public class Instructor_StudentExcercises 
{
   public static void main(String[] args)
   {
	   Scanner number=new Scanner(System.in);
	   //Multiplication table program
	   
	   System.out.println(ANSI_Colors.RED_BOLD+"What number would you like to find multiplication?");
	   
	   int user_number=number.nextInt();
	   
	   for(int num=1;num<=15;num++)
	   {
		   int multiply=user_number*num;
		   
		   System.out.println(ANSI_Colors.GREEN_BOLD +user_number+ "*" + num + "=" +multiply );
				  
	   }//for
	   
	   //Armstrong number program
	   
	   int num=1;
	   System.out.println(ANSI_Colors.CYAN_BOLD+"The following number are Armstrong numbers:");
	  
	   while(num<=500)
	   {
		   int temp=num;
		   int digit1=temp%10;
		   
		   temp=temp/10;
		   int digit2=temp%10;
		   
		   temp=temp/10;
		   int digit3=temp%10;
		   
		   if(digit1*digit1*digit1 + digit2*digit2*digit2 +digit3*digit3*digit3==num)
		   {
			  
			   System.out.println(num);
		   }//if
		   
		   num++;
	   }
   }
}
