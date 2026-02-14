package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.ResumeHeadlineInterfaceElements;
import com.reusablemethods.Baseclass;
import com.utility.ExcelUtility;

public class ResumeHeadlinePage extends Baseclass implements ResumeHeadlineInterfaceElements {
	
	@FindBy(xpath = reshead_xpath)
	private WebElement head;

	@FindBy(xpath = headclick_xpath)
	private WebElement headclick;

	@FindBy(xpath = headsave_xpath)
	private WebElement headsave;

	public ResumeHeadlinePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void resumeHeadlinePage() throws InterruptedException, IOException {
		
		Thread.sleep(7000);
		ElementClick(head);
		staywait(5000);
		ElementClick(headclick);
		staywait(3000);
		backspace();
		staywait(4000);
		String headline = ExcelUtility.getCellValue("DATA", "ID", "Resumeheadline");
		inputvalue(headclick, headline);
		ElementClick(headsave);
	}
	
}
