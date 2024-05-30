package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
	@Test
	public void script() throws Throwable
	{
		HomePagePomClass hp=new HomePagePomClass(driver);
		hp.getSerachbox().sendKeys("books");
		Thread.sleep(2000);
	}

	
	
}
