  package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.LoginPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.reusablemethods.Baseclass;
import com.utility.ExcelUtility;

public class LoginPage extends Baseclass implements LoginPageInterfaceElements{
	
	@FindBy(id = username_id)
	private WebElement username;
	
	@FindBy(xpath = password_xpath)
	private WebElement pass;
	
	@FindBy(xpath =login_xpath)
	private WebElement login;
	
	@FindBy(xpath = valid_xpath)
	private WebElement title;

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void validLogin() throws IOException, InterruptedException {
		Thread.sleep(5000);
		inputvalue(username,PageObjectManager.getPageobjectmanager().getFilereadermanager().getDataProperty("username"));
		inputvalue(pass,PageObjectManager.getPageobjectmanager().getFilereadermanager().getDataProperty("password"));
		ElementClick(login);
		Thread.sleep(4000);
		validation(title,ExcelUtility.getCellValue("DATA", "ID", "Title"));
		
	}
	
}
