package HelperAttribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnExample {

	@Test
		public Void login()
		{
			Reporter.log("user is able to login",true);
			return null;
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