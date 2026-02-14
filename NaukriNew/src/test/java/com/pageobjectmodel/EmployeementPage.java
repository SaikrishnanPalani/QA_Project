package com.pageobjectmodel;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.interfaceelements.EmployeementInterfaceElements;
import com.reusablemethods.Baseclass;
import com.utility.ExcelUtility;

public class EmployeementPage extends Baseclass implements EmployeementInterfaceElements {

	@FindBy(xpath = addEmployement_xpath)
	private WebElement addemp;

	@FindBy(xpath = searcharrow_xpath)
	private WebElement search;

	@FindBy(xpath = exp_xpath)
	private WebElement experience;

	@FindBy(id = currcompany_id)
	private WebElement currentcompany;

	@FindBy(id = desg_id)
	private WebElement designation;

	@FindBy(xpath = joinarrow_xpath)
	private WebElement joining;

	@FindBy(xpath = joindate_xpath)
	private WebElement joiningdate;

	@FindBy(id = skillUsed_id)
	private WebElement skills;

	@FindBy(xpath = notice_xpath)
	private WebElement noticearrow;

	@FindBy(xpath = noticenum_xpath)
	private WebElement noticeperiod;

	@FindBy(id = submit_id)
	private WebElement save;

	@FindBy(xpath = company_xpath)
	private WebElement company;

	@FindBy(xpath = designation_xpath)
	private WebElement designationselect;

	@FindBy(xpath = skill_xpath)
	private WebElement skillin;

	@FindBy(xpath = joinmonthselect_xpath)
	private WebElement joinselect;

	@FindBy(xpath = joinmonth_xpath)
	private WebElement join;

	@FindBy(xpath = expmonselect_xpath)
	private WebElement expmonselect;

	@FindBy(xpath = expmon_xpath)
	private WebElement expmonth;
	
	@FindBy(xpath = empform_xpath)
	private WebElement form;

	public EmployeementPage() {

		PageFactory.initElements(driver, this);
	}

	public void employmentyPage() throws InterruptedException, IOException, AWTException {
		Thread.sleep(7000);
		refresh_fun();
		jsClick(addemp);
		Thread.sleep(15000);
		//driver.findElement(By.xpath("\"//*[@id='add-employment']\";")).click();
		//waitForVisibility(form,120);
		ElementClick(search);
		Thread.sleep(2000);
		ElementClick(experience);
		Thread.sleep(2000);

		ElementClick(expmonselect);

		Thread.sleep(2000);

		ElementClick(expmonth);

		Thread.sleep(2000);
		ElementClick(currentcompany);
		Thread.sleep(2000);
		String curcom = ExcelUtility.getCellValue("DATA", "ID", "Current Company");
		inputvalue(currentcompany, curcom);
		Thread.sleep(4000);
		ElementClick(company);
		Thread.sleep(3000);
		ElementClick(designation);
		Thread.sleep(2000);
		String desig = ExcelUtility.getCellValue("DATA", "ID", "Job Title");
		inputvalue(designation, desig);
		Thread.sleep(2000);
		ElementClick(designationselect);
		Thread.sleep(2000);
		ElementClick(joining);
		Thread.sleep(2000);
		ElementClick(joiningdate);
		Thread.sleep(2000);

		ElementClick(joinselect);
		Thread.sleep(2000);

		ElementClick(join);

		Thread.sleep(2000);
		ElementClick(skills);
		Thread.sleep(2000);
		String skill = ExcelUtility.getCellValue("DATA", "ID", "Skillused");
		inputvalue(skills, skill);
		Thread.sleep(2000);
		ElementClick(skillin);
		Thread.sleep(2000);
		ElementClick(noticearrow);
		Thread.sleep(4000);
//		ElementClick(noticeperiod);
		// jsClick(noticeperiod);
//		String notice = ExcelUtility.getCellValue("DATA", "ID", "NoticePeriod");
//		inputvalue(noticearrow, notice);
//		Thread.sleep(3000);
//		enter();
		ElementClick(noticeperiod);
		Thread.sleep(4000);
		jsClick(save);

	}

}
