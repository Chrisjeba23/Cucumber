package Stepdefinition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S06IntegerandString {
	
	WebDriver driver;
	String Expectedtitle,Actualtitle;
	
	
	@Given("Launch Amazon website")
	public void launch_amazon_website() {

		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		
		
	}

	@When("Provide {string} mobiles with price below {int}")
	public void provide_mobiles_with_price_below(String product, Integer price) {

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys(product + "below" + price);;
		
		
		
		

	}
	
	@When("Enter button press")
	public void enter_button_press() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys(Keys.ENTER);
	}

	@Then("The search results should be displayed")
	public void the_search_results_should_be_displayed() throws IOException {
		
		Actualtitle=driver.getTitle();
		Expectedtitle="Amazon.in : iPhonebelow50000";
		
		if(Actualtitle.equals(Expectedtitle))
		{
			System.out.println("iPhones with price below 50000 is displayed");
			
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(file, new File("D:\\AmazonLogin\\Pass.jpeg"));
			
		}
		else {
			
			System.out.println("iPhone below 50000 results is not found");
			
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("D:\\AmazonLogin\\Fail.jpeg"));
		}
		
		driver.close();
		

		
	}
	
	

}
