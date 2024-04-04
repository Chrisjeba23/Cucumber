package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S01Viratkohli {
	
	WebDriver driver;
	String Actualtitle;
	String Expectedtitle;
	
	@Given("Type Virat Kohli in Search field")
	public void type_virat_kohli_in_search_field() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Virat Kohli");
	    
		
	}

	@When("Click on Enter button")
	public void click_on_enter_button() {
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(Keys.ENTER);
	   
	}

	@Then("the Results of Virat Kohli should be displayed")
	public void the_results_of_virat_kohli_should_be_displayed() {
		
		String Actualtitle=driver.getTitle();
		String Expectedtitle="Virat Kohli - Google Search";
		
		if(Actualtitle.equals(Expectedtitle))
		{
			System.out.println("Test Case passes");
		}
		else {
			System.out.println("test Case failed");
		}
		
	    
	}

}
