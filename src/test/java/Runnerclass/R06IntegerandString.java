package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/MyCucumberprojectNew/MyCucumberprojectNew/F06IntegerandString.feature"},glue= {"Stepdefinition"},
publish = true,
plugin= {"json:Reports/Cucumber-json.json",
		"junit:Reports/xmlReport.xml"})




public class R06IntegerandString {

}
