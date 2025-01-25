package Basicsofselenium;

import java.util.List;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class Print_dropdown_options {
	public static void main(String[] args) {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.id("searchDropdownBox"));
		Select A1 =new Select(search);
		List <WebElement> D1	=  A1.getOptions();
		     int count= D1.size();
		     System.out.println(count);
		     for(int i=0;i<count;i++) {
		  WebElement F1=         D1.get(1);
		           System.out.println(F1.getText());
		     }
		
	}

}
