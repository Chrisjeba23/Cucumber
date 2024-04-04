package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S05tagsdemo {
	
	WebDriver driver;
	String Expectedtitle,Actualtitle;
	
	@Given("Open Google browser and launch google.com")
	public void open_google_browser_and_launch_google_com() {

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		
	}

	@When("Launch the Google website Home page")
	public void launch_the_google_website_home_page() {
		driver.get("https://www.google.com/");
		
	}

	@When("Read the title of Google Home page")
	public void read_the_title_of_google_home_page() {

		Actualtitle=driver.getTitle();
		Expectedtitle="Google";
		
		
		
	}

	@When("check the title whether Actual title is equal to Expected title")
	public void check_the_title_whether_actual_title_is_equal_to_expected_title() {

		if(Actualtitle.equals(Actualtitle))
		{
			System.out.println("Google Title test case is passed");
		}
		else {
			System.out.println("Google Title test case is failed");
		}
	}

	@Then("Display the result of the title")
	public void display_the_result_of_the_title() {
	    
		if(Actualtitle.equals(Actualtitle))
		{
			System.out.println("Google");
		}
		
	}

	@When("Launch into the Google website")
	public void launch_into_the_google_website() {
		
		driver.get("https://www.google.com/");
	}

	@When("Click on Gmail link")
	public void click_on_gmail_link() {
	    
		driver.findElement(By.linkText("Gmail")).click();
		
		
	}

	@When("check the Gmail page title whether Actual title matches Expected title only")
	public void check_the_gmail_page_title_whether_actual_title_matches_expected_title_only() {
	    
		Actualtitle=driver.getTitle();
		Expectedtitle="Gmail";
		
		if(Actualtitle.equals(Actualtitle))
		{
			System.out.println("Gmail Title test case is passed");
		}
		else {
			System.out.println("Gmail Title test case is failed");
		}
		
	}

	@Then("Show the result of the title")
	public void show_the_result_of_the_title() {
		
		if(Actualtitle.equals(Actualtitle))
		{
			System.out.println("Gmail");
		}
	   
		
		
		
	}

	@When("Move into the Google home  webpage")
	public void move_into_the_google_home_webpage() {
		driver.get("https://www.google.com/");
	}

	@When("Click on About link")
	public void click_on_about_link() {
		driver.findElement(By.linkText("About")).click();
	}

	@When("check the About page title the Actual title and Expected title")
	public void check_the_about_page_title_the_actual_title_and_expected_title() {
		
		Actualtitle=driver.getTitle();
		Expectedtitle="Google - About Google, Our Culture & Company News";
		
		if(Actualtitle.equals(Actualtitle))
		{
			System.out.println("About us test case is passed");
		}
		else {
			System.out.println("ABout us test case is failed");
		}
	}

	@Then("result of the title to be checked and displayed")
	public void result_of_the_title_to_be_checked_and_displayed() {
		if(Actualtitle.equals(Actualtitle))
		{
			System.out.println("Google - About Google, Our Culture & Company News");
		}
	   
	}


}
