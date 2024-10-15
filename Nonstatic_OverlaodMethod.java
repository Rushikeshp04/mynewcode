
public class Nonstatic_OverlaodMethod {

	void add(double a)
	{
		double sum=6+a;
		System.out.println(sum);
	}
	void add(int a)
	
	{	
	int sum= a+6;
		System.out.println(sum);
	
		
	}
	
	public static void main (String [] args)
{
		Nonstatic_OverlaodMethod n1=new Nonstatic_OverlaodMethod();
		n1.add(90);
		n1.add(3.6);
	
}
}
