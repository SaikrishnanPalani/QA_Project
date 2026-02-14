package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.ProfileUpdateInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.reusablemethods.Baseclass;
import com.utility.ExcelUtility;

public class ProfileUpdatePage extends Baseclass implements ProfileUpdateInterfaceElements {

	@FindBy(xpath = profile_xpath)
	private WebElement profile;

	@FindBy(xpath = viewupdate_xpath)
	private WebElement viewupdate;

	@FindBy(xpath = edit_xpath)
	private WebElement edit;

	@FindBy(xpath = experience_xpath)
	private WebElement experience;

	@FindBy(xpath = years_xpath)
	private WebElement years;

	@FindBy(xpath = currency_xpath)
	private WebElement currency;

	@FindBy(xpath = currenctinput_xpath)
	private WebElement currencyinput;

	@FindBy(xpath = salarybreak_xpath)
	private WebElement salarybreak;

	@FindBy(xpath = availablity_xpath)
	private WebElement availablity;

	@FindBy(xpath = save_xpath)
	private WebElement save;

	@FindBy(xpath = currencyvalue_xpath)
	private WebElement currencyvalue;

	@FindBy(xpath = currentloc_xpath)
	private WebElement loc;
	@FindBy(xpath = fixed_xpath)
	private WebElement fixed;

	public ProfileUpdatePage() {

		PageFactory.initElements(driver, this);
	}

	public void profileUpdatePage() throws IOException, InterruptedException {
		
		
		Thread.sleep(6000);
		ElementClick(profile);
		Thread.sleep(4000);
		ElementClick(viewupdate);
		Thread.sleep(3000);
		ElementClick(edit);
		Thread.sleep(2000);
		ElementClick(experience);
		Thread.sleep(2000);
		ElementClick(years);
//		ElementClick(currency);
//		Thread.sleep(4000);
//		ElementClick(currencyvalue);
		Thread.sleep(4000);
		// inputvalue(currencyinput,ExcelUtility.getCellValue("DATA", "ID","Salary" ));
		String salary = ExcelUtility.getCellValue("DATA", "ID", "Salary");
//		inputvalue(currencyinput,PageObjectManager.getPageobjectmanager().getFilereadermanager().getDataProperty(salary) );
		ElementClick(currencyinput);
		backspace();
		Thread.sleep(4000);
		inputvalue(currencyinput, salary);
		Thread.sleep(4000);
		ElementClick(salarybreak);
		staywait(3);
		ElementClick(fixed);
		Thread.sleep(2000);
//		ElementClick(loc);
		Thread.sleep(2000);
		ElementClick(availablity);
		Thread.sleep(2000);
		ElementClick(save);
	}

}
