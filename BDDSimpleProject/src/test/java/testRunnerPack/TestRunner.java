package testRunnerPack;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		features =  {"src\\test\\resources\\features"}, // relative path of folder
		glue = {"stepdefinitions", "hooks"}  // packge names
		)
public class TestRunner extends AbstractTestNGCucumberTests
{
	
	

}
