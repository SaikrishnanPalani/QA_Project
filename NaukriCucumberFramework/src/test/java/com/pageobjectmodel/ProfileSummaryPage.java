package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.ProfileSummaryInterfaceElements;
import com.reusablemethods.Baseclass;
import com.utility.ExcelUtility;

public class ProfileSummaryPage extends Baseclass implements ProfileSummaryInterfaceElements {
	
	@FindBy(xpath =headedit_xpath)
	private WebElement edit;
	
	@FindBy(xpath =proftext_xpath)
	private WebElement text;
	
	@FindBy(xpath =save_xpath)
	private WebElement save;
	
	@FindBy(xpath=profsum_xpath)
	private WebElement profsum;
	
	public ProfileSummaryPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void profileSummary() throws IOException, InterruptedException {
		
//		Thread.sleep(15000);
//		ElementClick(profsum);
		staywait(8000);
		ElementClick(edit);
		
		staywait(3000);
		ElementClick(text);
		backspace();
		staywait(4000);
		String proftext = ExcelUtility.getCellValue("DATA", "ID", "ProfileSummary");
		inputvalue(text, proftext);
		
		staywait(3000);
		ElementClick(save);
		
		
	}

}
