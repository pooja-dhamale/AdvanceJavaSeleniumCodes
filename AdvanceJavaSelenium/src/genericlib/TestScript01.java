package genericlib;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript01 extends BaseClass {

	@Test
	public void computers()
	{
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		Reporter.log("user is able to click on computer tab");
	}
}
