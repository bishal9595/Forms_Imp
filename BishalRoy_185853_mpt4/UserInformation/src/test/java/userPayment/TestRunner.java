package userPayment;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//Running the step defination file named "userPayment.java" and running the junit test case
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Payment"},plugin="pretty")
public class TestRunner {

}