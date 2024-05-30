package genericlib;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript05 extends BaseClass {
	
	@Test(groups="test1")
	public void integration()
	{
		driver.findElement(By.xpath("//input[@value=\"Add to cart\"][1]")).click();
	}
	

}
