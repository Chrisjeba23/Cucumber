package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"src/test/resources/MyCucumberprojectNew/MyCucumberprojectNew/NewFeature.feature" }, glue = {
				"Stepdefinition" })

public class R01Virat {

}
