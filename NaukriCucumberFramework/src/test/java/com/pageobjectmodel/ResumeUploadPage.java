package com.pageobjectmodel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaceelements.ResumeUploadInterfaceElements;
import com.reusablemethods.Baseclass;

public class ResumeUploadPage extends Baseclass implements ResumeUploadInterfaceElements {
	
	@FindBy(xpath = upload_xpath)
	private WebElement upload;
	
	@FindBy(xpath = delete_xpath)
	private WebElement delete;
	
	@FindBy(xpath = deletebtn_xpath)
	private WebElement deletebtn;
	
	public ResumeUploadPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//public void resumeUploadPage() throws AWTException, InterruptedException {
		
		//Thread.sleep(8000);
//		ElementClick(delete);
//		staywait(3);
//		ElementClick(deletebtn);
//		Thread.sleep(2000);
//		ElementClick(upload);
//		
//		Robot robot = new Robot();
//		robot.delay(2000);
//		StringSelection ss = new StringSelection("C:\\Users\\saikr\\OneDrive\\Documents\\IPT\\SaiKrishnanPalaniResume_compressed.pdf");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//		
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//	}
//	
		public void getClickUploadResume() {
		
		ElementClick(upload);
		
	}
	
	public void getUploadResume() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		robot.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\saikr\\OneDrive\\Documents\\IPT\\SaiKrishnanPalaniResume_compressed.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}

}
