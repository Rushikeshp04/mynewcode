import java.util.ArrayList;
import java.util.List;

public class List_behaviour {
public static void main(String[] args) 
{
	//upcasting arraylist to list
       List a1= new ArrayList();
       // check indexing
       a1.add(56);
       a1.add(78);
       a1.add(56);
       a1.add(90);
       System.out.println(a1);
       //duplicate
       a1.add(78);
       a1.add(56);
       System.out.println(a1);
    // null
       a1.add(null);
       a1.add(null);
       System.out.println(a1);
       
}
}
