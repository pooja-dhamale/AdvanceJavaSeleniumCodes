package HelperAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class threadpoolsize {
	
	
@Test(invocationCount=2,threadPoolSize=2)
	
	public void launching() throws Throwable
	{
		Reporter.log("testNG installed",true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("maximize the window",true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("launched the webshop url",true);
		Thread.sleep(2000);
		Reporter.log("add waits as 2 sec",true);
		driver.quit();
		Reporter.log("Close the browser",true);
		
	}

}
