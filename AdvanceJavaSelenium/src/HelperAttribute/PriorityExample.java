package HelperAttribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityExample {
	
	
	@Test(priority=0)
	public void login()
	{
		Reporter.log("user is able to login");
	}

	@Test(priority=1)
	public void addtocart()
	{
		Reporter.log("user is able to add the product");
	}

	@Test(priority=2)
	public void logout()
	{
		Reporter.log("user is able to logout");
	}
	
	
}
