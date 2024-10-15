import java.util.ArrayList;

public class Methods_of_Collection1 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList ();
		a1.add("Rushikesh");
		a1.add("Powar");
		a1.add(45646);
		System.out.println(a1);

		//a1.remove("Powar");
		//System.out.println(a1);
	
	a1.removeAll(a1);
	System.out.println(a1);
	
	System.out.println(a1.size());
		
	a1.clear();
	System.out.println(a1);
	
	}
}
