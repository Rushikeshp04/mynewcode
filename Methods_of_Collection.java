import java.util.ArrayList;

public class Methods_of_Collection {
	
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList ();
		a1.add("Rushikesh");
		a1.add("Powar");
		a1.add(45646);
		a1.add(true);
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList ();
		a2.addAll(a1);
		a2.add("ram");
		System.out.println(a2);
		
		System.out.println(a2.contains("ram"));
		System.out.println(a2.containsAll(a1));
		
		System.out.println(a2.isEmpty());
		ArrayList a3 = new ArrayList ();
		System.out.println(a3.isEmpty());
			
		
		
		
		
	}	}




