package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingMyntra {
	@Test(groups="Ecommerce")
	public void Myntra() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	    Thread.sleep(2000);
	    driver.quit();
	}

}
