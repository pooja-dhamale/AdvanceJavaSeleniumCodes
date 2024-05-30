package ListenerExamples;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNGImplementation extends BaseClass implements ITestListener {
	
	
	@Override
	public void onTestStart(ITestResult Test)
	{
		Reporter.log("Test Case is started");
	}

	LocalDateTime dateTime= LocalDateTime.now();
	String date= dateTime.toString().replace(":", "-");
	@Override
	public void onTestFailure(ITestResult Test)
	{
		Reporter.log("Test Case is Failed");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("screenShot//date+pics.png");
		
		
	}
	
	@Override
	public void onTestSuccess(ITestResult Test)
	{
		Reporter.log("Test Case is run successfully");
	}
}
