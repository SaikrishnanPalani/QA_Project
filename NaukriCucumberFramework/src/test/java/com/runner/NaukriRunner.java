package com.runner;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listner.ExtentReport_Test;
import com.listner.ITestListnerClass;
import com.pageobjectmanager.PageObjectManager;
import com.reusablemethods.Baseclass;

@Listeners(ITestListnerClass.class)
public class NaukriRunner extends Baseclass {
	@BeforeClass

	public void propertySetup() throws IOException {

		Browserlaunch(PageObjectManager.getPageobjectmanager().getFilereadermanager().getDataProperty("browser"));
		Gettingurl(PageObjectManager.getPageobjectmanager().getFilereadermanager().getDataProperty("url"));

	}

	@Test(priority = 0)

	public void NaukriLogin() throws IOException, InterruptedException {
		ExtentReport_Test.extenttest = extentReports
				.createTest("LOGIN TEST" + ":" + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Naukri Application Testing");
		PageObjectManager.getPageobjectmanager().getLoginpage().validLogin();
		
		setImplicitWait(5);
	}

	@Test(priority = 1)

	public void ProfileUpdatePage() throws IOException, InterruptedException {
		ExtentReport_Test.extenttest = extentReports
				.createTest("PROFILEUPDATE TEST" + ":"
						+ Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Naukri Application Testing");
		PageObjectManager.getPageobjectmanager().getProfileUpdatePage().profileUpdatePage();
		setImplicitWait(4);
	}

	@Test(priority = 2)
	public void ResumeUploadPage() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		ExtentReport_Test.extenttest = extentReports
				.createTest("RESUME UPLOAD TEST" + ":"
						+ Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Naukri Application Testing");
		PageObjectManager.getPageobjectmanager().getResumeuploadpage().resumeUploadPage();
		setImplicitWait(3);
	}

	@Test(priority = 3)

	public void Resumeheadline() throws InterruptedException, IOException {
		ExtentReport_Test.extenttest = extentReports
				.createTest("RESUME HEADLINE TEST" + ":"
						+ Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Naukri Application Testing");
		PageObjectManager.getPageobjectmanager().getResumeheadline().resumeHeadlinePage();
		setImplicitWait(3);
	}

	@Test(priority = 4)

	public void keySkillPage() throws IOException, InterruptedException, AWTException {

		Thread.sleep(2000);
		ExtentReport_Test.extenttest = extentReports
				.createTest(
						"KEY SKILL TEST" + ":" + Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Naukri Application Testing");
		PageObjectManager.getPageobjectmanager().getKeyskillpage().addSkill();
		
		holdimplicit(3);
		
	}

	@Test(priority = 5)
	public void employmentPage() throws InterruptedException, IOException, AWTException {

		PageObjectManager.getPageobjectmanager().getEmployeementPage().employmentyPage();
		Thread.sleep(3000);
	}

	@Test(priority = 6)

	public void educationPage() throws IOException, InterruptedException, AWTException {
		Thread.sleep(4000);
		PageObjectManager.getPageobjectmanager().getEducationpage().addEducation();
	}

	@Test(priority = 7)

	public void itSkillPage() throws IOException, InterruptedException {

		PageObjectManager.getPageobjectmanager().getItskill().itSkillsPage();
	}

	@Test(priority = 8)

	public void projectPage() throws IOException, InterruptedException, AWTException {
		Thread.sleep(5000);
		PageObjectManager.getPageobjectmanager().getProjectspage().projectPage();
		
		holdimplicit(6);
	}

	@Test(priority = 9)
	public void profileHeaderSummary() throws IOException, InterruptedException {

		holdimplicit(7);
		PageObjectManager.getPageobjectmanager().getProfilesummarypage().profileSummary();
	}
	@Test(priority = 10)
	
	public void careerProfilePage() throws InterruptedException {
		
		
		PageObjectManager.getPageobjectmanager().getCareerProfilepage().careerProfilePage();
	}
	@Test(priority = 11)
	
	public void personalPageNaukri() throws InterruptedException {
		
		holdimplicit(4);
		PageObjectManager.getPageobjectmanager().getPersonalPage().personalPage();
	}
	@Test(priority = 12)
	
	public void logOutPage() throws InterruptedException {
		
		holdimplicit(4);
		PageObjectManager.getPageobjectmanager().getLogoutPage().pageLogout();
	}

	@AfterClass

	public void termination() {

		terminate();
	}

	@BeforeSuite
	private void testStart() throws IOException {

		extentReportStart(
				PageObjectManager.getPageobjectmanager().getFilereadermanager().getDataProperty("reportstart"));
	}

	@AfterSuite
	private void testEnd() throws IOException {

		extentReportTearDown(
				PageObjectManager.getPageobjectmanager().getFilereadermanager().getDataProperty("reportend"));
	}

}
