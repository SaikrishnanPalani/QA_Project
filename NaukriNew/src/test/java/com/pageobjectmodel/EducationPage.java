package com.pageobjectmodel;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.EducationInterfaceElements;
import com.reusablemethods.Baseclass;
import com.utility.ExcelUtility;

public class EducationPage extends Baseclass implements EducationInterfaceElements {

	@FindBy(xpath = addEducation_xpath)
	private WebElement addeducation;

	@FindBy(xpath = education_xpath)
	private WebElement education;

	@FindBy(xpath = degree_xpath)
	private WebElement degree;

	@FindBy(xpath = institute_xpath)
	private WebElement institute;

	@FindBy(xpath = clgname_xpath)
	private WebElement clgname;

	@FindBy(xpath = course_xpath)
	private WebElement course;

	@FindBy(xpath = coursename_xpath)
	private WebElement coursenameselect;

	@FindBy(xpath = specialization_xpath)
	private WebElement specilizationclick;

	@FindBy(xpath = specializationselect_xpath)
	private WebElement specialization;

	@FindBy(xpath = courseduration_xpath)
	private WebElement courseduration;

	@FindBy(xpath = fromdate_xpath)
	private WebElement fromdate;

	@FindBy(xpath = todateselect_xpath)
	private WebElement todateselect;

	@FindBy(xpath = todate_xpath)
	private WebElement todate;

	@FindBy(xpath = gradingSelect_xpath)
	private WebElement grading;

	@FindBy(xpath = marks_xpath)
	private WebElement marks;

	@FindBy(xpath = text_xpath)
	private WebElement save;

	public EducationPage() {

		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void addEducation() throws IOException, InterruptedException, AWTException {
		refresh_fun();
		Thread.sleep(7000);
		ElementClick(addeducation);
		Thread.sleep(15000);;
		ElementClick(education);
		staywait(7000);
		ElementClick(degree);
		
		ElementClick(institute);
		String insti = ExcelUtility.getCellValue("DATA", "ID", "Institute");
		inputvalue(institute, insti);
		enter();
		
		staywait(12000);
		
		ElementClick(course);
		staywait(2000);
		String course = ExcelUtility.getCellValue("DATA", "ID", "Course");
		ElementClick(coursenameselect);
		staywait(2000);
		
		ElementClick(specilizationclick);
		
		staywait(2000);
		String special = ExcelUtility.getCellValue("DATA", "ID", "Specializations");
		inputvalue(specilizationclick, special);
		Thread.sleep(2000);
		ElementClick(specialization);
		staywait(2000);
		
		ElementClick(courseduration);
		staywait(2000);
		
		ElementClick(fromdate);
		
		staywait(2000);
		
		ElementClick(todateselect);
		staywait(2000);
		
		ElementClick(todate);
		staywait(2000);

		ElementClick(save);
		
		
		
		
		
		
		

	}

}
