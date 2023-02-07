package schoolActivity;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.*;
import javax.swing.*;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class After_Activity extends Canvas
{
	static String days_choice;
	static String club_choice;
	static String club_time;
	static String club_venue;
	static Date current_Date;
	static int Scienceclub_stats=0;
	static int Artclub_stats=0;
	static int Bookclub_stats=0;
	static int Dramaclub_stats=0;
	static int Charityclub_stats=0;
	static int Mathclub_stats=0;
	static int Historyclub_stats=0;
	static int Sportsclub_stats=0;
	static int Codingclub_stats=0;
	static Document document;
	static PdfWriter writer;
	
	public void paint(Graphics g)
	{
		Image activity=new ImageIcon("C:\\Users\\dell\\Downloads\\school-is-fun-clipart-8.png").getImage();
	    g.drawImage(activity,0,0,this);
	    
	 	
	}

	public static void main(String[] args) throws Exception
	{
		Scanner text=new Scanner(System.in);
		Scanner number=new Scanner(System.in);
		
		JFrame test=new JFrame();
		After_Activity obj=new After_Activity();
		test.setSize(830,836);
		test.add(obj);
		test.setVisible(true);
		
		//inserting local data and time
		current_Date=new Date();
		
		//begin the program
		
		System.out.println(ANSII_Colors.DARK_RED+"************************************************************************************************");
		System.out.println(ANSII_Colors.GREEN_BOLD_BRIGHT+"Welcome to the after school activity registration portal");
		System.out.println(ANSII_Colors.DARK_RED+"************************************************************************************************");
	    
		System.out.println(ANSII_Colors.RESET);
		
		System.out.println("+------------+--------------+------------+");
		System.out.println("|Mon/Tue     |  Wed         | Thu/Fri    |");
		System.out.println("+------------+--------------+------------+");
		System.out.println("|Science club| Drama club   |History club|");
		System.out.println("|Art club    | Charity club |Sport club  |");
		System.out.println("|Book club   | Math club    |Coding club |");
		System.out.println("+------------+--------------+------------+");
		
	   System.out.println("Are you ready to begin using the system(Sure or Not now)");
	   String user_response=text.nextLine();
	   
	   if(!user_response.equals("Sure"))
	   {
		  System.exit(0);   
	   }
	   
	   do
	   {
		   //Administrator login detail
		   
		   String admin_authusername="xxx";
		   String admin_authpassword="xxx";
		   
		   System.out.println(ANSII_Colors.BLUE_BOLD_BRIGHT+"Are you an administrator or student(type in your answer)");
		   String response=text.nextLine();
		   
		   if(response.equals("administrator"))
		   {
			 System.out.println(ANSII_Colors.RESET+"Enter the administartor username");
			 String admin_username=text.nextLine();
			 
			 System.out.println("Enter your password");
		     String admin_password=text.nextLine();
		     
		     while(!admin_username.equals(admin_authusername)||!admin_password.equals(admin_authpassword))
		     {
		    	 System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"You have entered incorrect details!please enter again");
		    	 System.out.println(ANSII_Colors.RESET+"Enter the administartor username");
				  admin_username=text.nextLine();
				 
				 System.out.println("Enter your password");
			      admin_password=text.nextLine();
			     	 
		     }//while
		   
		     if(admin_username.equals(admin_authusername)&& admin_password.equals(admin_authpassword))
		     {
		    	 String file_path="C:\\Users\\dell\\Downloads\\Material\\";
		         
		    	 System.out.println(ANSII_Colors.CYAN_BOLD_BRIGHT+"Enter the name of the student's file you will like to find");
		         String student_name=text.nextLine();
		         String complete_filename=file_path+student_name+".pdf";
		        Path path=Paths.get(complete_filename);
		      
		        if(Files.exists(path)&& !Files.isDirectory(path))
		        {
		          System.out.println(ANSII_Colors.RESET+"File is found!");	
		          
		          PdfReader reader;
		          
		          try
		          {
		            reader=new PdfReader(complete_filename);
		            String textfrompage=PdfTextExtractor.getTextFromPage(reader,1);
		         
		            System.out.println(textfrompage);
		            reader.close();
		          
		          }//try
		          
		          catch(Exception e)
		          {
		        	  e.printStackTrace();
		          }
		        
		        }//if
		        
		        else 
		        {
		        	System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"Sorry file does not exist!");
		        }
		     }//if
		   
		   }//if
		   
		   //Student login
		   System.out.println(ANSII_Colors.RESET+"How many after school activity club would you like to register for(Max of 3)");
		   int club_number=number.nextInt();
		   
		   while(club_number>=1 && club_number<=3)
		   {
			   System.out.println("Please enter the fiel location where you would like to store the information for the after school activity that you have registered?");
		       String pdfFilePath=text.nextLine();
		       
		       System.out.println("Enter your name");
		       String student_name=text.nextLine();
		      
		       OutputStream fos=new FileOutputStream(new File(pdfFilePath));
		       document=new Document(PageSize.A4.rotate());
		       writer=PdfWriter.getInstance(document, fos);
		       PdfPTable table=new PdfPTable(4);
		       float widths[]= {3,3,3,3,};
		       table.setWidths(widths);
		       PdfPCell cell=new PdfPCell(new Phrase("Club Name"));
		       cell.setBackgroundColor(Color.GREEN);
		       table.addCell(cell);
		       
		       cell=new PdfPCell(new Phrase("Club Day(s)"));
		       cell.setBackgroundColor(Color.GREEN);
		       table.addCell(cell);
		       
		       cell=new PdfPCell(new Phrase("Club Time"));
		       cell.setBackgroundColor(Color.GREEN);
		       table.addCell(cell);
		       
		       cell=new PdfPCell(new Phrase("Club venue"));
		       cell.setBackgroundColor(Color.GREEN);
		       table.addCell(cell);
		       
		       Phrase ph;
		       document.open();
		       String Student_nameupdate=student_name +"s Afternoon Activity Record";
		       Font fontSize_18=FontFactory.getFont(FontFactory.TIMES,18f);
		       
		       document.add(new Paragraph(Student_nameupdate,fontSize_18));
		       document.add(new Paragraph("\n"));
		       document.add(new Paragraph(current_Date.toString()));
		       document.add(new Paragraph("\n"));
		       
		       for(int r=1;r<=club_number;r++)
		       {
		    	 System.out.println(ANSII_Colors.CYAN_BOLD_BRIGHT+"What day(s) would you like to register for(Mon/Tue,Wed,Thu/Fri)?");
		    	 days_choice=text.nextLine();
		    	 
		    	 if(days_choice.equals("Mon/Tue"))
		    	 {
		    		 days_choice="Mon/Tue";
		    		 System.out.println("Which club would you like to register for(Science Club or Art Club or Book Club)?");
		    	     String club_choice=text.nextLine();
		    	     
		    	     if(club_choice.equals("Science Club"))
		    	     {
		    	    	 Scienceclub_stats=Scienceclub_stats+1; 
		    	         club_time="3:30 pm to 4:30 pm";
		    	         club_venue="Outdoor Hall 1";
		    	     }
		    	     
		    	     else if(club_choice.equals("Art Club"))
		    	     {
		    	    	 Artclub_stats=Artclub_stats+1; 
		    	    	 club_time="3:30 pm to 4:30 pm";
		    	         club_venue="Outdoor Hall 2";
		    	     }//else if
		    	     
		    	     else if(club_choice.equals("Book Club"))
		    	     {
		    	    	 Bookclub_stats=Bookclub_stats+1; 
		    	    	 club_time="3:30 pm to 4:30 pm";
		    	         club_venue="Outdoor Hall 3";
		    	     }
		    	     
		    	     else
		    	     {
		    	    	 System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"Sorry you have written an incorrect option!");
		    	     }
		    	     
		    	 
		    	 }//outer if
		    	 
		    	 else if(days_choice.equals("Wed"))
		    	 {
		    		 days_choice="Wed"; 
		    		 
		    		 System.out.println(ANSII_Colors.RESET+"Which club would you like to register for(Drama club or Charity club or Math club)?");
		    	     String club_choice=text.nextLine();
		    	    
		    	     
		    	     if(club_choice.equals("Drama club"))
		    	     {
		    	    	 Dramaclub_stats=Dramaclub_stats+1; 
		    	    	 
		    	    	 if(Dramaclub_stats>1)
		    	    	 {
		    	    		 Dramaclub_stats=Dramaclub_stats-1;	 
		    	    	     System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"Sorry you can not register for drama club more than one!");
		    	    	 }
		    	    	 
		    	    	 else
		    	    	 {
		    	    		 club_time="3:40 pm to 4:40 pm";
			    	         club_venue="Outdoor Hall 4";	  
		    	    	    
			    	         continue;
		    	    	 
		    	    	 }
		    	    	 
		    	        
		    	     }
		    	     
		    	     else if(club_choice.equals("Charity club"))
		    	     {
		    	    	 Charityclub_stats=Charityclub_stats+1; 
		    	    	 if(Charityclub_stats>1)
		    	    	 {
		    	    		 Charityclub_stats=Charityclub_stats-1;	 
		    	    	     System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"Sorry you can not register for charity club more than one!");
		    	    	 }
		    	    	 
		    	    	 else
		    	    	 {
		    	    		 club_time="3:40 pm to 4:40 pm";
			    	         club_venue="Outdoor Hall 5";	  
		    	    	    
			    	         continue;
		    	    	 
		    	    	 }
		    	     }//else if
		    	     
		    	     else if(club_choice.equals("Math club"))
		    	     {
		    	    	 Mathclub_stats=Mathclub_stats+1; 
		    	    	 if(Mathclub_stats>1)
		    	    	 {
		    	    		 Mathclub_stats=Mathclub_stats-1;	 
		    	    	     System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"Sorry you can not register for Math club more than one!");
		    	    	 }
		    	    	 
		    	    	 else
		    	    	 {
		    	    		 club_time="3:40 pm to 4:40 pm";
			    	         club_venue="Outdoor Hall 6";	  
		    	    	    
			    	         continue;
		    	    	 
		    	    	 }
		    	     }
		    	     
		    	     else
		    	     {
		    	    	 System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"Sorry you have written an incorrect option!");
		    	     }
		    		 
		    		 
		    	 }//else if
		    	 
		    	 else if(days_choice.equals("Thu/Fri"))
		    	 {
		    		 days_choice="Thu/Fri";
		    		 System.out.println(ANSII_Colors.BLUE_BOLD_BRIGHT+"Which club would you like to register for(History club or Sports club or Coding club)?");
		    	     String club_choice=text.nextLine();
		    	     
		    	     
		    	     if(club_choice.equals("History club"))
		    	     {
		    	    	 Historyclub_stats=Historyclub_stats+1; 
		    	         club_time="3:40 pm to 4:40 pm";
		    	         club_venue="Outdoor Hall 7";
		    	     }
		    	     
		    	     else if(club_choice.equals("Sports club"))
		    	     {
		    	    	 Sportsclub_stats=Sportsclub_stats+1; 
		    	    	 club_time="3:40 pm to 4:40 pm";
		    	         club_venue="Field";
		    	     }//else if
		    	     
		    	     else if(club_choice.equals("Coding club"))
		    	     {
		    	    	 Codingclub_stats=Codingclub_stats+1; 
		    	    	 club_time="3:20 pm to 4:20 pm";
		    	         club_venue="Computer lab 1";
		    	     }
		    	     
		    	     else
		    	     {
		    	    	 System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"Sorry you have written an incorrect option!");
		    	     }
		    	     
		    	 
		    	 }//outer if
		    	 
		    	 //include else statement
		    	 else
		    	 {
		    		System.out.println(ANSII_Colors.RED_BOLD_BRIGHT+"Sorry you have entered an incorrect option!");
		    	 }
		    	 
		    	 cell=new PdfPCell();
		    	 ph=new Phrase(club_choice);
		    	 cell.addElement(ph);
		    	 table.addCell(cell);
		    	 
		    	 cell=new PdfPCell();
		    	 ph=new Phrase(days_choice);
		    	 cell.addElement(ph);
		    	 table.addCell(cell);
		    	 
		    	 cell=new PdfPCell();
		    	 ph=new Phrase(club_time);
		    	 cell.addElement(ph);
		    	 table.addCell(cell);
		    	 
		    	 cell=new PdfPCell();
		    	 ph=new Phrase(club_venue);
		    	 cell.addElement(ph);
		    	 table.addCell(cell);
		    	 
		    	 if(r==club_number)
		    	 {
		    		 document.add(table);
		    	 }
		    	 
		       }//for
		       
		       document.close();
		       writer.close();
		       
		       System.out.println(ANSII_Colors.RESET+"How many after school activity club would you like to register for(Max of 3)");
			   club_number=number.nextInt();
			   
		       
		   }//inner while
		   
		   System.out.println("Are you ready to begin using the system(Sure or Not now)");
		   user_response=text.nextLine();
		    
	   }while(user_response.equals("Sure"));
	   
	   if(user_response.equals("Not now"))
	   {
		   //creating a pie chart to act as a check out counter
	  
		   DefaultPieDataset dataset=new DefaultPieDataset();
		   dataset.setValue("Science clup", Scienceclub_stats);
		   dataset.setValue("Art clup", Artclub_stats);
		   dataset.setValue("Book clup", Bookclub_stats);
		   dataset.setValue("Drama clup", Dramaclub_stats);
		   dataset.setValue("Charity clup", Charityclub_stats);
		   dataset.setValue("Math clup", Mathclub_stats);
		   dataset.setValue("History clup", Historyclub_stats);
		   dataset.setValue("Sports clup", Sportsclub_stats);
		   dataset.setValue("Coding clup", Codingclub_stats);
	   
		   JFreeChart chart=ChartFactory.createPieChart("After School Activities", dataset,true,true,true); 
	       PiePlot p=(PiePlot)chart.getPlot();
	       ChartFrame frame=new ChartFrame("Statistics",chart);
	       frame.setVisible(true);
	       frame.setSize(500,500);
	       
	       System.out.println("Thank you for registering!");
	       
	   }
	}//main

}//class
