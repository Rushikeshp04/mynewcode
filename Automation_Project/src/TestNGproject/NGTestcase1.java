package TestNGproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NGTestcase1 extends LaunchQuit {

	@Override
	@Test
	public void testcase1() {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shoe" + Keys.ENTER);
	}

}
