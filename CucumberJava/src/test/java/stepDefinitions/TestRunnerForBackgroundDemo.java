package stepDefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroundDemo/BackgroundDemo.feature", glue={"BackgroundSteps"}, 
monochrome = true, 
plugin ={"pretty", "junit:target/JUnitReports/report.xml",
		"html:target/HTMLReports/report.html",
"json:target/JSONReports/report.json"})

public class TestRunnerForBackgroundDemo {

}
