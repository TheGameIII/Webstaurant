package com.webstaurant.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/failed.txt"
		,glue="com/webstourant/steps"
		,monochrome=true
		)

public class FailedRunner {

}
