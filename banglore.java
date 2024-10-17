package inheritance;
	class pune
{
		 static void add()
		{
			int e=45;
			int y=9;
			int sum= e+y;
			System.out.println(sum);
		}
	}

public class banglore extends pune 
{
	static void sub() 
	{
		int r=134;
		int t=36;
		int sub=r-t;
		System.out.println(sub);
	}
public static void main (String [] args) 
{
	sub();
	add();
}


}


