package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromExcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		  FileInputStream fis = new FileInputStream("./testdata/exceldata.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		  System.out.println(wb.getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue());
		  System.out.println(wb.getSheet("Sheet1").getRow(6).getCell(1).getNumericCellValue());
		  System.out.println(wb.getSheet("Sheet1").getRow(7).getCell(3).getBooleanCellValue());
		  String url = wb.getSheet("Sheet1").getRow(9).getCell(2).getStringCellValue();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
		  Thread.sleep(2000);
		  
		  driver.findElement(By.partialLinkText("Register")).click();
		  driver.findElement(By.xpath("//input[@value=\"F\"]")).click();
		  
		  WebElement firstName = driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
		  String name = wb.getSheet("Sheet1").getRow(11).getCell(0).getStringCellValue();
		  firstName.sendKeys(name);
		  
		  WebElement LastName = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
		  String lname = wb.getSheet("Sheet1").getRow(12).getCell(0).getStringCellValue();
		  LastName.sendKeys(lname);
		  
		  WebElement Email = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
		  String emailadd = wb.getSheet("Sheet1").getRow(13).getCell(0).getStringCellValue();
		  Email.sendKeys(emailadd);
		  
		  WebElement password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		  String passw = wb.getSheet("Sheet1").getRow(14).getCell(0).getStringCellValue();
		  password.sendKeys(passw);
		  
		  WebElement confirmpass = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
		  String passcon= wb.getSheet("Sheet1").getRow(15).getCell(0).getStringCellValue();
		  confirmpass.sendKeys(passcon);
		  
		  driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
	

	}

}
