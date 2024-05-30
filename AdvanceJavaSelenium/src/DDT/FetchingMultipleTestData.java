
	package DDT;
	 
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Iterator;
	 
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	 
	public class FetchingMultipleTestData {
	 
		@DataProvider
		public String[][] testData() throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream("./testData/ExcelData.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			int noofRow=wb.getSheet("Sheet2").getPhysicalNumberOfRows();
			int noOfColum=wb.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();
			String[][] data=new String[noofRow][noOfColum];
			for(int i=0;i<noofRow;i++)
			{
				for(int j=0;j<noOfColum;j++)
				{
					data[i][j]=wb.getSheet("Sheet2").getRow(i).getCell(j).toString();
				}
			}
			
			return data;
		}
			
			@Test(dataProvider="testData")
			public void registerUser(String[] tetData)
			{
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demowebshop.tricentis.com/register");
				if(tetData[0].equalsIgnoreCase("female"))
				{
					driver.findElement(By.id("gender-female")).click();
				}
				else
				{
					driver.findElement(By.id("gender-male")).click();
				}
				driver.findElement(By.id("FirstName")).sendKeys(tetData[1]);
				driver.findElement(By.id("LastName")).sendKeys(tetData[2]);
				driver.findElement(By.id("Email")).sendKeys(tetData[3]);
				driver.findElement(By.id("Password")).sendKeys(tetData[4]);
				driver.findElement(By.id("ConfirmPassword")).sendKeys(tetData[5]);
				driver.findElement(By.xpath("//input[@value='Register']")).click();
			}
		}
	 


