package genericlib;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript04 extends BaseClass {
	
	

	@Test(groups="test1")
	public void Jewellery()
	{
		driver.findElement(By.partialLinkText("Jewelry")).click();
	}

}
