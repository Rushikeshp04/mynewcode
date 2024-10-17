package inheritance;
class ajobas
{
	ajobas ()
	{
		System.out.println("ajoba");
	}
}
class baba extends ajobas
{
	baba()
	{
		System.out.println("baba");
	}
}


public class Superclass extends baba
{
	Superclass()

	{
		System.out.println("Superclass gh");
}
public static void main (String [] args) 
{
Superclass c1= new Superclass ();	
}	
}