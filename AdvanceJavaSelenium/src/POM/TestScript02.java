package POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestScript02 extends BaseClass {
	
	
	@Test
	public void script3() throws InterruptedException {
		HomePagePomClass hp= new HomePagePomClass(driver);
		RegisterPOMClass rp= new RegisterPOMClass(driver);
		hp.getRegistertext().click();
		rp.getFemaleradiobutton().click();
		rp.getFirstnametextfield().sendKeys("Pooja");
		rp.getLastnametextfield().sendKeys("Dhamale");
		rp.getEmailtextfield().sendKeys("dhamale85@gmail.com");
		rp.getPasswordfield().sendKeys("abc@123");
		rp.getConfirmPasswordfield().sendKeys("abc@123");
		rp.registercta.click();
		Thread.sleep(2000);	
	}

}
