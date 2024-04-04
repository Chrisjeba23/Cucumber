package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S04testAutomationlogin {

	WebDriver driver;
	String Actualtitle, Expectedtitle;

	@Given("Launch test Automation Login page")
	public void launch_test_automation_login_page() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@When("I provide valid username as {string}")
	public void i_provide_valid_username_as(String un) {
		
		driver.findElement(By.id("username")).sendKeys(un);
	}

	@When("I provide valid Password as {string}")
	public void i_provide_valid_password_as(String pwd) {
		
		driver.findElement(By.id("password")).sendKeys(pwd);
		
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		
		driver.findElement(By.id("submit")).click();
		
	}

	@Then("Login should happen and Home page should be landed")
	public void login_should_happen_and_home_page_should_be_landed() {
		
		Actualtitle=driver.getTitle();
		Expectedtitle="Logged In Successfully | Practice Test Automation";
		
		if(Actualtitle.equals(Expectedtitle))
		{
			System.out.println("Login is successful");
		}
		else {
			System.out.println("Login is not successful");
		}
		
		
		
	}

	@When("provide invalid username as {string}")
	public void provide_invalid_username_as(String un) {
	
		driver.findElement(By.id("username")).sendKeys(un);
	}

	@When("provide invalid password as {string}")
	public void provide_invalid_password_as(String pwd) {

		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click over the Login button")
	public void click_over_the_login_button() {
		driver.findElement(By.id("submi")).click();
	}

	@Then("Login should not happen and error message should display")
	public void login_should_not_happen_and_error_message_should_display() {

		
		Actualtitle=driver.getTitle();
		Expectedtitle="Logged In Successfully | Practice Test Automation";
		
		if(Actualtitle.equals(Expectedtitle))
		{
			System.out.println("Login is successful");
		}
		else {
			System.out.println("Login is not successful");
		
	}

}
}
