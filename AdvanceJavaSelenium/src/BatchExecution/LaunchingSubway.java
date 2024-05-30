package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingSubway {

	@Test(groups="Food")
	public void Subway() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://subway.in/");
	    Thread.sleep(2000);
	    driver.quit();
	}
}
