package com.testrunner.sprinttwo;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/Java", // feature file
		glue={"com.stepdefinition.sprinttwo"},
		plugin = {"json:target/reports/report.json","junit:target/reports/report.xml"},
		strict = true
		//monochrome=true
		)
public class Test_Runner
{

}
