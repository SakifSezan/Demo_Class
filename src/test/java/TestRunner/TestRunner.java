package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"},
plugin = {"json:target/cucumber.json"},
glue = "DemoStepDefinition",tags = {"@tag1"})

public class TestRunner extends AbstractTestNGCucumberTests {

}
  