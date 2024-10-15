
public class Replace {
public static void main(String[] args) {
	
	String name="ram";
	System.out.println(name.replace("a", ""));
  System.out.println(name.replaceAll("r","o"));

  String s1= "my name is rushikesh";
System.out.println(s1.replaceAll("a", "b"));  

 String s2 = "my nUmber is 7";
System.out.println(s2.replaceAll("[A-Z]", "")); 
 
String s3 = "my number is 7";
System.out.println(s3.replaceAll("[1-9]", "")); 

}
}
