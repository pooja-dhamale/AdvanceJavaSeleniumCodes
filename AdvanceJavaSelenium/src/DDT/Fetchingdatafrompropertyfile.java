package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchingdatafrompropertyfile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream("./testdata/testpropertydata.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		System.out.println(pro.getProperty("Url"));
		
		String url = pro.getProperty("Url");
		driver.get(url);
		
		
	 

	}

	

}
