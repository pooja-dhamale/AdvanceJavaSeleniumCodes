package Assert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HardAssert {
	@Test
	public void HardAssert()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://demowebshop.tricentis.com/");
	assertEquals(driver.getTitle(), "Demo Web Shop", "demo web shop is not launching");
	driver.findElement(By.linkText("Register")).click();
	assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register");
	WebElement female = driver.findElement(By.id("gender-female"));
	female.click();
	
	WebElement fname = driver.findElement(By.id("FirstName"));
	
	fname.sendKeys("chandana");
	assertEquals(fname.getAttribute("value"), "chandana", "firstname is not matching");
	WebElement lname = driver.findElement(By.id("LastName"));
	lname.sendKeys("N");
	assertEquals(lname.getAttribute("value"), "N", "LastName is not matching");

	
	}
	

}
