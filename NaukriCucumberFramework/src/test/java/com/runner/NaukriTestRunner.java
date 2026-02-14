package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions (
		
		

		features = {"src\\test\\resources\\Feature_files\\NaukriLoginPage.feature"},
		glue = {"com.stepDefinition"},
				dryRun = false,
				
		plugin = {
				"html:HTMLReports/Naukri.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		
		)



public class NaukriTestRunner {
	
	
	
	
}
 