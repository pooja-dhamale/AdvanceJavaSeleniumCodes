package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityMethod {
	
	public String getDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./testdata/testpropertydata.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
	public String getExcelDatafromFile(String sheetname, int rowNum, int colNum) throws Throwable, Throwable
	{
		FileInputStream fis=new FileInputStream("./testdata/exceldata.xlsx");
		Workbook wp=WorkbookFactory.create(fis);
		Sheet sheet=wp.getSheet(sheetname);
		return sheet.getRow(rowNum).getCell(colNum).toString();
	}

}
