package ListenerExamples;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript1 extends BaseClass {

	
	
	@Test
	
	public void books()
	{
	 driver.findElement(By.partialLinkText("Books")).click();
	}
	

	@Test
	
	public void computers()
	{
	 driver.findElement(By.partialLinkText("COMPUTERS")).click();
	}
	

	@Test
	
	public void electronics()
	{
	 driver.findElement(By.partialLinkText("ooo")).click();
	}
	

	@Test
	
	public void Jewellery()
	{
	 driver.findElement(By.partialLinkText("Jewelry")).click();
	}
	

	@Test
	
	public void GiftCard()
	{
	 driver.findElement(By.partialLinkText("Gift Cards")).click();
	}
}
