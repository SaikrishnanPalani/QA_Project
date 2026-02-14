package com.testNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.reusablemethods.Baseclass;
import com.utility.ExcelReader;

public class TestNGExcelDataProvider extends Baseclass {
	
	@DataProvider(name = "excelDataProvider")
	public Object[][] dataProviderMethod() throws IOException{
		String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx";
		String sheetName = "data";
		return ExcelReader.getExcelData(filePath, sheetName);
	}
	@Test(dataProvider = "excelDataProvider")
	
	private void testMethod(String username , String password) {
		
		Browserlaunch("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Gettingurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type = 'submit']")).submit();
		
		
	}

}
