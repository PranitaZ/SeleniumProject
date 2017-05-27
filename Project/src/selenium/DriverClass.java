package selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

	WebDriver wd = new FirefoxDriver();
	
	@Test
	public void launch(){
		
		wd.get("https://www.google.co.in/");
	}
	
}
