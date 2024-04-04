package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Hooks.Hookclass;
import Runnerclass.R07Hooks;
import io.cucumber.java.en.*;

public class S07Hookstestcase {

	public static WebDriver driver;
    
	

	@Given("Open Amazon webpage in the browser")
	public void open_amazon_webpage_in_the_browser() {

		driver.get("https://www.amazon.in/");
	}

	@When("Click on the Bestsellers menu")
	public void click_on_the_bestsellers_menu() {

		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();

	}

	@Then("Check the Actual and Expected title are equal")
	public void check_the_actual_and_expected_title_are_equal() {

		String acttit=driver.getTitle();
		String exptit="Amazon.in Bestsellers: The most popular items on Amazon";
		
		if(acttit.equals(exptit))
		{
			System.out.println("Best sellers menu page is launched");
		}
		else {
			System.out.println("Best sellers menu page is not launched");
		}
		
		
		
		
		

	}

}
