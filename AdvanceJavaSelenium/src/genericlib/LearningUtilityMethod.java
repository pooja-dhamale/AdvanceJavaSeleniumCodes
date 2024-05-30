package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningUtilityMethod {
	
	@Test
	public void script() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		UtilityMethod um=new UtilityMethod();
		// fetch data from property file
		//driver.get(um.getDataFromPropertyFile("Url"));
		
		//fetch data from excel
		driver.get(um.getExcelDatafromFile("Sheet1", 9, 2));
		
		
	}

}
