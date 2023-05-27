package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
	WebDriver driver;

	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
//		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}

	@FindBy(id = "name")
	WebElement enter_username;

	@FindBy(id = "password")
	WebElement enter_password;

	@FindBy(id = "login")
	WebElement click_login;
	
//	@FindBy(partialLinkText = "Umar")
//	List<WebElement> myLinks;


	public void enter_UserName (String username) {
		enter_username.sendKeys(username);

	}

	public void enter_Password(String password) {
		enter_password.sendKeys(password);
	}

	public void clicl_login() {
		click_login.click();
	}


}
