package studentRegister;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/register.feature"},glue="studentRegister",plugin = {"pretty"}) 
public class TestRunner {

}