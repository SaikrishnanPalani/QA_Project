package com.pageobjectmodel;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.interfaceelements.ProjectsInterfaceElements;
import com.reusablemethods.Baseclass;
import com.utility.ExcelUtility;

public class ProjectsPage extends Baseclass implements ProjectsInterfaceElements {
	
	
	@FindBy(xpath = addproject_xpath)
	private WebElement addproject;
	
	
	@FindBy(xpath = projecttitle_xpath)
	private WebElement projtitle;
	
	@FindBy(xpath = client_xpath)
	private WebElement clientclick;
	
	@FindBy(xpath = clientclick_xpath)
	private WebElement clientselect;
	
	@FindBy(xpath = startyearclick_xpath)
	private WebElement startclick;
	
	
	@FindBy(xpath = fromdate_xpath)
	private WebElement fromdateselect;
	
	@FindBy(xpath = startmonthselect_xpath)
	private WebElement startmonthclick;
	
	@FindBy(xpath = startmonth_xpath)
	private WebElement startmonthselect;
	
	@FindBy(xpath = save_xapth)
	private WebElement save;
	
	@FindBy(xpath = link_xpath)
	private WebElement linkclick;
	
	@FindBy(xpath = linkitem_xpath)
	private WebElement linkitem;
	
	@FindBy(xpath = prjdetail_xpath)
	private WebElement prjdetail;
	
	public ProjectsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void projectPage() throws IOException, InterruptedException, AWTException {
		
		Thread.sleep(7000);
		ElementClick(addproject);
		Thread.sleep(15000);;
		
		ElementClick(projtitle);
		Thread.sleep(2000);
		String project = ExcelUtility.getCellValue("DATA", "ID", "Project");
		inputvalue(projtitle,project);
		
		Thread.sleep(3000);
		//tab();
		Thread.sleep(3000);
		ElementClick(linkclick);
		//clickWhenReady(clientselect,5);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='sugInp']")));
		Thread.sleep(2000);		
		ElementClick(linkitem);
		Thread.sleep(3000);
		ElementClick(clientclick);
		staywait(3);
		String client = ExcelUtility.getCellValue("DATA", "ID", "ClientCompany");
		inputvalue(clientclick, client);
		staywait(4000);
		enter();
		Thread.sleep(2000);
		ElementClick(clientselect);
		
		Thread.sleep(2000);
		
		ElementClick(prjdetail);
		holdimplicit(3);
		String proj = ExcelUtility.getCellValue("DATA", "ID", "Projectdetail");
		inputvalue(prjdetail, proj);
		
		holdimplicit(4);
		
		ElementClick(startclick);
		
		ElementClick(fromdateselect);
		Thread.sleep(2000);
		
		ElementClick(startmonthclick);
		
		Thread.sleep(2000);
		
		ElementClick(startmonthselect);
		
		Thread.sleep(9000);
		
		ElementClick(save);
		
		
		
	}
	
	
	

}
