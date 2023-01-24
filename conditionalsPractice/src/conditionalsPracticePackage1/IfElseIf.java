package conditionalsPracticePackage1;

import java.util.*;
public class IfElseIf 
{
  public static void main(String[] args)
  {
	Scanner obj=new Scanner(System.in);
	
	System.out.println("where would you like to travel to?");
	String user_response=obj.nextLine();
	
	if(user_response.equals("Jardon"))
	{
		System.out.println("you should definitely visit petra,it's one of the world's seven wonders");
		
	}
	
	else if(user_response.equals("Mexico"))
	{
		System.out.println("Teotihuacan,is an architectural site to explore");	
	}
	
	else
	{
		System.out.println("Explore the blue city called,Tetouan in Morocco");
		
	}
  }
}
