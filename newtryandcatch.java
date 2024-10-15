import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class newtryandcatch 
{
public static void main(String[]args) 
{
 
	int rollno[]=new int [3];
    rollno[0]=19;
    rollno[1]=34;
    
    
try {
	rollno[2]=23;
	rollno[4]=78;
}
 catch(ArrayIndexOutOfBoundsException e1)
 {
	 System.out.println("you excided the size");
 }
  catch(NullPointerException e2)
{
	  System.out.println("handle the exception NPE");
	  }
catch(InputMismatchException e3)
{
	  System.out.println("handle the exception NPE");
	  }
catch(IllegalFormatException e4)
{
	  System.out.println("handle the exception NPE");
	  }

}
}
