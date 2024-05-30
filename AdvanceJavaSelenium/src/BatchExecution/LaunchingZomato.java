package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingZomato {

	
	@Test(groups="Food")
	public void Zomato() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
	    Thread.sleep(2000);
	    driver.quit();
	}
}