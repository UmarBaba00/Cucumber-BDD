package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import pages.loginPage;

public class LoginDemoSteps_PF {
	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;

	@Given("browser is open")
	public void browser_is_open() {
		String projectPath = System.getProperty("user.dir");   //relative path of project
		System.out.println("Project path is:" + projectPath);
		System.out.println("Inside Step - browser is open");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(2000);

	}

	@When("^user enters (.*) and (.*)$")  //^ and $ symbol is used to show data entered into username and password fields.
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {

		login = new LoginPage_PF(driver);
		login.enter_UserName(username);
		login.enter_Password(password);
		Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		login.clicl_login();
	}


	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() throws InterruptedException {
		home = new HomePage_PF(driver);
		home.btn_logoutisDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}
}
