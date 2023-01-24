package conditionalsPracticePackage1;

import java.util.*;
public class NestedIf 
{
  public static void main(String[] args)
  {
	 Scanner obj=new Scanner(System.in); 
	 
	 NestedIf person=new NestedIf();
	 
	 String i_wanttoeat="";
	 String i_wanttodrink="";
	 
	 System.out.println("what would you like to eat today?");
	 i_wanttoeat=obj.nextLine();
	 
	 System.out.println("what would you like to drink today?");
	 i_wanttodrink=obj.nextLine();
	 
	 if(i_wanttoeat.equals("spaghetti with meatballs"))
	 {
		 if(i_wanttodrink.equals("Freschezza a GOGO"))
		 {
			 System.out.println("you are craving some indian cuisine"); 
		 }
	 }
  }
}
