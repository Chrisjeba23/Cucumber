package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02LoginfunctionalityOHRM {

	WebDriver driver;

	
	
	@Given("Launch into Orange HRM Login page")
	public void launch_into_orange_hrm_login_page() {

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("Provide valid Username and valid password")
	public void provide_valid_username_and_valid_password() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		

	}

	@When("click on Login button")
	public void click_on_login_button() {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	}

	@Then("Login should happen and the Home page should be displayed")
	public void login_should_happen_and_the_home_page_should_be_displayed() {
		
		
		String Actualurl=driver.getCurrentUrl();
		String Expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		if(Actualurl.equals(Expectedurl))
		{
			System.out.println("Login is successful");
		}
		else {
			System.out.println("Login is not successful");
		}
	}




}
