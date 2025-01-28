package TestNGproject;

public class Stringbuffer {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		StringBuffer sb = new StringBuffer("Hello");

		// Append a string
		sb.append(" World");
		System.out.println(sb); // Output: Hello World

		// Insert at a specific position
		sb.insert(6, "Java ");
		System.out.println(sb); // Output: Hello Java World

		// Reverse the string
		sb.reverse();
		System.out.println(sb); // Output: dlroW avaJ olleH
	}
}
