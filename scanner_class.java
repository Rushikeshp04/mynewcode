import java.util.Scanner;
public class scanner_class {
	static Scanner s1= new Scanner (System.in);
	
	static void add()
	{
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void sub()
	{
		int r=s1.nextInt();
		int g=s1.nextInt();
		int sub=r-g;
	  System.out.println(sub);
	}

public static void main (String [] args)
{
	add();
    sub();  
}

}
