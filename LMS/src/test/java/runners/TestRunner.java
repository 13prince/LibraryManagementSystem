package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features", // 👈 Required
	    glue = "stepDefinitions",                 // 👈 Required
	    plugin = {
	        "pretty",
	        "html:target/cucumber-reports.html",
	        "json:target/cucumber.json"
	    },
	    monochrome = true
	)

public class TestRunner extends AbstractTestNGCucumberTests {

}
