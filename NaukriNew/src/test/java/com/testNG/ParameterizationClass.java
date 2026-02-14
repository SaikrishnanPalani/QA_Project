package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.bidi.module.Browser;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.reusablemethods.Baseclass;

public class ParameterizationClass extends Baseclass {
	@Parameters({"username","password"})
	@Test
	
	private void testDemo(String username , String password) {
		
		Browserlaunch("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Gettingurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type = 'submit']")).submit();
		
		
	}

}
