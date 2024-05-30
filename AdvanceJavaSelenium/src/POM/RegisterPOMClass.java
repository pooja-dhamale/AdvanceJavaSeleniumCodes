package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOMClass {

	public RegisterPOMClass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="gender-male")
	private WebElement maleradiobutton;
	
	@FindBy(id="gender-female")
	private WebElement femaleradiobutton;
	
	@FindBy(id="FirstName")
	private WebElement firstnametextfield;
	
	@FindBy(id="LastName")
	private WebElement lastnametextfield;
	
	@FindBy(id="Email")
	private WebElement emailtextfield;
	
	@FindBy(id="Password")
	private WebElement passwordfield;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordfield;
	
	@FindBy(id="register-button")
	WebElement registercta;

	// need to create a getter method in pom class
	
	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getConfirmPasswordfield() {
		return ConfirmPasswordfield;
	}

	public WebElement getRegisterbutton() {
		return registercta;
	}

	public WebElement getMaleradiobutton() {
		return maleradiobutton;
	}

	public WebElement getFemaleradiobutton() {
		return femaleradiobutton;
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}
}
