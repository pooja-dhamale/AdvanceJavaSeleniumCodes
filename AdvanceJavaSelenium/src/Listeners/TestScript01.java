package Listeners;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript01 extends BaseClass {

	@Test
	
	public void book()
	{
		driver.findElement(By.partialLinkText("reads")).click();
	}
}
