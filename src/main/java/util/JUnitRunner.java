package util;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
// @CucumberOptions(features = "src/test/resources/")
@CucumberOptions(dryRun = false, strict = true, features = "src/test/resources/", glue = "com.mysql", tags = {
		"~@dontExecuteThis", "@executeThis" }, monochrome = true, plugin = { "pretty",
		"html:target/cucumber",
		"json:target_json/cucumber.json",
		"junit:target_junit/cucumber.xml"
})

public class JUnitRunner {
}	