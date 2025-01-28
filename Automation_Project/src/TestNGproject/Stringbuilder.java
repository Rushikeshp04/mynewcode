package TestNGproject;

public class Stringbuilder {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User1\\Downloads\\chromedriver-win64 new\\chromedriver-win64\\chromedriver.exe");
		StringBuilder sb = new StringBuilder("Good");
		sb.append("morning");
		sb.append("hi");

		sb.replace(0, 3, "great");

		System.out.println(sb);

	}

}
