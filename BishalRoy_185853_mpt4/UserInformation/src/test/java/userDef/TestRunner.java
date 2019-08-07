package userDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//Running the step defination file named "userDefination.java" and running the junit test case
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Information"},plugin="pretty")  // Running the main class for junit test case
public class TestRunner {

}