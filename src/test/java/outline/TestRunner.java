package outline;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src\\test\\features\\Login_Test.feature"
 ,glue={"outline"}
 )
 
public class TestRunner {
 
}