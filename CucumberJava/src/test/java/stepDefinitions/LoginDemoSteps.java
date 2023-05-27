package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.loginPage;

public class LoginDemoSteps {
//	WebDriver driver = null;
//	loginPage login;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		String projectPath = System.getProperty("user.dir");   //relative path of project
//		System.out.println("Project path is:" + projectPath);
//		System.out.println("Inside Step - browser is open");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() throws InterruptedException {
//		 driver.navigate().to("https://example.testproject.io/web/");
//		 Thread.sleep(2000);
//	   
//	}
//
//	@When("^user enters (.*) and (.*)$")  //^ and $ symbol is used to show data entered into username and password fields.
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		
//		login = new loginPage(driver);
//		login.enter_UserName(username);
//		login.enter_Password(password);
//		
//		
//		
////	    By UserName = By.id("name");
////	    By Password = By.id("password");
////	    driver.findElement(UserName).sendKeys(username);
////	    driver.findElement(Password).sendKeys(password);
//	    Thread.sleep(2000);
//	    
//	}
//	
//	@And("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException {
//		login.clicl_login();
//		
//		
////		By login = By.id("login");
////		driver.findElement(login).click();
////		 Thread.sleep(2000);
//	    
//	}
//
//
//	@Then("user is navigate to home page")
//	public void user_is_navigate_to_home_page() throws InterruptedException {
//		login.btn_logoutisDisplayed();
//		
//		
////		By logout = By.id("logout");
////		driver.findElement(logout).isDisplayed();
//		 Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//	    
//	}
}
