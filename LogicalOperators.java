
public class LogicalOperators {
 public static void main (String[] args)
 {
	 int a= 50;
	 int salary=20000;
	 String rushi= "powar";
	
 if (a!=50 && salary>15000)
 {
	 System.out.println("happy");
 }
 if ((a==50 && rushi=="powar"))
 {
	 System.out.println("mono");
 }
 if (salary>15000 || a==50)
 {
	 System.out.println("pogo");
 }
 else if (salary>15000 && a==50)
 {
	 System.out.println("soda");
 }
 
 else 
 {
	System.out.println("mogo"); 
 }
}
 
 
}