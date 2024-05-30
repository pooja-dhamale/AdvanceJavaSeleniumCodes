package genericlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	UtilityMethod um =new UtilityMethod();
	
	@BeforeSuite
	
	public void dbconnection()
	{
		Reporter.log("user is able to make the connection to database",true);
	}
	
	@BeforeTest
	
	public void precondition()
	{
		Reporter.log("user is able to write the precondition",true);
	}

	@BeforeClass
	public void launchurl() throws Throwable
	{
		Reporter.log("user is able to launch the url",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("user is able to maximize the window");
		driver.get(um.getDataFromPropertyFile("Url"));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("user is able to launch the demo web shop website");
	}
	
	@BeforeMethod
	public void login()
	{
	Reporter.log("user is able to enter the username and password and after that user is able to click on login button",true);
	driver.findElement(By.linkText("Log in")).click();
	Reporter.log("User is able to click on login cta");
	driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("bangalore541@gmail.com");
	Reporter.log("user is able to enter the username");
	driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("bangalore123");
	Reporter.log("user is able to enter the password");
	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	Reporter.log("User is able to click on login cta");
	}
	
	
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.partialLinkText("Log out")).click();
		Reporter.log("user is able to click on logout cta",true);
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
		Reporter.log("user is able to close the browser",true);
	}
	@AfterTest
	public void postcondition()
	{
		Reporter.log("user is able to enter the post conditions",true);
	}
	@AfterSuite
	public void closedb()
	{
		Reporter.log("User is able to close the db connection",true);
	}
}

