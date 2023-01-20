package firstPackage;

import java.util.*;

public class Excercises {

	public static void main(String[] args) 
	{
		Scanner excercise=new Scanner(System.in);
		//find the sum of two numbers- do while loop
		
		System.out.println("Do you want to continue(Yess or No)?");
		String response=excercise.nextLine();
		
		if(response.equals("No"))
		{
			System.out.println("Bye Bye!");
		}
       
		else if(response.equalsIgnoreCase("Yes"))
		{
			do
			{
				System.out.println("Enter the first number");
			
				 int num1=excercise.nextInt();
				 
				 System.out.println("Enter the second number");
				int num2=excercise.nextInt();
				
				int sum=num1+num2;
				
				System.out.println("sum of the two numbers is:"+sum);
			

				System.out.println("Do you want to continue(Yess or No)?");
				 response=excercise.nextLine();
				
			}while(response.equalsIgnoreCase("Yes"));
		}
		
		else
		{
			System.out.println("Sorry,you need to only enter Yes Or No");
		}
	}//main

}
