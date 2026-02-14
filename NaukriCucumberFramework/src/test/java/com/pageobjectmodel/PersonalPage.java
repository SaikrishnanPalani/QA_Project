package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.PersonalDetailsInterfaceElements;
import com.reusablemethods.Baseclass;

public class PersonalPage extends Baseclass implements PersonalDetailsInterfaceElements{
	
	@FindBy(xpath = Personalselect_xpath)
	private WebElement personal;
	
	
	@FindBy(xpath = Catogory_xpath)
	private WebElement catogry;
	
	
	@FindBy(xpath = addlang_xpath)
	private WebElement addlang;
	
	
	@FindBy(xpath = langclick_xpath)
	private WebElement clicklang;
	
	
	@FindBy(xpath = hindi_xpath)
	private WebElement selecthindi;
	
	
	@FindBy(xpath = clickselectprof_xpath)
	private WebElement clickprof;
	
	
	@FindBy(xpath = prof_xpath)
	private WebElement profeciency;
	
	
	@FindBy(xpath = save_xpath)
	private WebElement save;
	
	public PersonalPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void personalPage() throws InterruptedException {
		Thread.sleep(8000);
		ElementClick(personal);
		holdimplicit(4);
		
		ElementClick(catogry);
		holdimplicit(3);
		
		ElementClick(addlang);
		holdimplicit(3);
		
		ElementClick(clicklang);
		holdimplicit(3);
		
		ElementClick(selecthindi);
		holdimplicit(3);
		
		ElementClick(clickprof);
		holdimplicit(3);
		
		ElementClick(profeciency);
		holdimplicit(3);
		
		ElementClick(save);
		
		
	}
	
	
	

}
