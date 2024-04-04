package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/MyCucumberprojectNew/MyCucumberprojectNew/F08Lists.feature"},
glue= {"Stepdefinition"},publish =true)

public class R08Lists {

}
