import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_behaviour {
public static void main(String[] args) 
{
 //linkedhashset arraylist to Set
	 Set s1 = new TreeSet();
	  s1.add(45);
	  s1.add(78);
	  s1.add(34);
	  s1.add(70);
	  System.out.println(s1);
	//duplicate
      s1.add(45);
      s1.add(78);
      System.out.println(s1);
      // null
      s1.add(null);
      
      System.out.println(s1);
      // iterate from iterator- yes
      // iterate listiterator-yes
}
}
