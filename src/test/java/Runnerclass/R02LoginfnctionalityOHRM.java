package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/MyCucumberprojectNew/MyCucumberprojectNew/F02LoginOHRM.feature"},
glue = {"Stepdefinition"})




public class R02LoginfnctionalityOHRM {

}
