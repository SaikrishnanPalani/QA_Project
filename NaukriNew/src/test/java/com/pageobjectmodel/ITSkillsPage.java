package com.pageobjectmodel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.ITSkillsInterfaceElements;
import com.reusablemethods.Baseclass;
import com.utility.ExcelUtility;

public class ITSkillsPage extends Baseclass implements ITSkillsInterfaceElements {
	
	@FindBy(xpath = additskill_xpath)
	private WebElement add;
	
	@FindBy(xpath = skill_xpath)
	private WebElement skill;

	@FindBy(xpath = skillvalue_xpath)
	private WebElement skillvalue;

	@FindBy(xpath = save_xpath)
	private WebElement save;

	public ITSkillsPage() {

		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}

	public void itSkillsPage() throws IOException, InterruptedException {
		
		Thread.sleep(6000);
		ElementClick(add);
		staywait(2000);
		
		ElementClick(skill);
		Thread.sleep(3000);
		String skillname = ExcelUtility.getCellValue("DATA", "ID", "Skill");
		inputvalue(skill, skillname);
		Thread.sleep(2000);
		ElementClick(skillvalue);
		
		staywait(3000);
		
		ElementClick(save);
		

	}

}
