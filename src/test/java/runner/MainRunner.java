package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports/cucumber-html-demo.html",
		"json:target/cucumber-reports/cucumber-html-demo.json",
		"junit:target/cucumber-reports/cucumber-html-demo.xml" }, features = "src/test/resources/features", glue = "stepDef", dryRun = false)
public class MainRunner {

}
