package inheritance;

class ramesh
{
 void login() 
 {
	 System.out.println("login from mob");
 }	
}

public class Overriding extends ramesh
{
	void login() 
	{
		System.out.println("login from web");
	}
public static void main (String[] args) 
{
Overriding p1= new Overriding();
 p1.login();
 }

}