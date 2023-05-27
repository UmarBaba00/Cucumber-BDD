package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksSteps {

	WebDriver driver = null;

	@Before(order = 1)
	public void browserSetup() {

		System.out.println("I'm inside browserSetup");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before(value = "@smoke or @regression", order = 1)
	public void setup2() {
		System.out.println("I'm  inside setup2----");
	}

	@After(order = 0)   
	public void teardown() {
		System.out.println("I'm inside teardown");
		driver.close();
		driver.quit();
	}
	
	@After(order = 1)
	public void teardown2() {
		System.out.println("I'm inside teardown2----");
	}

	@BeforeStep
	public void beforeSteps() {
		System.out.println("I'm inside beforeSteps-----");
	}

	@AfterStep
	public void afterSteps() {
		System.out.println("I'm inside afterSteps-----");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {

	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

	}


	@When("clicks on login button")
	public void clicks_on_login_button() {

	}
	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {

	}




}
