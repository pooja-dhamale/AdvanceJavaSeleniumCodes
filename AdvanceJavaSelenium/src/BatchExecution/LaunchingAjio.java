package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingAjio {

	
	@Test(groups="Ecommerce")
	public void ajio() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
	    Thread.sleep(2000);
	    driver.quit();
	}
}
