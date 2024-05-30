package genericlib;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript02 extends BaseClass {
	
	
	@Test
	public void Books()
	{
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("user is able to click on book option");
	}

}
