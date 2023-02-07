package simplecalc;
import java.util.*;
import java.util.logging.Logger;
abstract class Calc
{   
    public abstract double calculate(double a,double b);
}
class Add extends Calc{
    public double calculate(double a,double b)
    {
        return a+b;
    }
}
class Sub extends Calc{
    public double calculate(double a,double b)
    {
        return a-b;
    }
}
class Mul extends Calc{
    public double calculate(double a,double b)
    {
        return a*b;
    }
}
class Div extends Calc{
    public double calculate(double a,double b)
    {
        return a/b;
    }
}
public class Calculator
{
	   static double res = 0;

	  public static void main (String[]args)
	  {
	    Logger log = Logger.getLogger ("com.api.jar");
	    Scanner sc = new Scanner (System.in);
	    log.info("To perform operation in this calculator follow the following format.....");
	    log.info("First enter the number...");
	    log.info("Second enter the any operator's among '+' '-' '*' '/'....");
	    log.info("Eg, 10 + 20 - 5 * 2 / 2...");
	    log.info ("To show the result press '=' operator...");
	    double a = sc.nextDouble ();
	      Calculator.res = a;
	    double b = 0;
	    char c = '0';
	    while (c != '=')
	      {
	        	
	        	char opp = sc.next ().charAt (0);
	    	switch (opp)
		     {
		       case '+':
		           
		           b = sc.nextDouble ();
		           Calc i = new Add ();
		           Calculator.res = i.calculate (Calculator.res, b);
		           break;
		       case '-':
		           
		           b = sc.nextDouble ();
		           Calc j = new Sub ();
		           Calculator.res = j.calculate (Calculator.res, b);
		           break;
		       case '*':
		           
		           b = sc.nextDouble ();
		           Calc k = new Mul ();
		           Calculator.res = k.calculate (Calculator.res, b);
		           break;
		       case '/':
		           
		           b = sc.nextDouble ();
		           Calc l = new Div ();
		          Calculator.res = l.calculate (Calculator.res, b);
		           break;
		       case '=':
		           c = '=';
		           log.info  ("Result is :" + Calculator.res);
		           break;
		       default:
		           log.info  ("Enter valid operator:");
		           break;
		     }
	      }
	  }
	}
