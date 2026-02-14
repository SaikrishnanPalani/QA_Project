package com.pageobjectmodel;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.KeySkillsInterfaceElements;
import com.reusablemethods.Baseclass;
import com.utility.ExcelUtility;

public class KeySkillsPage extends Baseclass implements KeySkillsInterfaceElements {
	
	@FindBy(xpath = Keyskilledit_xpath )
	private WebElement edit;
	
	@FindBy(id = Addskill_id )
	private WebElement addskill;
	
	@FindBy(xpath =keyskillselect_xpath)
	private WebElement keyselect;
	
	@FindBy(id =saveAddSkill_xpath)
	private WebElement save;
	
	public KeySkillsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void addSkill() throws IOException, InterruptedException, AWTException {
		Thread.sleep(7000);
		ElementClick(edit);
		Thread.sleep(3000);
		ElementClick(addskill);
		Thread.sleep(2000);
		String skill = ExcelUtility.getCellValue("DATA", "ID", "KeySkills");
		inputvalue(addskill, skill);
		Thread.sleep(3000);
		ElementClick(save);
	}
	
	

}
