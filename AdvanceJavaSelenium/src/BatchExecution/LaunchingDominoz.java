package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingDominoz {

	@Test(groups="Food")
	public void dominoz() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pizzaonline.dominos.co.in/");
	    Thread.sleep(2000);
	    driver.quit();
	}
}
