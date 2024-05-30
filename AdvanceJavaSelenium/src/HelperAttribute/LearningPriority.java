package HelperAttribute;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class LearningPriority {

	
	@Test(priority=0)
	public void login()
	{
		Reporter.log("user is able to login",true);
	}
	
	@Test(priority=1)
	public void addtocart()
	{
		Reporter.log("user is able to add the product into cart",true);
	}
	
	@Test(priority=2)
	public void logout()
	{
		Reporter.log("user is able to logout",true);
	}
	
}
