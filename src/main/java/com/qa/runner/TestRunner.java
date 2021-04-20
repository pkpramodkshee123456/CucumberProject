package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\pramo\\eclipse-workspace\\CucumberFrameworkFinal\\src\\test\\java\\com\\qa\\features\\login.feature",
 glue={"C:\\Users\\pramo\\eclipse-workspace\\CucumberFrameworkFinal\\src\\test\\java\\com\\qa\\stepdefinition"},
 dryRun=true
  
 )
public class TestRunner {

}
