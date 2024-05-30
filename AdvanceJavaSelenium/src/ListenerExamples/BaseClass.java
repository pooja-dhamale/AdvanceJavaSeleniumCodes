package ListenerExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(TestNGImplementation.class)
public class BaseClass {

	public static WebDriver driver;
	
	@BeforeClass
	public void launch() throws Throwable
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	}
	
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
