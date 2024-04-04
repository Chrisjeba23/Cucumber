package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/MyCucumberprojectNew/MyCucumberprojectNew/F04TestAutomationLogin.feature"},
glue = {"Stepdefinition","Hooks"},publish = true )




public class R04testAutomationlogin {

}
