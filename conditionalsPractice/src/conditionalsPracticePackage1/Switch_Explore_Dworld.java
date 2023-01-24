package conditionalsPracticePackage1;

import java.util.*;

public class Switch_Explore_Dworld 
{
  public static void main(String[]args)
  {
	 Scanner obj=new Scanner(System.in);
	 
	 System.out.println("which high level programming language would like to learn\nA.Java\nB.Python?");
	 
	 String user_response=obj.nextLine();
	 
	 switch(user_response)
	 {
	  case("A"):
		  System.out.println("You have choosen to learn java programming language:");
	   break;
	   
	  case("B"):
		  System.out.println("You have choosen to learn python programming language:");
	  break;
	  
	  default:
		  System.out.println("The option you have choosen does not exist:");
	 }
  }
}
