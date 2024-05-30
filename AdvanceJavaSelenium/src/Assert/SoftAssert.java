package Assert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class SoftAssert {
	
	@Test
	public void launch()
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	SoftAssert sa = new SoftAssert();
	driver.get("https://demowebshop.tricentis.com/");
	sa.assertEquals(driver.getTitle(), "Demo Web Shop", "demo web shop is not launching");
	driver.findElement(By.linkText("Register")).click();
	sa.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/register", null);
	WebElement female = driver.findElement(By.id("gender-female"));
	female.click();
	
	WebElement fname = driver.findElement(By.id("FirstName"));
	
	fname.sendKeys("chandana");
	sa.assertEquals(fname.getAttribute("value"), "chandana", "firstname is not matching");
	WebElement lname = driver.findElement(By.id("LastName"));
	lname.sendKeys("N");
	sa.assertEquals(lname.getAttribute("value"), "N", "LastName is not matching");
	
	
	}

	private void assertEquals(String attribute, String string, String string2) {
		// TODO Auto-generated method stub
		
	}
		
		

	

	


}
