import java.util.Scanner;
public class Switch {
 public static void main (String []args) {

{
	Scanner s1=new Scanner(System.in);
	System.out.println("which browser to choose");
	System.out.println(" remember 1 for chrome, 2 for edge, 3 for opera, 4 for safari");
	int a=s1.nextInt();	
	switch(a)
	{
	case 1:
		System.out.println("launch chrome browser");
		//break;
	case 2:
		System.out.println("launch edge browser");
		break;
	case 3:
		System.out.println("launch opera browser");
	break;
	case 4: 
	System.out.println("launch safari broswer");
	break;
	
	default:
		System.out.println("choose correct one");
	}
		
	
}
	}
}
