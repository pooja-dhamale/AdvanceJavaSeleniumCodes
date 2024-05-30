package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import net.bytebuddy.asm.Advice.OffsetMapping.ForThrowable;

public class LearningCrossBrowserTesting {

	WebDriver driver;
	@Parameters("browser")
	@Test
	public void launch(String bname) throws Throwable
	{
		if(bname.contains("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.partialLinkText("Books")).click();
			Thread.sleep(3000);
			driver.quit();
		}
		else if(bname.contains("firefox"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.partialLinkText("Books")).click();
			Thread.sleep(3000);
			driver.quit();
		}
		
		
	}
}
