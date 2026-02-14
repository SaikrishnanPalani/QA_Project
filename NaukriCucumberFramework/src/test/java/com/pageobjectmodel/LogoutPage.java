package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.LogoutInterfaceElements;
import com.reusablemethods.Baseclass;

public class LogoutPage extends Baseclass implements LogoutInterfaceElements{
	
	@FindBy(xpath = clickbar_xpath)
	private WebElement bar;
	
	@FindBy(xpath = logout_xpath)
	private WebElement logout;
	
	public LogoutPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void pageLogout() throws InterruptedException {
		
		Thread.sleep(7000);
		ElementClick(bar);
		holdimplicit(4);
		
		ElementClick(logout);
		}

}
