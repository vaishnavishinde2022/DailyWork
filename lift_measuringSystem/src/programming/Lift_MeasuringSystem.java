package programming;

import java.util.*;
import java.lang.Thread;
import java.lang.Math;

public class Lift_MeasuringSystem 
{
	public static void main(String[] args) throws Exception{
		Scanner text_object = new Scanner(System.in);
		Scanner number_object = new Scanner(System.in);
		System.out.println("Shall we start(Y or N)? ");
		String user = text_object.nextLine();
		do
		{
			System.out.println(ANSII_Colors.BLUE_BRIGHT);
			System.out.println(" ______ _ ");
			System.out.println("|  ____| |");      
			System.out.println("| |__  | |_   _ ");
			System.out.println("|  __| | | | | |");
			System.out.println("| |    | | |_| |");
			System.out.println("|_|    |_|(__, |");
			System.out.println("           __/ |");
			System.out.println("          |___/ ");
			Thread.sleep(2000);
			System.out.println(ANSII_Colors.PURPLE_BRIGHT +"**************************************************************************");
			System.out.println("Calculating the lift of the aircraft");
			System.out.println("**************************************************************************");
			Thread.sleep(2000);
			System.out.println(ANSII_Colors.RESET +"Enter the aircraft type");
			String air_crafttype = text_object.nextLine();
			System.out.println("Enter the lift coefficient(CL):-");
			double CL = number_object.nextDouble();
			System.out.println("Enter the air density(rho on kg/m3) value:-");
			double rho = number_object.nextDouble();
			System.out.println("Enter the velocity of the air craft(m/s):-");
			double velocity = number_object.nextDouble();
			System.out.println("Enter the wing area(in meters squared) of the aircraft:-");
			double wing_area = number_object.nextDouble();
			double lift = CL * 1/2 * rho * Math.pow(velocity, 2) * wing_area;
			System.out.println(ANSII_Colors.PURPLE_BRIGHT +"**************************************************************************");
			System.out.println("Computing the lift");
			System.out.println("**************************************************************************");
			Thread.sleep(2000);
			System.out.printf("%20s %20s", "The lift of the aircraft is","");
			System.out.printf("%.2f %2s", Math.ceil(lift),"newtons");
			System.out.println();
			System.out.println("Shall we start(Y or N)? ");
			user = text_object.nextLine();
			
		}while(user.equals("Y"));
		
		if(user.equals("N"))
		{
			System.out.println("Okay, have a great day!");
		}

	}
}
