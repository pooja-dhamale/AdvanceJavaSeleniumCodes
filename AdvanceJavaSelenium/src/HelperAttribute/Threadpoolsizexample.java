package HelperAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Threadpoolsizexample {

	
	@Test(invocationCount=2,threadPoolSize=2)
	public void launched() throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.quit();
	}
}
