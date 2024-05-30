package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePomClass extends BaseClass {

	public HomePagePomClass(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="small-searchterms")
	private WebElement serachbox;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement Jewelery;
	
	@FindBy(partialLinkText = "Register")
	private WebElement RegisterButton;

	public WebElement getRegistertext() {
		return RegisterButton;
	}


	public WebElement getSerachbox() {
		return serachbox;
	}

	public WebElement getJewelery() {
		return Jewelery;
	}
	
	
}
