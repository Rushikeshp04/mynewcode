package TestNGproject;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class assert_example {
	public static void main(String[] args) {
		SoftAssert softAssert = new SoftAssert();

		// Simulated conditions
		String actualTitle = "Google";
		String expectedTitle = "Google";
		String actualUrl = "https://www.google.com";
		String expectedUrl = "https://www.bing.com";

		Assert.assertEquals(actualUrl, expectedTitle, expectedUrl);

	}
}
