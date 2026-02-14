package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.CareerProfileInterfaceElement;
import com.reusablemethods.Baseclass;

public class CareerProfilePage extends Baseclass implements CareerProfileInterfaceElement {
	
	@FindBy(xpath = careeredit_xpath)
	private WebElement edit;
	
	@FindBy(xpath = jobtype_xpath)
	private WebElement jobtype;
	
	@FindBy(xpath = employementtype_xpath)
	private WebElement emptype;
	
	@FindBy(xpath = save_xpath)
	private WebElement save;
	
	@FindBy(xpath =careerselect_xpath)
	private WebElement carsel;
	
	
	
	public CareerProfilePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void careerProfilePage() throws InterruptedException {
		Thread.sleep(5000);
		ElementClick(carsel);
		Thread.sleep(5000);;
		
		scrollToElement(edit);
		Thread.sleep(9000);
		ElementClick(edit);
		
		//scrollToElement(jobtype);
		Thread.sleep(8000);;
		
		
		ElementClick(jobtype);
		
		Thread.sleep(9000);
		//ElementClick(emptype);
		
		holdimplicit(4);
		scrollToElement(save);
		ElementClick(save);
	}
	

}
