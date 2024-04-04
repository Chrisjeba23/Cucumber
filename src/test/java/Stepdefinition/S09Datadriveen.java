package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S09Datadriveen {
	
	WebDriver driver;
	String Acturl,Expurl;
	
	@Given("Launch into the Test Automation login webpage")
	public void launch_into_the_test_automation_login_webpage() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	    
	}

	@When("Provide the {string} and {string} click on Login button")
	public void provide_the_and_click_on_login_button(String un, String pwd) {
		
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("submit")).click();
	    
		
	}

	@Then("New Login should happen")
	public void new_login_should_happen() {
	    
		Acturl=driver.getCurrentUrl();
		Expurl="https://practicetestautomation.com/logged-in-successfully/";
		
		if(Acturl.equals(Expurl))
		{
			System.out.println("Login is successful");
		}
		
		else {
			System.out.println("Login is failed");
		}
		
		driver.quit();
	}


}
