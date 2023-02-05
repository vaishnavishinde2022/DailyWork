package logbook;

import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Assessment_Logbook 
{
	static String new_string;
	static String code1;
	static String code2;
	static String course_keysubject1;
	static String course_keysubject2;
	static String course_name1;
	static String course_name2;
	static String status1;
	static String status2;
	static String assign_type1;
	static String assign_type2;
	

	public static void main(String[] args)throws IOException,AWTException,InterruptedException 
	{
		Scanner begin=new Scanner(System.in);
		
		System.out.println("Are you ready to begin(Y or N)");

		String answer=begin.nextLine();
		
		while(answer.equals("Y"))
		{
		  System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"Welcome to your assessment logbook!");	
		Thread.sleep(2000);
		
		//inserting ASCII art
		System.out.println(ANSII_Colors.BLUE_BOLD_BRIGHT);
		System.out.println(" _______");
		System.out.println("/      /,");
		System.out.println("/      //");
		System.out.println("/______//");
		System.out.println("(______(/");
		  
		//inserting gif image
        Scanner object=new Scanner(System.in);
        
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        ImageIcon icon=new ImageIcon("C:\\Users\\dell\\Documents\\workspace-spring-tool-suite-4-4.17.0.RELEASE\\student_Logbook\\src\\logbook\\pic.gif");
		Image normalImage=icon.getImage();
        Icon warningIcon=new ImageIcon(normalImage);
        
        JLabel warningLabel=new JLabel(warningIcon);
		frame.add(warningLabel,"Center");
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setResizable(false);
		
		//generating the random course code
		
		for(int x=0;x<2;x++)
		{
		 String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#";	
		
		 //create a string builder
		 StringBuilder sb=new StringBuilder();
		 
		 //creating an object of the random class
		 Random random=new Random();
		 
		 int length=7;
		 
		 for(int i=0;i<length;i++)
		 {
			int index=random.nextInt(alphabet.length()); 
		 
			//getting the character from the specified index position
		   char randonChar=alphabet.charAt(index);
		   
		   //append the character to the stringbuilder
		   
		   sb.append(randonChar);
		   
		   new_string=sb.toString();
		 
		 }//inner for loop
		 
		 if(x==0)
		 {
			code1=new_string; 
		 }
		 
		 else if(x==1)
		 {
			 code2=new_string;
		 }
		
		}//for
		
		System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"Enter the two lettered first course key like:- MA - Mathematics");
		String course_key1=object.nextLine();
		
		System.out.println("Enter the two lettered secong course key like:- GE - Geography");
		String course_key2=object.nextLine();
		
		while(course_key1.length()!=2)
		{
		  System.out.println(ANSII_Colors.RESET+"Enter the two lettered course key correctly like:- MA- Mathematics");	
		  
		  course_key1=object.nextLine();
		
		}//inner while
		
		while(course_key2.length()!=2)
		{
		  System.out.println("Enter the two lettered course key correctly like:- MA- Mathematics");	
		  
		  course_key2=object.nextLine();
		
		}//inner while
		
		if(course_key1.length()==2)
		{
		  System.out.println("Enter the subject for the first key");	
		  course_keysubject1=object.nextLine();
		
		}//if
		
		if(course_key2.length()==2)
		{
		  System.out.println("Enter the subject for the second key");	
		  course_keysubject2=object.nextLine();
		
		}//if
		
		System.out.println(ANSII_Colors.PURPLE+"course code "+code1);
		System.out.println("Enter the course key for your first subject");
		course_name1=object.nextLine();
		
		while(course_name1.length()!=2)
		{
		  System.out.println(ANSII_Colors.RESET+"Enter the two letter course key like:- MA- Mathematics");	
		  course_name1=object.nextLine();
		
		}//while
		
		if(course_name1.length()==2)
		{
		  System.out.println("Enter the assignment type(Enter t - test or h - homework or p - project)");	
		 
		  assign_type1=object.nextLine();
		  
		  System.out.println("Enter the completion status of the assignment(D - done or ND - not done)");
		  status1=object.nextLine();
		
		}//if
		
		
		
		System.out.println(ANSII_Colors.RED_BOLD+"course code "+code1);
		System.out.println("Enter the course key for your second subject");
		course_name2=object.nextLine();
		
		while(course_name2.length()!=2)
		{
		  System.out.println(ANSII_Colors.RESET+"Enter the two letter course key like:- MA- Mathematics");	
		  course_name2=object.nextLine();
		
		}//while
		
		if(course_name2.length()==2)
		{
		  System.out.println(ANSII_Colors.PURPLE_BOLD+"Enter the assignment type(Enter t - test or h - homework or p - project)");	
		 
		  assign_type2=object.nextLine();
		  
		  System.out.println("Enter the completion status of the assignment(D - done or ND - not done)");
		  status2=object.nextLine();
		
		}//if
		
		System.out.println(ANSII_Colors.RED_BOLD+"Would you like to make a change to the assignment status of any of the two assignment you have included(Yes or No)");
		String user=object.nextLine();
		
		while(user.equals("Yes"))
		{
		  System.out.println("Would you like to replace the subject 1 assignment sattus(Yes or No)");	
		  String user_newchoice=object.nextLine();
		  
		  if(user_newchoice.equals("Yes"))
		  {
			  System.out.println("Enter the new completion status of the assignment(D - done or ND - not done)for subject 1");
			  status1=object.nextLine();  
		  }//if
		  
		  else if(user_newchoice.equals("No"))
		  {
			System.out.println(ANSII_Colors.PURPLE_BOLD+"Would you like to replace the subject 2 assignment sattus(Yes or No)");  
			
			  user_newchoice=object.nextLine();
			  
			  if(user_newchoice.equals("Yes"))
			  {
				  System.out.println("Enter the new completion status of the assignment(D - done or ND - not done)for subject 2");
				  status2=object.nextLine();  
			  }//if
			  
			  else if(user_newchoice.equals("No"))
			  {
				System.out.println("Okay,thank you!");  
			  }
		  
		  }//else if
		  
		  System.out.println(ANSII_Colors.RED_BOLD+"Would you like to make a change to the assignment status of any of the two assignment you have included(Yes or No)");
		  user=object.nextLine();
		  
		}//while
		
		if(user.equals("No"))
		{
		  String cmd="";
		  String os=System.getProperty("os.name").toString();
		
		if(os.startsWith("Mac Os X"))
		{
			cmd="TestEdit";
		}//if
		
		else if(os.startsWith("Windows"))
		{
			cmd="notepad";
		}
		
		Runtime runtime=Runtime.getRuntime();
		runtime.exec(cmd);
		
		Thread.sleep(2000);
		
		Robot rb=new Robot();
		String title="\t\t\t\t Assessment Logbook\n";
		String keys="Subject keys\n"+course_key1+"-"+course_keysubject1+ "\n" + course_key2+"-"+course_keysubject2+"\n";
		String assignment_keys="Assignment keys\t" + "t - for test h - for homework p - for project"+"\n";
		StringBuilder str=new StringBuilder("Course code"+ "\t"+ "Course Name" + "\t" + "Assignment Type" + "\t\t" + "Status" + "\n" +code1 + "\t" +course_name1 + "\t\t" + assign_type1 + "\t\t\t" + status1 + "\n" +code2 + "\t" +course_name2 + "\t\t" + assign_type2 + "\t\t\t" + status2);
		
		String s=title+ keys + assignment_keys + str.toString();
		
		StringSelection stringSelection = new StringSelection(s);
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		clip.setContents(stringSelection, stringSelection);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		}//if
		
		System.out.println(ANSII_Colors.RESET+"Are you ready to begin(Y or N)");

		 answer=begin.nextLine();
		
		}//while
		
		if(answer.equals("No"))
		{
		  System.out.println("Okay have a nice day!");	
		}
	
	
	}//main method

}//class
