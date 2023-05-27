package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
//	WebDriver driver = null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//		
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
//	   
//	}
//
//	@And("user is on search page")
//	public void user_is_on_search_page() {
//	    System.out.println("Inside Step - user is on search page");
//	    driver.navigate().to("https://www.google.com/");
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//	   System.out.println("Inside Step - user enters a text in search box");
//	   
//	   By searchbox = By.name("q");
//	   driver.findElement(searchbox).sendKeys("Automation Step-by-Step");
//	   Thread.sleep(2000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//	    System.out.println("Inside Step - hits enter");
//	    
//	    By btn_click = By.name("q");
//	    driver.findElement(btn_click).sendKeys(Keys.ENTER);
//	    Thread.sleep(2000);
//	}
//
//	@Then("user is navigated to search result")
//	public void user_is_navigated_to_search_result() {
//	    System.out.println("Inside Step - user is navigated to search result");
//	    driver.getPageSource().contains("Online Courses");   //Check element is present on page
//	    driver.close();
//	    driver.quit();
//	}


}
