package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Stepdefinition.S07Hookstestcase;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hookclass {
	
	
	

	@Before
	public void openbrowser()
	{
		S07Hookstestcase.driver=new ChromeDriver();
		S07Hookstestcase.driver.manage().window().maximize();
		S07Hookstestcase.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@After
	public void closebrowser()
	{
		S07Hookstestcase.driver.close();
	}
	

}
