package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags", 
glue={"stepDefinitions"},
tags = ("(@smoke or @regression) and not @important")
)

public class TestRunner_RunWithSingleTage {

}
