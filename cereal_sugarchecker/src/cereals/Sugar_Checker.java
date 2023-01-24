package cereals;
import java.util.*;
public class Sugar_Checker
{

	public static void main(String[] args)
	{
		String authuser_name="learnjava@23";
		String auth_password="Ienjoycoding@23";
		
		Scanner obj=new Scanner(System.in);
		
		Scanner myobj=new Scanner(System.in);
		
		System.out.printf("%80s %n","Dear user welcome to the cereal % sugar checker progarm");
		System.out.println("This program calculates the sugar % in different cereal using information from the nutritional facts");
		System.out.printf("%80s %n","You can only calculate the sugar % for two cereal maximum");
		
		System.out.printf("%80s %n","---------------------User Login---------------------");
		System.out.println("Username:-");
		String username=obj.nextLine();
		
		System.out.println("Password:-");
		String password=obj.nextLine();
		
		System.out.printf("%80s %n","---------------------User Login---------------------");
		
		if(username.equals(authuser_name)&&password.equals(auth_password))
		{
			System.out.println("Welcome "+username);
			
			System.out.printf("%80s %n","How many cereals would you like to calculate the % sugar for?");
			System.out.println("Response:-");
			int cereal_number=myobj.nextInt();
			
			if(cereal_number==1)
			{
				System.out.printf("%80s %n","---------------------Cereal % sugar checker---------------------");
				
				System.out.println("Cereal Name:-");
				String cereal_name=obj.nextLine();
				System.out.println("Sugar content(g):-");
				double sugar_content=myobj.nextDouble();
				
				System.out.println("Total food Wieght(Food Serving size(g):-");
				double serving_size=myobj.nextDouble();
				
				double sugar_percent=(sugar_content/serving_size)*100;
				
				System.out.printf("%80s %n","---------------------Thank you---------------------");
				
				//section to display information
				
				System.out.printf("%20s","Cereal Name");
				System.out.printf("%20s","Serving Size(g)");
				System.out.printf("%20s","Sugar Content");
				System.out.printf("%25s","Sugar Percentage(%)");
				System.out.println();
				
				
				System.out.printf("%15s",cereal_name);
				System.out.printf("%15s",serving_size);
				System.out.printf("%20s",sugar_content);
				System.out.printf("%15s %.2f","",sugar_percent);
				
				System.out.println();
								
				
			}//if
			
			else if(cereal_number==2)
			{
               //first cereal entry
				System.out.printf("%80s %n","---------------------Cereal % sugar checker---------------------");
				
				System.out.println("First Cereal Name:-");
				String cereal_name1=obj.nextLine();
				System.out.println("Sugar content(g):-");
				double sugar_content1=myobj.nextDouble();
				
				System.out.println("Total food Wieght(Food Serving size(g):-");
				double serving_size1=myobj.nextDouble();
				
				double sugar_percent1=(sugar_content1/serving_size1)*100;
				
				System.out.printf("%80s %n","---------------------Thank you---------------------");
				
				//second cereal entry
          System.out.printf("%80s %n","---------------------Cereal % sugar checker---------------------");
				
				System.out.println("Second Cereal Name:-");
				String cereal_name2=obj.nextLine();
				System.out.println("Sugar content(g):-");
				double sugar_content2=myobj.nextDouble();
				
				System.out.println("Total food Wieght(Food Serving size(g):-");
				double serving_size2=myobj.nextDouble();
				
				double sugar_percent2=(sugar_content2/serving_size2)*100;
				
				System.out.printf("%80s %n","---------------------Thank you---------------------");
				//section to display information
				
				System.out.printf("%20s","Cereal Name");
				System.out.printf("%20s","Serving Size(g)");
				System.out.printf("%20s","Sugar Content");
				System.out.printf("%25s","Sugar Percentage(%)");
				System.out.println();
				
				
				System.out.printf("%15s",cereal_name1);
				System.out.printf("%15s",serving_size1);
				System.out.printf("%20s",sugar_content1);
				System.out.printf("%15s %.2f","",sugar_percent1);
				
				System.out.println();
				
				System.out.printf("%15s",cereal_name2);
				System.out.printf("%15s",serving_size2);
				System.out.printf("%20s",sugar_content2);
				System.out.printf("%15s %.2f","",sugar_percent2);
				
				System.out.println();
				
				System.out.printf("%80s %n","---------------------Sugar percentage Analytics(%)---------------------");
				
				if(sugar_percent1>sugar_percent2)
				{
					System.out.println("Cereal"+ cereal_name1 + "is much higher in the sugar percentage than "+cereal_name2);
				}
				
				else if(sugar_percent1>sugar_percent2)
				{
					System.out.println("Cereal"+ cereal_name2 + "is much higher in the sugar percentage than "+cereal_name1);
				}
				
				System.out.printf("%80s %n","---------------------Sugar percentage Analytics(%)---------------------");
			}
		}
		
		else 
		{
			System.out.println("Sorry,Invalid credentials!");	
		}
	}

}
