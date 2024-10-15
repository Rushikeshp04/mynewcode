import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ithas_whileloop_arraylisttt {

	public static void main(String[] args) 
	{
ArrayList a1= new ArrayList();		
	a1.add("rushi");
	a1.add("powar");
	a1.add("ram");
	a1.add("123");
	
	System.out.println(a1);
Iterator I1=  a1.iterator(); 
while(I1.hasNext()) // true if the iteration has more elements
 {
	System.out.println(I1.next()); // true if the iteration has more elements
 }

   ListIterator I2 = a1.listIterator();
 while(I2.hasNext())
 {
	System.out.println(I2.next());
 }
	while (I2.hasPrevious())
	{
		System.out.println(I2.previous());
	}
	}
}
