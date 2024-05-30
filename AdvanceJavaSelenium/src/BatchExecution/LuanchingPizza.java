package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LuanchingPizza {

	@Test(groups="Food")
	public void amazon() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pizzahut.co.in/");
	    Thread.sleep(2000);
	    driver.quit();
	}
}

