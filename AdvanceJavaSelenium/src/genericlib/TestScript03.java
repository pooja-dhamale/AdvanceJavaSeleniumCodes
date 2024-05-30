package genericlib;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript03 extends BaseClass {
	
	@Test
	public void electronics()
	{
		driver.findElement(By.partialLinkText("Electronics")).click();
	}

}
