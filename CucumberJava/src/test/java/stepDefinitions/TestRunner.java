package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"stepDefinitions"}, 
monochrome = true, 
plugin ={"pretty", "junit:target/JUnitReports/report.xml",
		"html:target/HTMLReports/report.html",
"json:target/JSONReports/report.json"})
//tags="@smoketest")
public class TestRunner {

}
