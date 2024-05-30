package HelperAttribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DeendsOnMethods {
	
	
	@Test
	public void login()
	{
		Reporter.log("user is able to login",true);
	}
	
	@Test(dependsOnMethods="login")
	public void addtocart()
	{
		Reporter.log("user is able to add the product into cart",true);
	}
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		Reporter.log("user is able to logout",true);
	}

}
