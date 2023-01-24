package currency;
import java.util.*;

public class Exchanger_Program 
{
	/*
	 * 1 pound = 161.20 Yen
	 * 
	 */

	public static void main(String[] args) 
	{
		Scanner object=new Scanner(System.in);
		
		Scanner number=new Scanner(System.in);
		
		System.out.println(ANSI_Colors.RED);
		System.out.println("#####  #     # ######  ######  #######  #     #  #####  #     #"); 
		System.out.println("#     # #     # #     # #     # #       ##    # #     #  #   #");  
		System.out.println("#       #     # #     # #     # #       # #   # #         # #");   
		System.out.println("#       #     # ######  ######  #####   #  #  # #          #");    
		System.out.println("#       #     # #   #   #   #   #       #   # # #          #");    
		System.out.println("#     # #     # #    #  #    #  #       #    ## #     #    #");    
		System.out.println("#####   #####  #     # #     # #######  #     #  #####     #");    
		
		System.out.println(ANSI_Colors.BLUE_UNDERLINED+"Welcome to the currency exchanager system");
	 
		System.out.println(ANSI_Colors.GREEN+"What would you like to convert?\nA.Pounds to Yen\nB. Yen to Pounds");
	
	   String user_response=object.nextLine();
	   
	   if(user_response.equals("A"))
	   {
		   System.out.println("How much would you like to convert to Yen?");
	  
		   double pound_toyen=number.nextDouble();
		   double conver_poundtoyen=pound_toyen * 161.20;
	   
		   System.out.println(ANSI_Colors.RESET+"The conversion from pound to yen is:"+conver_poundtoyen);
	   }//if
	   
	   else if(user_response.equals("B"))
	   {

		   System.out.println(ANSI_Colors.CYAN_BRIGHT+"How much would you like to convert to pounds?");
	    
		   double yen_topounds=number.nextDouble();
		   double conver_yentopound=yen_topounds/161.20;
	       
		   System.out.println(ANSI_Colors.RESET+"The conversion from yen to pound is:"+conver_yentopound);
	   }
	
	   else
	   {
		   System.out.println(ANSI_Colors.RED_BRIGHT+"Sorry you have entered an incorrect option!");
	   }
	
	}

}
