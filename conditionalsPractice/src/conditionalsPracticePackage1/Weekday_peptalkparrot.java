package conditionalsPracticePackage1;

import java.util.*;

public class Weekday_peptalkparrot 
{

	  private String Monday="Get ready to regain your focus and push for your goals";
      private String Tuesday="You are going to get ptoductive since your task at work will done";
      private String Wednesday="A smile will be put on your face as you slide down towards the weekend";
      private String Thrusday="Your week is about turn around and make you happy";
      private String Friday="Time to reflect on what you have done throughout the week";
	  /*
	   * program name:-Weekday pep talk parrot
	   * program Description:The objective of this program is to get users to have a good start of the week by understanding the meaning of each weekday.
	   * Date created:14/1/2023
	   */
  public static void main(String[] args)
  {
	 Scanner obj=new Scanner(System.in);
	 
	 Weekday_peptalkparrot user=new Weekday_peptalkparrot ();
	 
	 System.out.println("Please enter a day of the week(Monday, Tuesday,Wednesday,Thrusday,Friday)");
	 
	 String user_response=obj.nextLine();
	 
	 switch(user_response)
	 {
	 case("Monday"):
		 System.out.println(user.Monday);
	  break;
	  
	 case("Tuesday"):
		 System.out.println(user.Tuesday);
	 break;
	 
	 case("Wednesday"):
		 System.out.println(user.Wednesday);
	 break;
	 
	 case("Thrusday"):
		 System.out.println(user.Thrusday);
	 break;
	 
	 case("Friday"):
		 System.out.println(user.Friday);
	 break;
	 
	 default:
		 System.out.println("Sorry,you have entered an incorrect weekday"); 
	 }
  }
}
