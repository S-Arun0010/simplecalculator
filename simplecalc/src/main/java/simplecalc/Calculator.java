package simplecalc;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Calculator 
{   
      
      static PrintStream print = new PrintStream(new PrintStream(new FileOutputStream(FileDescriptor.out)));	
	  static  double result = 0;
	  public static double getinput()
	  { 
		  
		  double number;
		  do {
			  Scanner s = new Scanner (System.in);
			  try
			  { 		 
				   number = s.nextDouble ();
				   break; 
			  }
			  catch(InputMismatchException e)
			  {
				  print.println(e);
			  }
		  }while(true);
		 
		  return number;
	  }
	  public static void main (String[]args)
	  {
			 
	    print.println("To perform operation in this calculator follow the following format.....");
	    print.println("First enter the number...");
	    print.println("Second enter the any operator's among '+' '-' '*' '/'....");
	    print.println("Eg, 10 + 20 - 5 * 2 / 2...");
	    print.println ("To show the result press '=' operator...");
	    Scanner sc = new Scanner (System.in);
	    double number = getinput();
	    Calc c;
	    result = number;
	    char choice = '0';
	    while (choice != '=')
	      {
	        	
	        char option = sc.next().charAt(0);
	    	switch (option)
		     {
		       case '+':
		           
		           number = getinput();
		           c = new Add ();
		           result = c.calculate(result, number);
		           break;
		       case '-':
		    	   
		           number = getinput();
		           c = new Sub ();
		           result = c.calculate (result,number);
		           break;
		       case '*':
		           
		           number = getinput();
		           c = new Multiply ();
		           result = c.calculate (result, number);
		           break;
		       case '/':
		           
		           number = getinput();
		           c = new Divide ();
		           result = c.calculate (result, number);
		           break;
		       case '=':
		           choice = option;
		           print.println  ("Result is :" + result);
		           break;
		       default:
		    	   print.println ("Enter valid operator:");
		           break;
		     }
	      }
	  }
	}