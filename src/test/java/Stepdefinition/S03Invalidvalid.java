package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03Invalidvalid {

	WebDriver driver;
	
	@Given("Open Orange HRM application")
	public void open_orange_hrm_application() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Provide Valid username and valid password")
	public void provide_valid_username_and_valid_password() {

		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))
		.sendKeys("Admin");
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))
		.sendKeys("admin123");
	}

	@When("click on the loginn buttonn")
	public void click_on_the_loginn_buttonn() {

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("Login should happen successfully")
	public void login_should_happen_successfully() {

		String Actualurl = driver.getCurrentUrl();
		String Expectedurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		if (Actualurl.equals(Expectedurl)) {
			System.out.println("Login is successful");
		} else {
			System.out.println("Login is not successful");
		}
	}

	@When("Provide Invalid username and Invalid password")
	public void provide_invalid_username_and_invalid_password() {

		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))
		.sendKeys("veran");
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))
		.sendKeys("wait123");
	}

	@When("Press over the login buttonn")
	public void press_over_the_login_buttonn() {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("Login should not happen and Error message should display")
	public void login_should_not_happen_and_error_message_should_display() {
		String Actualurl = driver.getCurrentUrl();
		String Expectedurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		if (Actualurl.equals(Expectedurl)) {
			System.out.println("Login is successful");
		} else {
			System.out.println("Login is not successful");
		}
	}

}
