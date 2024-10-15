
public class String_matches {
	public static void main(String[] args) {
	
		String s1= "rama";
		boolean b1= s1.matches("....");
		System.out.println(b1);
		String s2= "rushikesh";
		System.out.println(s2.matches("(.*)h"));
		System.out.println(s2.matches("r(.*)"));
		System.out.println(s2.matches("(.*)k(.*)"));
		System.out.println(s2.matches("..s(.*)"));	
	}

}
