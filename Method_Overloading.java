
public class Method_Overloading 
{

 	static void add (int a) 
	{
 		int sum = a+6;
 		System.out.println(sum);
		}
	
	static void add (int a, int b)
	{
       int sum = a+b+6;
       System.out.println (sum);  
 	}
	static void add (double d )
	{
		double sum=d+6;
		System.out.println(sum);
	}
	

public static void main (String [] args)
{
	add(100);
	add(123,456);
	add (5.7);

}
}
